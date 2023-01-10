import * as vscode from "vscode";

/* export class TreeDataProvider implements vscode.TreeDataProvider<TreeItem> {
   onDidChangeTreeData?: vscode.Event<TreeItem | null | undefined> | undefined;/*
   data: TreeItem[];/*
   constructor() {
     this.data = [new TreeItem('cars', [
       new TreeItem(
         'Ford', [new TreeItem('Fiesta'), new TreeItem('Focus'), new TreeItem('Mustang')]),
       new TreeItem(
         'BMW', [new TreeItem('320'), new TreeItem('X3'), new TreeItem('X5')])
     ])];
   }/*
   getTreeItem(element: TreeItem): vscode.TreeItem | Thenable<vscode.TreeItem> {
     return element;
   }/*
   getChildren(element?: TreeItem | undefined): vscode.ProviderResult<TreeItem[]> {
     if (element === undefined) {
       return this.data;
     }
     return element.children;
   }
 }/*
 class TreeItem extends vscode.TreeItem {
   children: TreeItem[] | undefined;/*
   constructor(label: string, children?: TreeItem[]) {
     super(
       label,
       children === undefined ? vscode.TreeItemCollapsibleState.None :
         vscode.TreeItemCollapsibleState.Expanded);
     this.children = children;
   }
 }*/

export class EcoreTreeDataProvider implements vscode.TreeDataProvider<EcoreNode> {
  private _onDidChangeTreeData: vscode.EventEmitter<EcoreNode | undefined> = new vscode.EventEmitter<EcoreNode | undefined>();
  readonly onDidChangeTreeData: vscode.Event<EcoreNode | undefined> = this._onDidChangeTreeData.event;

  constructor(private readonly ecoreModel: EcoreModel) { }

  refresh(): void {
    this._onDidChangeTreeData.fire();
  }

  getonDidChangeTreeData(){
    return this._onDidChangeTreeData;
  }

  getTreeItem(element: EcoreNode): vscode.TreeItem {

    let treeItem: vscode.TreeItem = {
      label: element.getName(),
      collapsibleState: vscode.TreeItemCollapsibleState.None,
      contextValue: element.type,
      command: {
        command: 'VMSC.openContextMenu',
        title: 'openContextMenu',
        arguments: [element]
      }
    };

    // Return a TreeItem based on the type of element
    switch (element.type) {
      case 'EClass':
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        break;
      case 'EPackage':
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        break;
      case 'EAttribute':
        break;
      case 'EReference':
        break;
      case 'EDataType':
        break;
      case 'EOperation':
        break;
      case 'EAnnotation':
        break;
      case 'EConstraint':
        break;
      default:
        return {
          label: 'Unknown Element',
          collapsibleState: vscode.TreeItemCollapsibleState.None
        };
    }
    return treeItem;
  }

  getChildren(element?: EcoreNode): vscode.ProviderResult<EcoreNode[]> {
    // If no element is provided, return the root nodes of the model
    if (!element) {
      return this.ecoreModel.rootNodes;
    }

    // Otherwise, return the children of the element
    return element.getChildren();
  }
}

export class EcoreNode {
    private readonly id: string= (genUniqueId() as string);

  constructor(
    public readonly type: 'EClass' | 'EAttribute' | 'EReference' | 'EDataType' |
    'EOperation' | 'EAnnotation' | 'EPackage' | 'EConstraint',
    private name: string,
    private children: EcoreNode[] = []
  ) {}

  getId() {
    return this.id;
  }

  setName(name: string) {
    this.name = name;
  }
  getName() {
    return this.name;
  }

  getChild(index: number) {
    return this.children[index];
  }
  setChild(index: number, child: EcoreNode) {
    this.children[index] = child;
  }

  getChildren() {
    return this.children;
  }
  setChildren(children: EcoreNode[]) {
    this.children = children;
  }

} 

export class EcoreModel {
  constructor(public readonly rootNodes: EcoreNode[]) { }
}

function genUniqueId(): string {
  const dateStr = Date
    .now()
    .toString(36); // convert num to base 36 and stringify

  const randomStr = Math
    .random()
    .toString(36)
    .substring(2, 8); // start at index 2 to skip decimal point

  return `${dateStr}-${randomStr}`;
}
export default genUniqueId;