import * as vscode from 'vscode';
import * as fs from "fs";
import { EcoreTreeDataProvider, EcoreModel, EcoreNode } from "./treeview";
import * as path from "path";
import { MyMenuButtonsProvider } from './models/selectFileButton';
import {
	LanguageClient, LanguageClientOptions, ServerOptions, TransportKind
} from 'vscode-languageclient/node';

let client: LanguageClient;
export let file = "";
let model: EcoreModel;
let ecoreTreeDataProvider: EcoreTreeDataProvider;
let treeView: vscode.TreeView<EcoreNode>;

export async function activate(context: vscode.ExtensionContext) {
	// Create the tree view
	client = startLanguageClient(context);

	let menuButtons = new MyMenuButtonsProvider();
	menuButtons.getChildren()?.forEach((button) => {
		button.iconPath = vscode.Uri.file(path.join(context.extensionPath, 'img', 'blue-button.png'));
		button.description = "#0000FF";
	})

	let mytreeView = vscode.window.createTreeView("exampleView", { treeDataProvider: menuButtons });
	context.subscriptions.push(mytreeView);

	// select file button
	context.subscriptions.push(
		vscode.commands.registerCommand("mySelectFileButtonCommand", () => {
			vscode.window
				.showOpenDialog({
					canSelectMany: false,
					openLabel: "Select",
					filters: {
						"Vmsc files": ["*"]
						//"Model files": ["*.model"]
					},
				})
				.then((fileUri) => {
					if (fileUri) {
						// you can use the path of the selected file to read its content
						let filePath = fileUri[0].fsPath;

						// Parse the JSON file and create the tree view nodes
						const workspaceRoot =
							vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length > 0 ? vscode.workspace.workspaceFolders[0].uri.fsPath : undefined;
						if (!workspaceRoot) {
							console.log("ERROR: workspaceRoot is undefined")
							return [];
						}
						const filename = "\\test2.model"

						/*const selectedFile = await vscode.window.showOpenDialog({
							canSelectMany: false,
							filters: {
							'Model files': ['model']
							}
						}); */
						if (filePath == undefined) {
							filePath = workspaceRoot + filename;
						}

						file = filePath;

						context.subscriptions.splice(context.subscriptions.indexOf(mytreeView), 1)
						model = convertJsonToEcoreModel(file);

						ecoreTreeDataProvider = new EcoreTreeDataProvider(model);
						vscode.commands.registerCommand('VMSC.refreshEntry', () => ecoreTreeDataProvider.refresh());

						vscode.window.registerTreeDataProvider('exampleView', ecoreTreeDataProvider);

						treeView = vscode.window.createTreeView('exampleView', { treeDataProvider: ecoreTreeDataProvider });
						context.subscriptions.push(treeView);

						vscodeMDE(context, filePath);
					} else { return []; }
				});
		})
	);

	// create new file button
	context.subscriptions.push(vscode.commands.registerCommand("myCreateFileButtonCommand", () => {
		vscode.window.showInputBox({ placeHolder: "Enter file name" }).then((fileName) => {
			if (fileName) {
				// you can use the path of the selected file to read its content
				let options = {
					canSelectFolders: true,
					canSelectMany: false,
					openLabel: 'Select a folder'
				};

				vscode.window.showOpenDialog(options).then(folderUri => {
					if (folderUri) {
						let folderPath = folderUri[0].fsPath;
						// Use the folderPath variable to create the new file in the selected directory
						console.log(`Selected folder: ${folderPath}`);
						vscode.window.showInformationMessage("New file created: " + folderPath + "\\" + fileName + ".vmsc");
					} else {
						vscode.window.showErrorMessage("The selected folder is not a valid directory. Please select a valid directory.");
						console.log(">>>>> The selected folder is not a valid directory. Please select a valid directory.");
					}
				});
			}
		});
	}));

	//import file button
	context.subscriptions.push(vscode.commands.registerCommand("myImportFileButtonCommand", () => {
		vscode.window.showOpenDialog({
			canSelectMany: false,
			openLabel: "Select",
			filters: {
				"All files": ["*"]
				//"Model files": ["*.ecore"]
			},
		}).then((fileUri) => {
			if (fileUri) {
				// you can use the path of the selected file to read its content
				let filePath = fileUri[0].fsPath;
				let fileName = path.basename(filePath);
				if (fileName.endsWith(".ecore")) {
					vscode.window.showInformationMessage("Imported ecore file: " + filePath);
					console.log("Imported ecore file: " + filePath);
				}
			} else {
				vscode.window.showErrorMessage("The selected file is not an Ecore file. Please select a valid .ecore file.");
				console.log(">>>>> The selected file is not an Ecore file. Please select a valid .ecore file.");
			}
		});
	}));


	//vscodeMDE(context, filePath);
	//vscodeMDE(context);
}

