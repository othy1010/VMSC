import * as vscode from 'vscode';


export class MyMenuButtonsProvider implements vscode.TreeDataProvider<MyMenuButtons> {
    getTreeItem(element: MyMenuButtons): vscode.TreeItem {
        return element;
    }

    getChildren(element?: MyMenuButtons): MyMenuButtons[] | undefined {
        if (!element) {
            return [
                new MyMenuButtons("Select file", vscode.TreeItemCollapsibleState.None, "mySelectFileButtonCommand"),
                new MyMenuButtons("Create new Vcore file", vscode.TreeItemCollapsibleState.None, "myCreateFileButtonCommand"),
                new MyMenuButtons("Import Ecore File", vscode.TreeItemCollapsibleState.None, "myImportEcoreButtonCommand")
            ];
        }
        return undefined;
    }
}

export class MyMenuButtons extends vscode.TreeItem {
    public iconPath?: string | vscode.Uri | { light: string | vscode.Uri; dark: string | vscode.Uri; } | vscode.ThemeIcon | undefined;
    constructor(public readonly label: string, 
        public readonly collapsibleState: vscode.TreeItemCollapsibleState, 
        public readonly commandId: string) {
        super(label, collapsibleState);
        //this.iconPath = path.join(context.extensionPath, 'img', 'blue-button.png');
        this.command = { command: commandId, title: label};
    }
}