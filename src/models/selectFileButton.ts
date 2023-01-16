import * as vscode from 'vscode';


export class MySelectFileButtonProvider implements vscode.TreeDataProvider<MySelectFileButton> {
    getTreeItem(element: MySelectFileButton): vscode.TreeItem {
        return element;
    }

    getChildren(element?: MySelectFileButton): MySelectFileButton[] | undefined {
        if (!element) {
            return [new MySelectFileButton("Select file", vscode.TreeItemCollapsibleState.None, "mySelectFileButtonCommand")];
        }
        return undefined;
    }
}

export class MySelectFileButton extends vscode.TreeItem {
    constructor(public readonly label: string, public readonly collapsibleState: vscode.TreeItemCollapsibleState, public readonly commandId: string) {
        super(label, collapsibleState);
        this.command = { command: commandId, title: label};
    }
}