async function vscodeMDE(context: vscode.ExtensionContext, selectFile: string) {
	//// Parse the JSON file and create the tree view nodes
	//const workspaceRoot =
	//vscode.workspace.workspaceFolders &&
	//  vscode.workspace.workspaceFolders.length > 0
	//  ? vscode.workspace.workspaceFolders[0].uri.fsPath
	//  : undefined;
	//if (!workspaceRoot) {
	//	console.log("ERROR: workspaceRoot is undefined")
	//	return [];
	//}
	//const filename = "\\test2.model" 
	//
	///*const selectedFile = await vscode.window.showOpenDialog({
	//	canSelectMany: false,
	//	filters: {
	//	  'Model files': ['model']
	//	}
	//  }); */
	//if(selectFile == undefined){
	//	selectFile = workspaceRoot + filename;
	//}
	//
	//file = selectFile;
	//
	//const vcoreString = fs.readFileSync(selectFile, "utf8");
	//let model = convertJsonToEcoreModel(selectFile);
	//
	//let ecoreTreeDataProvider = new EcoreTreeDataProvider(model);
	//vscode.window.registerTreeDataProvider('exampleView', ecoreTreeDataProvider);
	//
	//const treeView = vscode.window.createTreeView('exampleView', { treeDataProvider: ecoreTreeDataProvider });
	//context.subscriptions.push(treeView);
	//
	//

	//execute command when sleceted from context menu
	context.subscriptions.push(treeView.onDidChangeSelection(async (event) => {
		if (event.selection.length > 0) {
			const selectedNode: EcoreNode = event.selection[0];
			const actions = []

			if (event.selection) {
				switch (selectedNode.type) {
					case 'VModel':
					case 'VPackage':
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Package', command: 'VMSC.addPackage' });
						actions.push({ label: 'Add Class ', command: 'VMSC.addClass' });
						actions.push({ label: 'Add Enumeration', command: 'VMSC.addEnumeration' })
						actions.push({ label: 'Add Data Type', command: 'VMSC.addDataType' })
						break;
					case 'VClass':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						//actions.push({ label: 'Add Association', command: 'VMSC.addAssociation' });
						actions.push({ label: 'Add Super Type', command: 'VMSC.addGeneralization' });
						//actions.push({ label: 'Add Constraint', command: 'VMSC.addConstraint' });
						actions.push({ label: 'Add Attribute', command: 'VMSC.addAttribute' });
						actions.push({ label: 'Add Operation', command: 'VMSC.addOperation' });
						actions.push({ label: 'Add Reference', command: 'VMSC.addReference' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						break;
					case 'VEnumeration':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						actions.push({ label: 'Add Literal', command: 'VMSC.addLiteral' });
						break;
					case 'VDataType':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						break;

					case 'VAttribute':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						break;
					case 'VOperation':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						actions.push({ label: 'Add Parameter', command: 'VMSC.addParameter' });
						break;
					case 'VReference':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						break;
					case 'VAnnotation':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Detail Entry', command: 'VMSC.addDetailEntry' });
						break;

					case 'VDetailEntry':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						break;
					case 'VParameter':
						actions.push({ label: 'Show Properties', command: 'VMSC.openContextMenu' });
						actions.push({ label: 'Rename', command: 'VMSC.rename' });
						actions.push({ label: 'Delete', command: 'VMSC.delete' });
						actions.push({ label: 'Add Annotation', command: 'VMSC.addAnnotation' });
						break;
					default:
						break;
				}
				const result = await vscode.window.showQuickPick(actions);
				if (result) {
					vscode.commands.executeCommand(result.command, selectedNode);
				}
			}
		}
	}));

	//
	// Listen for when the file is saved
	vscode.workspace.onDidSaveTextDocument(event => {
		// Check if the saved file is the one that the tree view is reading from
		if (event.fileName === selectFile) {
			// Refresh the tree view
			vscode.window.showErrorMessage(`File has changed manually. Please reupload it again to take the changes into consideration.`);
			//treeView.reveal(treeView.selection[0], { select: true, focus: true });
		}
	});

	let commandName;
	const existingCommands = await vscode.commands.getCommands();


	//rename node
	commandName = 'VMSC.rename'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			const result = await vscode.window.showInputBox({ prompt: `Rename ${node.getName()}` });
			if (result) {
				node.setName(result);
				ecoreTreeDataProvider?.getonDidChangeTreeData().fire;
				vscode.window.showInformationMessage(`Renamed node to ${node.getName()}`);

				//save changes to json
				saveRenameDeleteChangesToJSON("rename", node);
			}
		}));
	}

	//delete node
	commandName = 'VMSC.delete'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Delete ${node.getName()}`);
			const hasparent = node.getParent();
			if (hasparent) {
				const index = hasparent.getChildren().indexOf(node);
				hasparent.getChildren().splice(index, 1);
			}
			else {
				//delete node
				const index = model.rootNodes.indexOf(node);
				//console.log(index)
				if (0 <= index && index < model.rootNodes.length) model.rootNodes.splice(index, 1);
			}
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveRenameDeleteChangesToJSON("delete", node, hasparent);

			//show select file button if model is empty
			if (model.rootNodes.length == 0) {
				vscode.window.showErrorMessage("No model found");

				// unregister tree data provider
				vscode.window.registerTreeDataProvider('exampleView', new MyMenuButtonsProvider());
				// re-register command for "Select File" button 

				const mySelectFileButtonCommand = 'mySelectFileButtonCommand';


				if (existingCommands.includes(mySelectFileButtonCommand)) {
					context.subscriptions.splice(context.subscriptions.indexOf(treeView), 1)
					vscode.commands.executeCommand(mySelectFileButtonCommand)
				}

				else {
					context.subscriptions.push(vscode.commands.registerCommand(mySelectFileButtonCommand, () => {
						vscode.window
							.showOpenDialog({
								canSelectMany: false,
								openLabel: "Select",
								filters: {
									"All files": ["*"]
									//"Model files": ["*.model"]
								},
							})
							.then((fileUri) => {
								if (fileUri) {
									// you can use the path of the selected file to read its content
									const filePath = fileUri[0].fsPath;

									file = filePath;

									context.subscriptions.splice(context.subscriptions.indexOf(treeView), 1)
									model = convertJsonToEcoreModel(filePath);

									ecoreTreeDataProvider = new EcoreTreeDataProvider(model);
									vscode.window.registerTreeDataProvider('exampleView', ecoreTreeDataProvider);

									treeView = vscode.window.createTreeView('exampleView', { treeDataProvider: ecoreTreeDataProvider });
									context.subscriptions.push(treeView);

									vscodeMDE(context, filePath);

								}
							});
					}));
				}
			}
		}));
	}

	//add package
	commandName = 'VMSC.addPackage'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Package`);
			const newname = await vscode.window.showInputBox({ prompt: `New Package Name: ` });
			let newPackage = new EcoreNode('VPackage', newname ? newname : 'New Package');
			newPackage.setParent(node);
			node.getChildren().push(newPackage);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newPackage);
		}));
	}


	//add Class
	commandName = 'VMSC.addClass'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Class`);
			const newname = await vscode.window.showInputBox({ prompt: `New Class Name: ` });
			let newClass = new EcoreNode('VClass', newname ? newname : 'New Class');
			newClass.setParent(node);
			node.getChildren().push(newClass);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newClass);
		}));
	}

	//add enumeration
	commandName = 'VMSC.addEnumeration'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Enumeration`);
			const newname = await vscode.window.showInputBox({ prompt: `New Enumeration Name: ` });
			let newEnumeration = new EcoreNode('VEnumeration', newname ? newname : 'New Enumeration');
			newEnumeration.setParent(node);
			node.getChildren().push(newEnumeration);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newEnumeration);
		}));
	}

	//add date type
	commandName = 'VMSC.addDataType'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Date Type`);
			const newname = await vscode.window.showInputBox({ prompt: `New EDataType Name: ` });
			let newEDataType = new EcoreNode('VDataType', newname ? newname : 'New EDataType');
			newEDataType.setParent(node);
			node.getChildren().push(newEDataType);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newEDataType);
		}));
	}


	//add attribute
	commandName = 'VMSC.addAttribute'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Attribute`);
			const newname = await vscode.window.showInputBox({ prompt: `New Attribute Name: ` });
			let newAttribute = new EcoreNode('VAttribute', newname ? newname : 'New Attribute');
			newAttribute.setParent(node);
			node.getChildren().push(newAttribute);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newAttribute);
		}));
	}

	//add operation
	commandName = 'VMSC.addOperation'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Operation`);
			const newname = await vscode.window.showInputBox({ prompt: `New Operation Name: ` });
			let newOperation = new EcoreNode('VOperation', newname ? newname : 'New Operation');
			newOperation.setParent(node);
			node.getChildren().push(newOperation);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newOperation);
		}));
	}

	//add annotation
	commandName = 'VMSC.addAnnotation'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Annotation`);
			const newname = await vscode.window.showInputBox({ prompt: `New Annotation Name: ` });
			let newAnnotation = new EcoreNode('VAnnotation', newname ? newname : 'New Annotation');
			newAnnotation.setParent(node);
			node.getChildren().push(newAnnotation);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newAnnotation);
		}));
	}

	//add literal
	commandName = 'VMSC.addLiteral'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Literal`);
			const newname = await vscode.window.showInputBox({ prompt: `New Literal Name: ` });
			let newLiteral = new EcoreNode('VLiteral', newname ? newname : 'New Literal');
			newLiteral.setParent(node);
			node.getChildren().push(newLiteral);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newLiteral);
		}));
	}

	//add reference
	commandName = 'VMSC.addReference'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Reference`);
			const newname = await vscode.window.showInputBox({ prompt: `New Reference Name: ` });
			let newReference = new EcoreNode('VReference', newname ? newname : 'New Reference');
			newReference.setParent(node);
			node.getChildren().push(newReference);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newReference);
		}));
	}



	//add parameter
	commandName = 'VMSC.addParameter'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Parameter`);
			const newname = await vscode.window.showInputBox({ prompt: `New Parameter Name: ` });
			let newParameter = new EcoreNode('VParameter', newname ? newname : 'New Parameter');
			newParameter.setParent(node);
			node.getChildren().push(newParameter);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newParameter);
		}));
	}
	// add DetailEntry
	commandName = 'VMSC.addDetailEntry'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Reference`);
			const newname = await vscode.window.showInputBox({ prompt: `New Detail Entry: ` });
			let newDetailEntry = new EcoreNode('VDetailEntry', newname ? newname : 'New DetailEntry');
			newDetailEntry.setParent(node);
			node.getChildren().push(newDetailEntry);
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//save changes to json
			saveAddChangesToJSON(newDetailEntry);
		}));
	}



	//add association
	commandName = 'VMSC.addAssociation'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Association`);

			ecoreTreeDataProvider.getonDidChangeTreeData().fire;
		}));
	}
	//add super type
	commandName = 'VMSC.addGeneralization'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, async (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Super Type`);
			//const newname = await vscode.window.showInputBox({ prompt: `Super : ` });

			/*	let newParameter = new EcoreNode('VParameter', newname? newname: 'New Parameter');
				newParameter.setParent(node);
				node.getChildren().push(newParameter);*/
			ecoreTreeDataProvider.getonDidChangeTreeData().fire;

			//let supertypes = [];
			//supertypes = getAllAvailableSuperTypes();
			//supertypes.push({ command: '1', label: 'class1' });
			//const result = await vscode.window.showQuickPick(supertypes);

			//console.log(result);


			//save changes to json
			//saveAddChangesToJSON(newParameter);
		}));
	}
	//add constraint
	commandName = 'VMSC.addConstraint'
	if (!existingCommands.includes(commandName)) {
		context.subscriptions.push(vscode.commands.registerCommand(commandName, (node: EcoreNode) => {
			vscode.window.showInformationMessage(`Add Constraint`);

			ecoreTreeDataProvider.getonDidChangeTreeData().fire;
		}));
	}
}

