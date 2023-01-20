import * as vscode from 'vscode';
import * as fs from "fs";
export class JsonTreeDataProvider implements vscode.TreeDataProvider<JsonTreeItem> {
  private _onDidChangeTreeData: vscode.EventEmitter<JsonTreeItem | undefined> = new vscode.EventEmitter<JsonTreeItem | undefined>();
  readonly onDidChangeTreeData: vscode.Event<JsonTreeItem | undefined> = this._onDidChangeTreeData.event;

  constructor(private json: any) { }

  public getTreeItem(element: JsonTreeItem): vscode.TreeItem {
    return element;
  }

  public getChildren(element?: JsonTreeItem): JsonTreeItem[] {
    if (!element) {
      const root = new JsonTreeItem('Root', vscode.TreeItemCollapsibleState.Collapsed);
      root.children = createTreeViewNodes(this.json, root);
      return root.children;
    } else {
      return element.children || [];
    }
  }
}

export function activate(context: vscode.ExtensionContext) {
  // Parse the JSON file and create the tree view nodes
  const workspaceRoot =
    vscode.workspace.workspaceFolders &&
      vscode.workspace.workspaceFolders.length > 0
      ? vscode.workspace.workspaceFolders[0].uri.fsPath
      : undefined;
  if (workspaceRoot) {
    const vcoreString = fs.readFileSync(workspaceRoot, "utf8");

    // const vcoreJson: VcoreNode[] =

    // const vcoreModel = this.convertJsonToModel(vcoreJson);
    // console.log(vcoreString);
    // return vcoreJson;

    const json = JSON.parse(vcoreString);
    const treeDataProvider = new JsonTreeDataProvider(json);

    // Register the tree view
    const treeView = vscode.window.createTreeView('my-tree-view', { treeDataProvider });
    context.subscriptions.push(treeView);
  } else {
    return [];
  }
}

export class JsonTreeItem extends vscode.TreeItem {
  public children: JsonTreeItem[] | undefined;

  constructor(label: string, collapsibleState: vscode.TreeItemCollapsibleState, contextValue?: string) {
    super(label, collapsibleState);
    this.contextValue = contextValue;
  }
}

// This function creates a tree view node for each object in the JSON file
function createTreeViewNodes(json: any, parent: JsonTreeItem): JsonTreeItem[] {
  // If the JSON value is an array, create a tree view node for each element in the array
  if (Array.isArray(json)) {
    return json.map((item: any, index: number) => {
      const treeItem = new JsonTreeItem(`[${index}]`, vscode.TreeItemCollapsibleState.Collapsed, 'array');
      treeItem.children = createTreeViewNodes(item, treeItem);
      return treeItem;
    });
  }

  // If the JSON value is an object, create a tree view node for each property in the object
  if (typeof json === 'object' && json !== null) {
    return Object.keys(json).map((key: string) => {
      const treeItem = new JsonTreeItem(key, vscode.TreeItemCollapsibleState.Collapsed, 'object');
      treeItem.children = createTreeViewNodes(json[key], treeItem);
      return treeItem;
    });
  }

  // If the JSON value is a primitive value (e.g. string, number, boolean), create a leaf node
  return [new JsonTreeItem(json.toString(), vscode.TreeItemCollapsibleState.Collapsed)];
}