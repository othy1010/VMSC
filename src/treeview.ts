import * as vscode from "vscode";

// export class TreeDataProvider implements vscode.TreeDataProvider<TreeItem> {
//   onDidChangeTreeData?: vscode.Event<TreeItem | null | undefined> | undefined;

//   data: TreeItem[];

//   constructor() {
//     this.data = [new TreeItem('cars', [
//       new TreeItem(
//         'Ford', [new TreeItem('Fiesta'), new TreeItem('Focus'), new TreeItem('Mustang')]),
//       new TreeItem(
//         'BMW', [new TreeItem('320'), new TreeItem('X3'), new TreeItem('X5')])
//     ])];
//   }

//   getTreeItem(element: TreeItem): vscode.TreeItem | Thenable<vscode.TreeItem> {
//     return element;
//   }

//   getChildren(element?: TreeItem | undefined): vscode.ProviderResult<TreeItem[]> {
//     if (element === undefined) {
//       return this.data;
//     }
//     return element.children;
//   }
// }

// class TreeItem extends vscode.TreeItem {
//   children: TreeItem[] | undefined;

//   constructor(label: string, children?: TreeItem[]) {
//     super(
//       label,
//       children === undefined ? vscode.TreeItemCollapsibleState.None :
//         vscode.TreeItemCollapsibleState.Expanded);
//     this.children = children;
//   }
// }

export class EcoreTreeDataProvider implements vscode.TreeDataProvider<EcoreNode> {
  private _onDidChangeTreeData: vscode.EventEmitter<EcoreNode | undefined> = new vscode.EventEmitter<EcoreNode | undefined>();
  readonly onDidChangeTreeData: vscode.Event<EcoreNode | undefined> = this._onDidChangeTreeData.event;

  constructor(private readonly ecoreModel: EcoreModel) { }

  getTreeItem(element: EcoreNode): vscode.TreeItem {
    // Return a TreeItem based on the type of element
    switch (element.type) {
      case 'EClass':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Collapsed,
          contextValue: 'EClass'
        };
      case 'EAttribute':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: 'EAttribute'
        };
      case 'EReference':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: 'EReference'
        };
      case 'EDataType':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: 'EDataType'
        };
      case 'EPackage':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Collapsed,
          contextValue: 'EPackage'
        };
      case 'EConstraint':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: 'EConstraint'
        };
      default:
        return {
          label: 'Unknown Element',
          collapsibleState: vscode.TreeItemCollapsibleState.None
        };
    }
  }

  getChildren(element?: EcoreNode): vscode.ProviderResult<EcoreNode[]> {
    // If no element is provided, return the root nodes of the model
    if (!element) {
      return this.ecoreModel.rootNodes;
    }

    // Otherwise, return the children of the element
    return element.children;
  }
}

export class EcoreNode {
  constructor(
    public readonly type: 'EClass' | 'EAttribute' | 'EReference' | 'EDataType' | 'EPackage' | 'EConstraint',
    public readonly name: string,
    public readonly children: EcoreNode[] = []
  ) { }
}
export class EcoreModel {
  constructor(public readonly rootNodes: EcoreNode[]) { }
}