export function deactivate(): Thenable<void> | undefined {
	if (client) {
		return client.stop();
	}
	return undefined;
}


function startLanguageClient(context: vscode.ExtensionContext): LanguageClient {
	const serverModule = context.asAbsolutePath(path.join('out', 'language-server', 'main'));
	// The debug options for the server
	// --inspect=6009: runs the server in Node's Inspector mode so VS Code can attach to the server for debugging.
	// By setting `process.env.DEBUG_BREAK` to a truthy value, the language server will wait until a debugger is attached.
	const debugOptions = { execArgv: ['--nolazy', `--inspect${process.env.DEBUG_BREAK ? '-brk' : ''}=${process.env.DEBUG_SOCKET || '6009'}`] };

	// If the extension is launched in debug mode then the debug server options are used
	// Otherwise the run options are used
	const serverOptions: ServerOptions = {
		run: { module: serverModule, transport: TransportKind.ipc },
		debug: { module: serverModule, transport: TransportKind.ipc, options: debugOptions }
	};

	const fileSystemWatcher = vscode.workspace.createFileSystemWatcher('**/*.vmsc');//HERE
	context.subscriptions.push(fileSystemWatcher);

	// Options to control the language client
	const clientOptions: LanguageClientOptions = {
		documentSelector: [{ scheme: 'file', language: 'vmsc' }],
		synchronize: {
			// Notify the server about file changes to files contained in the workspace
			fileEvents: fileSystemWatcher
		}
	};

	// Create the language client and start the client.
	const client = new LanguageClient(
		'vmsc',
		'Vmsc',
		serverOptions,
		clientOptions
	);

	// Start the client. This will also launch the server
	client.start();
	return client;
}

