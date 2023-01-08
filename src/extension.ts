import * as vscode from "vscode";
import { EcoreTreeDataProvider, EcoreModel, EcoreNode } from "./treeview";

export function activate(context: vscode.ExtensionContext) {
	const model = new EcoreModel([
		new EcoreNode('EPackage', 'Package 1', [
			new EcoreNode('EClass', 'My Class')
		]),
		new EcoreNode('EPackage', 'Package 2')
	]);

	vscode.window.registerTreeDataProvider('exampleView', new EcoreTreeDataProvider(model));

}

export function deactivate() { }
