import * as vscode from "vscode";
import { VcoreTreeDataProvider, } from "./editor/treeview";
import { VcoreNode } from "./model/models";

export function activate(context: vscode.ExtensionContext) {
	// const model = new VcoreModel([
	// 	new VcoreNode('EPackage', 'Package 1', [
	// 		new VcoreNode('EClass', 'My Class')
	// 	]),
	// 	new VcoreNode('EPackage', 'Package 2')
	// ]);


	const rootPath = (vscode.workspace.workspaceFolders && (vscode.workspace.workspaceFolders.length > 0))
		? vscode.workspace.workspaceFolders[0].uri.fsPath : undefined;
	const vcoreTreeDataProvider = new VcoreTreeDataProvider(rootPath);
	vscode.window.registerTreeDataProvider('exampleView', vcoreTreeDataProvider);

}

export function deactivate() { }