function convertJsonToEcoreModel(selectFile: string): EcoreModel {
	if (pathExists(selectFile!) && selectFile) {
		const vcoreString = fs.readFileSync(selectFile, "utf8");
		//const vcoreString = fs.readFileSync(selectedFile[0].fsPath, "utf8");

		console.log(vcoreString);
		try {
			const json = JSON.parse(vcoreString);

			// const vcoreModel = this.convertJsonToModel(vcoreJson);
			if (!json) {
				vscode.window.showErrorMessage("JSON undefined");
				console.log("JSON undefined : " + json);
				return new EcoreModel([]);
			}
			else {
				const model = transformJsonToTree(json);
				return model;
			}
		} catch (error) {
			vscode.window.showErrorMessage("An error occurred while parsing the JSON file");

			return new EcoreModel([]);
		}
	} else {
		return new EcoreModel([
			new EcoreNode('VModel', 'EModel', [
				new EcoreNode('VPackage', 'Package 1', [
					new EcoreNode('VClass', 'My Class', [
						new EcoreNode('VAttribute', 'My Attribute'),
						new EcoreNode('VReference', 'My Reference'),
						new EcoreNode('VDataType', 'My Data Type'),
					])
				]),
				new EcoreNode('VPackage', 'Package 2')]),
		]);
	}

}

