import * as vscode from "vscode";
import { EcoreTreeDataProvider, EcoreModel, EcoreNode } from "./treeview";

export function activate(context: vscode.ExtensionContext) {
	const model = new EcoreModel([
		new EcoreNode('EPackage', 'Package 1', [
			new EcoreNode('EClass', 'Class 1', [
				new EcoreNode('EAttribute', 'Attribute 1')
			])
		]),
		new EcoreNode('EPackage', 'Package 2', [
			new EcoreNode('EClass', 'Class 2')
		]),
	]);

	const ecoreTreeDataProvider = new EcoreTreeDataProvider(model);
	vscode.window.registerTreeDataProvider('exampleView', ecoreTreeDataProvider);


	const treeView = vscode.window.createTreeView('exampleView', { treeDataProvider: ecoreTreeDataProvider });
	context.subscriptions.push(treeView);

	//show context menu
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.openContextMenu', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`ContextMenu for node ${node.getName()}`);
	}));

	//execute command when sleceted from context menu
	context.subscriptions.push(treeView.onDidChangeSelection(async (event) => {
        if (event.selection.length > 0) {
			const selectedNode: EcoreNode = event.selection[0];
			if(event.selection){
			const actions = [
				{ label: 'Show Properties', command: 'VMSC.openContextMenu' },
				{ label: 'Rename', command: 'VMSC.rename' },
				{ label: 'Delete', command: 'VMSC.delete' },
				{ label: 'Add Package', command: 'VMSC.addPackage' },
				{ label: 'Add Class ', command: 'VMSC.addClass' },
				{ label: 'Add Association', command: 'VMSC.addAssociation' },
				{ label: 'Add Generalization', command: 'VMSC.addGeneralization' },
				{ label: 'Add Enumeration', command: 'VMSC.addEnumeration' },
				{ label: 'Add Literal', command: 'VMSC.addLiteral' },
				{ label: 'Add Date Type', command: 'VMSC.addDateType' },
				{ label: 'Add Attribute', command: 'VMSC.addAttribute' },
				{ label: 'Add Operation', command: 'VMSC.addOperation' },
				{ label: 'Add Annotation', command: 'VMSC.addAnnotation' }
				
			];
			const result = await vscode.window.showQuickPick(actions);
			if (result) {
				vscode.commands.executeCommand(result.command, selectedNode);
			}
		}
		}
	}));

	//rename node
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.rename', async (node: EcoreNode) => {
		const result = await vscode.window.showInputBox({ prompt: `Rename ${node.getName()}` });
		if(result)
		{
			node.setName(result);
			//model.rootNodes.forEach(element => { element.getId() == node.getId()? element.setName(result): null;});
			ecoreTreeDataProvider?.getonDidChangeTreeData().fire();
			vscode.window.showInformationMessage(`Renamed node to ${node.getName()}`)
		}
	}));	

	//delete node
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.delete', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Delete ${node.getName()}`);
		const parent = node.parent;
		const index = parent.children.indexOf(node);
		parent.children.splice(index, 1);
		ecoreTreeDataProvider.getonDidChangeTreeData().fire();
		//node.delete();	
	}));

	//add package
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addPackage', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Package`);
		//node.addPackage();	
	}));

	//add class
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addClass', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Class`);
		//node.addClass();	
	}	));

	//add association
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addAssociation', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Association`);
		//node.addAssociation();	
	}));

	//add generalization
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addGeneralization', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Generalization`);
		//node.addGeneralization();
	}));

	//add enumeration
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addEnumeration', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Enumeration`);
		//node.addEnumeration();
	}));

	//add literal
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addLiteral', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Enumeration`);
		//node.addLiteral();
	}));

	//add date type
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addDateType', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Date Type`);
		//node.addDateType();
	}));

	//add attribute
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addAttribute', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Attribute`);
		//node.addAttribute();
	}));

	//add operation
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addOperation', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Operation`);
		//node.addOperation();
	}));

	//add annotation
	context.subscriptions.push(vscode.commands.registerCommand('VMSC.addAnnotation', (node: EcoreNode) => {
		vscode.window.showInformationMessage(`Add Operation`);
		//node.addAnnotation();
	}));
}