function transformJsonToTree(json: any): EcoreModel {
	// create the root EModel node
	let key = getChildKey(json)
	let name = json[key].name

	let root = new EcoreNode('VModel', name);
	root.setId(json[key].id);

	//console.log(json.VModel)
	//console.log(json.VModel.VPackages)

	// create a recursive function to traverse the json object
	function parseJson(node: EcoreNode, json: any) {
		// if the json object has a "VPackage" property, recursively parse it
		if (json.hasOwnProperty("VModel") && json.VModel.hasOwnProperty("VPackages")) {
			json.VModel.VPackages.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}

		// if the json object has a "VPackage" property, recursively parse it
		if (json.hasOwnProperty("VPackage") && json.VPackage.hasOwnProperty("VComponents")) {
			json.VPackage.VComponents.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}
		// if the json object has a "VClass" property, recursively parse it
		if (json.hasOwnProperty("VClass")) {
			if (json.VClass.hasOwnProperty("VStructuralFeatures")) {
				json.VClass.VStructuralFeatures.forEach((child: any) => {
					let child_key = getChildKey(child)
					let child_name = child[child_key].name
					let childNode = new EcoreNode(child_key, child_name);
					childNode.setId(child[child_key].id);
					childNode.setParent(node);
					node.getChildren().push(childNode);
					parseJson(childNode, child);
				});
			}
			if (json.VClass.hasOwnProperty("VSuperType")) {
				json.VClass.VSuperType.forEach((child: any) => {
					let child_key = getChildKey(child)
					let child_name = child[child_key].name
					let childNode = new EcoreNode(child_key, child_name);
					childNode.setId(child[child_key].id);
					childNode.setParent(node);
					node.getChildren().push(childNode);
					parseJson(childNode, child);
				});
			}
		}

		// if the json object has a "VDatatype" property, recursively parse it
		if (json.hasOwnProperty("VDatatype") && json.VDatatype.hasOwnProperty("VTypes")) {
			json.VDatatype.VTypes.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}
		// if the json object has a "VEnumeration" property, recursively parse it
		if (json.hasOwnProperty("VEnumeration") && json.VEnumeration.hasOwnProperty("VEnumerationLiterals")) {
			json.VEnumeration.VEnumerationLiterals.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}

		// if the json object has a "VAttribute" property, add it as a child
		if (json.hasOwnProperty("VAttribute") && json.VAttribute.hasOwnProperty("VStructuralAnnotations")) {
			json.VAttribute.VStructuralAnnotations.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
			});
		}
		// if the json object has a "VReference" property, recursively parse it
		if (json.hasOwnProperty("VReference") && json.VReference.hasOwnProperty("VStructuralAnnotations")) {
			json.VReference.VStructuralAnnotations.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}

		// if the json object has a "VOperation" property, recursively parse it
		if (json.hasOwnProperty("VOperation")) {
			if (json.VOperation.hasOwnProperty("VStructuralAnnotations")) {
				json.VOperation.VStructuralAnnotations.forEach((child: any) => {
					let child_key = getChildKey(child)
					let child_name = child[child_key].name
					let childNode = new EcoreNode(child_key, child_name);
					childNode.setId(child[child_key].id);
					childNode.setParent(node);
					node.getChildren().push(childNode);
					parseJson(childNode, child);
				});
			}
			if (json.VOperation.hasOwnProperty("VParameters")) {
				json.VOperation.VParameters.forEach((child: any) => {
					let child_key = getChildKey(child)
					let child_name = child[child_key].name
					let childNode = new EcoreNode(child_key, child_name);
					childNode.setId(child[child_key].id);
					childNode.setParent(node);
					node.getParameters()?.push(childNode);
					node.getChildren().push(childNode);
					parseJson(childNode, child);
				});
			}
		}
		// if the json object has a "VAnnotation" property, recursively parse it
		if (json.hasOwnProperty("VAnnotation") && json.VAnnotation.hasOwnProperty("VStructuralAnnotations")) {
			json.VAnnotation.VStructuralAnnotations.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}
		// if the json object has a "VLiteral" property, recursively parse it
		if (json.hasOwnProperty("VLiteral") && json.VLiteral.hasOwnProperty("VStructuralAnnotations")) {
			json.VLiteral.VStructuralAnnotations.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}
		// if the json object has a "VParameter" property, recursively parse it
		if (json.hasOwnProperty("VParameter") && json.VParameter.hasOwnProperty("VStructuralAnnotations")) {
			json.VParameter.VStructuralAnnotations.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
				let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				childNode.setParent(node);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});
		}
		// if the json object has a "VDetailEntry" property, recursively parse it
		if (json.hasOwnProperty("VDetailEntry")) {
		}

		// if the json object has a "VGeneralization" property, recursively parse it
		if (json.hasOwnProperty("VGeneralization")) {
			/*	json.references.forEach((child: any) => {
					let child_key = getChildKey(child)
					let child_name = child[child_key].name
						let childNode = new EcoreNode(child_key, child_name);
					childNode.setId(child[child_key].id);
					node.getChildren().push(childNode);
					parseJson(childNode, child);
				});*/
		}
		// if the json object has a "VAssociation" property, recursively parse it
		if (json.hasOwnProperty("VAssociation")) {
			/*json.references.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
					let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			}); */
		}
		// if the json object has a "constraints" property, recursively parse it
		if (json.hasOwnProperty("VConstraints")) {
			/*json.constraints.forEach((child: any) => {
				let child_key = getChildKey(child)
				let child_name = child[child_key].name
					let childNode = new EcoreNode(child_key, child_name);
				childNode.setId(child[child_key].id);
				node.getChildren().push(childNode);
				parseJson(childNode, child);
			});*/
		}
	}

	// call the recursive function to traverse the json object
	parseJson(root, json);
	return new EcoreModel([root]);
}
function pathExists(p: string): boolean {
	try {
		fs.accessSync(p);
	} catch (err) {
		return false;
	}

	return true;
}

function getChildKey(child: any) {
	return Object.keys(child)[0] as 'VModel' | 'VPackage' | 'VClass' | 'VDataType' | 'VEnumeration' |
		'VAttribute' | 'VReference' | 'VOperation' | 'VAnnotation' | 'VLiteral' |
		'VParameter' | 'VDetailEntry';
}

function saveAddChangesToJSON(changedNode: EcoreNode) {
	if (pathExists(file!) && file) {
		const vcoreString = fs.readFileSync(file, "utf8");
		let json = JSON.parse(vcoreString);

		//different json structure depending on the type of node

		let key = changedNode.type;
		let newChild;
		switch (changedNode.type) {
			case "VModel":
				break;
			case "VPackage":
				const newPackage = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VPrefix": "${changedNode.getName()}",
						"VUri": "myUri",
						"VComponents": []
					}
				}`;

				newChild = JSON.parse(newPackage)
				addChildNode(json, newChild, changedNode)
				break;
			case "VClass":
				const newClassJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VStructuralFeatures": [],
                        "VSuperType" : []
					}
				}`;

				newChild = JSON.parse(newClassJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VDataType":
				const newataTypeJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VTypes": []
					}
				}`;

				newChild = JSON.parse(newataTypeJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VEnumeration":
				const newEnumerationJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VStructuralFeatures": []
					}
				}`;

				newChild = JSON.parse(newEnumerationJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VAttribute":
				const newAttributeJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"LowerBound": 0 ,
						"UpperBound": 0 ,
						"VType": "int" ,
						"VContent": 0,
						"VStructuralAnnotations": []
					}
				}`;

				newChild = JSON.parse(newAttributeJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VReference":
				const newReferenceJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VContent": 0,
						"VStructuralAnnotations": []
					}
				}`;

				newChild = JSON.parse(newReferenceJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VOperation":
				const newOperationJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"return": "void" ,
						"VParameters": [] ,
						"VStructuralFeatures": []
					}
				}`;
				newChild = JSON.parse(newOperationJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VAnnotation":
				const newAnnotationJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VContent": 0,
						"VStructuralAnnotations": []
					}
				}`;

				newChild = JSON.parse(newAnnotationJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VLiteral":
				const newiteralJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VContent": 0,
						"VStructuralAnnotations": []
					}
				}`;

				newChild = JSON.parse(newiteralJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VParameter":
				const newParameterJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"VType": "int" ,
						"VContent": 0,
						"VStructuralAnnotations": []
					}
				}`;

				newChild = JSON.parse(newParameterJSON);
				addChildNode(json, newChild, changedNode)
				break;
			case "VDetailEntry":
				const newDetailEntryJSON = `{
					"${key}": {
						"id": "${changedNode.getId()}",
						"name": "${changedNode.getName()}",
						"key" : "" ,
						"VContent": 0
					}
				}`;

				newChild = JSON.parse(newDetailEntryJSON);
				addChildNode(json, newChild, changedNode)
				break;
			default:
				break;
		}


		//write in File
		fs.writeFile(file, JSON.stringify(json, null, 4), 'utf8', (err) => {
			if (err) {
				console.error(err);
				return;
			}
			console.log('JSON data has been written to file successfully.');
		});
	}
}

function saveRenameDeleteChangesToJSON(operation: string, changedNode: EcoreNode, parentNode?: EcoreNode) {
	if (pathExists(file!) && file) {
		const vcoreString = fs.readFileSync(file, "utf8");
		let json = JSON.parse(vcoreString);

		//different json structure depending on the type of node
		switch (operation) {
			case "rename":
				json = renameNode(json, changedNode);
				break;
			case "delete":
				json = deleteNode(json, changedNode);
				break;
			default:
				break;
		}

		//write in File
		fs.writeFile(file, JSON.stringify(json, null, 4), 'utf8', (err) => {
			if (err) {
				console.error(err);
				return;
			}
			console.log('JSON data has been written to file successfully.');
		});
	}
}

function renameNode(json: any, node: EcoreNode): any {
	let jsonID = getJsonID(json);
	if (jsonID === node.getId()) {
		console.log("found")
		setJsonName(json, node.getName());
	}
	else {
		if (json.hasOwnProperty("VModel") && json.VModel.hasOwnProperty("VPackages")) {
			for (let childJSON of json.VModel.VPackages) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VPackage") && json.VPackage.hasOwnProperty("VComponents")) {
			for (let childJSON of json.VPackage.VComponents) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VClass") && json.VClass.hasOwnProperty("VStructuralFeatures")) {
			for (let childJSON of json.VClass.VStructuralFeatures) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VDataType") && json.VDataType.hasOwnProperty("VTypes")) {
			for (let childJSON of json.VDataType.VTypes) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VEnumeration") && json.VEnumeration.hasOwnProperty("VEnumerationLiterals")) {
			for (let childJSON of json.VClass.VEnumerationLiterals) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VAttribute") && json.VAttribute.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VAttribute.VStructuralAnnotations) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VOperation") && json.VOperation.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VOperation.VStructuralAnnotations) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VOperation") && json.VOperation.hasOwnProperty("VParameters")) {
			for (let childJSON of json.VOperation.VParameters) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VReference") && json.VReference.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VReference.VStructuralAnnotations) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VLiteral") && json.VLiteral.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VLiteral.VStructuralAnnotations) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VAnnotation") && json.VAnnotation.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VAnnotation.VStructuralAnnotations) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VParameter") && json.VParameter.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VParameter.VStructuralAnnotations) {
				childJSON = renameNode(childJSON, node);
			}
		}
		else {
			console.log("not found");
		}
	}
	return json;
}

function getJsonID(json: any) {
	let jsonID = "";
	if (json.hasOwnProperty("VModel"))
		jsonID = json.VModel.id;
	else if (json.hasOwnProperty("VPackage"))
		jsonID = json.VPackage.id;
	else if (json.hasOwnProperty("VClass"))
		jsonID = json.VClass.id;
	else if (json.hasOwnProperty("VDataType"))
		jsonID = json.VDataType.id;
	else if (json.hasOwnProperty("VEnumeration"))
		jsonID = json.VEnumeration.id;

	else if (json.hasOwnProperty("VAttribute"))
		jsonID = json.VAttribute.id;
	else if (json.hasOwnProperty("VOperation"))
		jsonID = json.VOperation.id;
	else if (json.hasOwnProperty("VReference"))
		jsonID = json.VReference.id;
	else if (json.hasOwnProperty("VAnnotation"))
		jsonID = json.VAnnotation.id;
	else if (json.hasOwnProperty("VLiteral"))
		jsonID = json.VLiteral.id;
	else if (json.hasOwnProperty("VParameter"))
		jsonID = json.VParameter.id;
	else if (json.hasOwnProperty("VDetailEntry"))
		jsonID = json.VDetailEntry.id;

	return jsonID;
}

function setJsonName(json: any, newName: string) {
	if (json.hasOwnProperty("VModel"))
		json.VModel.name = newName;
	else if (json.hasOwnProperty("VPackage"))
		json.VPackage.name = newName;
	else if (json.hasOwnProperty("VClass"))
		json.VClass.name = newName;
	else if (json.hasOwnProperty("VDataType"))
		json.VDataType.name = newName;
	else if (json.hasOwnProperty("VEnumeration"))
		json.VEnumeration.name = newName;

	else if (json.hasOwnProperty("VAttribute"))
		json.VAttribute.name = newName;
	else if (json.hasOwnProperty("VOperation"))
		json.VOperation.name = newName;
	else if (json.hasOwnProperty("VReference"))
		json.VReference.name = newName;
	else if (json.hasOwnProperty("VAnnotation"))
		json.VAnnotation.name = newName;
	else if (json.hasOwnProperty("VLiteral"))
		json.VLiteral.name = newName;
	else if (json.hasOwnProperty("VParameter"))
		json.VParameter.name = newName;
	else if (json.hasOwnProperty("VDetailEntry"))
		json.VDetailEntry.name = newName;
}

function deleteNode(json: any, node: EcoreNode) {
	let jsonID = getJsonID(json);
	let found = false;
	if (jsonID === node.getId()) {
		console.log("found")
		//if(node.type == "VModel"){
		//	delete json["VPackage"];
		//}		 
		//else
		delete json[node.type];
	}
	else {
		if (json.hasOwnProperty("VModel") && json.VPackage.hasOwnProperty("VPackages")) {
			for (let childJSON of json.VModel.VPackage) {
				childJSON = deleteNode(childJSON, node);
				if (found)
					break;
			}
		}
		else if (json.hasOwnProperty("VPackage") && json.VPackage.hasOwnProperty("VComponents")) {
			for (let childJSON of json.VPackage.VComponents) {
				childJSON = deleteNode(childJSON, node);
				if (found)
					break;
			}
		}
		else if (json.hasOwnProperty("VClass") && json.VClass.hasOwnProperty("VStructuralFeatures")) {
			for (let childJSON of json.VClass.VStructuralFeatures) {
				childJSON = deleteNode(childJSON, node);
				if (found)
					break;
			}
		}
		else if (json.hasOwnProperty("VDataType") && json.VDataType.hasOwnProperty("VTypes")) {
			for (let childJSON of json.VDataType.VTypes) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VEnumeration") && json.VEnumeration.hasOwnProperty("VEnumerationLiterals")) {
			for (let childJSON of json.VClass.VEnumerationLiterals) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VAttribute") && json.VAttribute.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VAttribute.VStructuralAnnotations) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VOperation") && json.VOperation.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VOperation.VStructuralAnnotations) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VOperation") && json.VOperation.hasOwnProperty("VParameters")) {
			for (let childJSON of json.VOperation.VParameters) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VReference") && json.VReference.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VReference.VStructuralAnnotations) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VLiteral") && json.VLiteral.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VLiteral.VStructuralAnnotations) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VAnnotation") && json.VAnnotation.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VAnnotation.VStructuralAnnotations) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else if (json.hasOwnProperty("VParameter") && json.VParameter.hasOwnProperty("VStructuralAnnotations")) {
			for (let childJSON of json.VParameter.VStructuralAnnotations) {
				childJSON = deleteNode(childJSON, node);
			}
		}
		else {
			console.log("ERROR DELETE: not found");
		}
	}
	//remove empty {} from json
	cleanJSON(json)

	//console.log("deleteNode in  json " + node.getID() );
	//console.log(json);
	return json;
}

function cleanJSON(json: any) {
	if (json.hasOwnProperty("VModel"))
		json.VModel.VPackages = json.VModel.VPackages.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VPackage"))
		json.VPackage.VComponents = json.VPackage.VComponents.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VClass"))
		json.VClass.VStructuralFeatures = json.VClass.VStructuralFeatures.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VDataType"))
		json.VDataType.VTypes = json.VDataType.VTypes.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VEnumeration"))
		json.VEnumeration.VStructuralFeatures = json.VEnumeration.VStructuralFeatures.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VAttribute") && json.VAttribute.hasOwnProperty("VStructuralAnnotations"))
		json.VAttribute.VStructuralAnnotations = json.VAttribute.VStructuralAnnotations.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VOperation")) {
		if (json.VOperation.hasOwnProperty("VStructuralAnnotations")) {
			json.VOperation.VStructuralAnnotations = json.VOperation.VStructuralAnnotations.filter((elem: {}) => Object.keys(elem).length !== 0);
		}
		if (json.VOperation.hasOwnProperty("VParameters")) {
			json.VOperation.VParameters = json.VOperation.VParameters.filter((elem: {}) => Object.keys(elem).length !== 0);
		}
	}
	else if (json.hasOwnProperty("VReference") && json.VReference.hasOwnProperty("VStructuralAnnotations"))
		json.VReference.VStructuralAnnotations = json.VReference.VStructuralAnnotations.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VAnnotation") && json.VAnnotation.hasOwnProperty("VStructuralAnnotations"))
		json.VAnnotation.VStructuralAnnotations = json.VAnnotation.VStructuralAnnotations.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VLiteral") && json.VLiteral.hasOwnProperty("VStructuralAnnotations"))
		json.VLiteral.VStructuralAnnotations = json.VLiteral.VStructuralAnnotations.filter((elem: {}) => Object.keys(elem).length !== 0);
	else if (json.hasOwnProperty("VParameter") && json.VParameter.hasOwnProperty("VStructuralAnnotations"))
		json.VParameter.VStructuralAnnotations = json.VParameter.VStructuralAnnotations.filter((elem: {}) => Object.keys(elem).length !== 0);
}

function addChildNode(json: any, child: any, node: EcoreNode): any {
	if (!node.getParent()) {
		console.log("ERROR ADD: no parent");
		return;
	}

	let jsonID = getJsonID(json);
	if (jsonID === node.getParent()?.getId()) {
		//console.log("found")
		//push child to parent
		pushChild(json, child, node);

	}
	else {
		if (json.hasOwnProperty("VModel")) {
			if (json.VPackage.hasOwnProperty("VPackages")) {
				for (let childJSON of json.VModel.VPackages) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VModel.VPackages = [];
			}
		}
		else if (json.hasOwnProperty("VPackage")) {
			if (json.VPackage.hasOwnProperty("VComponents")) {
				for (let childJSON of json.VPackage.VComponents) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VPackage.VComponents = [];
			}
		}
		else if (json.hasOwnProperty("VClass")) {
			if (json.VClass.hasOwnProperty("VStructuralFeatures")) {
				for (let childJSON of json.VClass.VStructuralFeatures) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VClass.VStructuralFeatures = [];
			}
		}
		else if (json.hasOwnProperty("VDataType")) {
			if (json.VDataType.hasOwnProperty("VTypes")) {
				for (let childJSON of json.VDataType.VTypes) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VDataType.VTypes = [];
			}
		}
		else if (json.hasOwnProperty("VEnumeration")) {
			if (json.VEnumeration.hasOwnProperty("VEnumerationLiterals")) {
				for (let childJSON of json.VClass.VEnumerationLiterals) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VEnumeration.VEnumerationLiterals = [];
			}
		}
		else if (json.hasOwnProperty("VAttribute")) {
			if (json.VAttribute.hasOwnProperty("VStructuralAnnotations")) {
				for (let childJSON of json.VAttribute.VStructuralAnnotations) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VAttribute.VStructuralAnnotations = [];
			}
		}
		else if (json.hasOwnProperty("VOperation")) {
			if (json.VOperation.hasOwnProperty("VStructuralAnnotations")) {
				for (let childJSON of json.VOperation.VStructuralAnnotations) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VOperation.VStructuralAnnotations = [];
			}
		}
		else if (json.hasOwnProperty("VOperation")) {
			if (json.VOperation.hasOwnProperty("VParameters")) {
				for (let childJSON of json.VOperation.VParameters) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VOperation.VParameters = [];
			}
		}
		else if (json.hasOwnProperty("VReference")) {
			if (json.VReference.hasOwnProperty("VStructuralAnnotations")) {
				for (let childJSON of json.VReference.VStructuralAnnotations) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VReference.VStructuralAnnotations = [];
			}
		}
		else if (json.hasOwnProperty("VLiteral")) {
			if (json.VLiteral.hasOwnProperty("VStructuralAnnotations")) {
				for (let childJSON of json.VLiteral.VStructuralAnnotations) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VLiteral.VStructuralAnnotations = [];
			}
		}
		else if (json.hasOwnProperty("VAnnotation")) {
			if (json.VAnnotation.hasOwnProperty("VStructuralAnnotations")) {
				for (let childJSON of json.VAnnotation.VStructuralAnnotations) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VAnnotation.VStructuralAnnotations = [];
			}
		}
		else if (json.hasOwnProperty("VParameter")) {
			if (json.VParameter.hasOwnProperty("VStructuralAnnotations")) {
				for (let childJSON of json.VParameter.VStructuralAnnotations) {
					childJSON = addChildNode(childJSON, child, node);
				}
			}
			else {
				json.VParameter.VStructuralAnnotations = [];
			}
		}
		else {
			console.log("not found");
		}
	}
	return json;
}

function pushChild(json: any, child: any, node: EcoreNode) {
	if (json.hasOwnProperty("VModel"))
		json.VModel.VPackages.push(child);
	else if (json.hasOwnProperty("VPackage"))
		json.VPackage.VComponents.push(child);
	else if (json.hasOwnProperty("VClass"))
		json.VClass.VStructuralFeatures.push(child);
	else if (json.hasOwnProperty("VDataType"))
		json.VDataType.VTypes.push(child);
	else if (json.hasOwnProperty("VEnumeration"))
		json.VEnumeration.VStructuralFeatures.push(child);
	else if (json.hasOwnProperty("VAttribute") && json.VAttribute.hasOwnProperty("VStructuralAnnotations"))
		json.VAttribute.VStructuralAnnotations.push(child);
	else if (json.hasOwnProperty("VOperation")) {
		if (json.VOperation.hasOwnProperty("VParameters") && node.type == "VParameter") {
			json.VOperation.VParameters.push(child);
		}
		else if (json.VOperation.hasOwnProperty("VStructuralAnnotations")) {
			json.VOperation.VStructuralAnnotations.push(child);
		}

	}
	else if (json.hasOwnProperty("VReference") && json.VReference.hasOwnProperty("VStructuralAnnotations"))
		json.VReference.VStructuralAnnotations.push(child);
	else if (json.hasOwnProperty("VAnnotation") && json.VAnnotation.hasOwnProperty("VStructuralAnnotations"))
		json.VAnnotation.VStructuralAnnotations.push(child);
	else if (json.hasOwnProperty("VLiteral") && json.VLiteral.hasOwnProperty("VStructuralAnnotations"))
		json.VLiteral.VStructuralAnnotations.push(child);
	else if (json.hasOwnProperty("VParameter") && json.VParameter.hasOwnProperty("VStructuralAnnotations"))
		json.VParameter.VStructuralAnnotations.push(child);
}

// function getAllAvailableSuperTypes(json: any) {
// 	const supertypes = [];
// 	if (json.hasOwnProperty("VModel") && json.VModel.hasOwnProperty("VPackages")) {
// 		for (let childJSON of json.VModel.VPackages) {
// 			childJSON = getAllAvailableSuperTypes(childJSON);
// 		}
// 	}
// 	else if (json.hasOwnProperty("VPackage") && json.VPackage.hasOwnProperty("VComponents")) {
// 		for (let childJSON of json.VPackage.VComponents) {
// 			if (childJSON.hasOwnProperty("VClass")) {
// 				supertypes.push(
// 					{
// 						label: `${childJSON.VClass.nom}`,
// 						command: `${childJSON.VClass.id}`
// 					}
// 				);
// 			}
// 			else if (childJSON.hasOwnProperty("VPackage") && json.VPackage.hasOwnProperty("VComponents")) {
// 				childJSON = getAllAvailableSuperTypes(childJSON);
// 			}
// 		}
// 	}
// 	return supertypes;
// }