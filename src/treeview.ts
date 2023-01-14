import * as vscode from "vscode";
import * as fs from 'fs';
import * as path from 'path';

interface Properties{
  name: String;
  value : any;
}

export class VcoreProvider implements vscode.TreeDataProvider<VcoreNode> {
  private _onDidChangeTreeData: vscode.EventEmitter<VcoreNode | undefined | null> = new vscode.EventEmitter<VcoreNode | undefined | null>();
  readonly onDidChangeTreeData: vscode.Event<VcoreNode | undefined | null> = this._onDidChangeTreeData.event;

  constructor(private workspaceRoot: string | undefined) {
  }

  refresh(): void {
    this._onDidChangeTreeData.fire();
  }

  getTreeItem(element: VcoreNode): vscode.TreeItem {
    return element;
  }

  getChildren(element?: VcoreNode): Thenable<VcoreNode[]> {
    if (!this.workspaceRoot) {
      vscode.window.showInformationMessage('No dependency in empty workspace');
      return Promise.resolve([]);
    }

    if (element) {
      return Promise.resolve(this.getDepsInPackageJson(path.join(this.workspaceRoot, 'node_modules', element.label, 'package.json')));
    } else {
      const packageJsonPath = path.join(this.workspaceRoot, 'package.json');
      if (this.pathExists(packageJsonPath)) {
        return Promise.resolve(this.getDepsInPackageJson(packageJsonPath));
      } else {
        vscode.window.showInformationMessage('Workspace has no package.json');
        return Promise.resolve([]);
      }
    }
  }

  /**
   * Given the path to package.json, read all its dependencies and devDependencies.
   */
  private getDepsInPackageJson(packageJsonPath: string): VcoreNode[] {
    const workspaceRoot = this.workspaceRoot;
    if (this.pathExists(packageJsonPath) && workspaceRoot) {
      const packageJson = JSON.parse(fs.readFileSync(packageJsonPath, 'utf-8'));

      const toDep = (moduleName: string, version: string): VcoreNode => {
        if (this.pathExists(path.join(workspaceRoot, 'node_modules', moduleName))) {
          return new VcoreNode(moduleName, version, vscode.TreeItemCollapsibleState.Collapsed);
        } else {
          return new VcoreNode(moduleName, version, vscode.TreeItemCollapsibleState.None, {
            command: 'extension.openPackageOnNpm',
            title: '',
            arguments: [moduleName]
          });
        }
      };

      const deps = packageJson.dependencies
        ? Object.keys(packageJson.dependencies).map(dep => toDep(dep, packageJson.dependencies[dep]))
        : [];
      const devDeps = packageJson.devDependencies
        ? Object.keys(packageJson.devDependencies).map(dep => toDep(dep, packageJson.devDependencies[dep]))
        : [];
      return deps.concat(devDeps);
    } else {
      return [];
    }
  }

  private pathExists(p: string): boolean {
    try {
      fs.accessSync(p);
    } catch (err) {
      return false;
    }

    return true;
  }
}

export class VcoreNode extends vscode.TreeItem {

  constructor(
    public readonly label: string,
    private readonly version: string,
    public readonly collapsibleState: vscode.TreeItemCollapsibleState,
    public readonly command?: vscode.Command
  ) {
    super(label, collapsibleState);

    this.tooltip = `${this.label}-${this.version}`;
    this.description = this.version;
  }

  // iconPath = {
  //   light: path.join(__filename, '..', '..', 'resources', 'light', 'dependency.svg'),
  //   dark: path.join(__filename, '..', '..', 'resources', 'dark', 'dependency.svg')
  // };

  contextValue = 'dependency';
}

export class EcoreTreeDataProvider implements vscode.TreeDataProvider<EcoreNode> {
  private _onDidChangeTreeData: vscode.EventEmitter<EcoreNode | undefined> = new vscode.EventEmitter<EcoreNode | undefined>();
  readonly onDidChangeTreeData: vscode.Event<EcoreNode | undefined> = this._onDidChangeTreeData.event;

  constructor(private readonly ecoreModel: EcoreModel) { }

  //constructor() { }

  refresh(): void {
    this._onDidChangeTreeData.fire();
  }

  getonDidChangeTreeData(){
    return this._onDidChangeTreeData;
  }

  /*
  getTreeItem(element: VcoreNode): vscode.TreeItem {
    return element;
  }
  */ 
  getTreeItem(element: EcoreNode): vscode.TreeItem {
    let treeItem: vscode.TreeItem = {
      label: element.getName(),
      description: element.type,
      collapsibleState: vscode.TreeItemCollapsibleState.None,
      contextValue: "nodeTreeItem",
      command: {
        command: 'VMSC.rightClickNode',
        title: 'rightClickNode',
        arguments: [element]
      },
      iconPath: vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', ''))
    };
    // Return a TreeItem based on the type of element
    switch (element.type) {
      case 'VModel':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'model.svg'))
        break;
      case 'VPackage':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'package.svg'))
        break;
      case 'VClass':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'class.svg'))
        break;
      case 'VEnumeration':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'enum.svg'))
        break;
      case 'VDataType':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Collapsed;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'db.svg'))
        break;
      case 'VAttribute':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.None;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'attribute.svg'))
        break;
      case 'VReference':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.None;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'reference.svg'))
        break;
      case 'VOperation':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.None;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'operation.svg'))
        break;
      case 'VAnnotation':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.None;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'attribute.svg'))
        break;
      case 'VLiteral':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.None;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'string.svg'))
        break;

      case 'VParameter':
        element.getChildren().length > 0 ? treeItem.collapsibleState = vscode.TreeItemCollapsibleState.Expanded :
        treeItem.collapsibleState = vscode.TreeItemCollapsibleState.None;
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'parameter.svg'))
        break;
      case 'VDetailEntry':
        treeItem.iconPath= vscode.Uri.file(path.join(__dirname, '..', 'resources', 'dark', 'string.svg'))
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
/*

getChildren(element?: EcoreNode): vscode.ProviderResult<EcoreNode[]> {
    // If no element is provided, return the root nodes of the model
    const JModel = convertJsonToEcoreModel();
    if (!element) {
      return JModel.rootNodes;
    }

    // Otherwise, return the children of the element
    return element.children;
  }
  
  */

}

export class EcoreNode {
  private id: string= (genUniqueId() as string);
  private parent: EcoreNode | undefined;
  private properties: Properties[] = [];
  private parameters: EcoreNode[] | undefined;

  constructor(
    public readonly type: 'VModel' |'VPackage' |'VClass' |'VDataType' | 'VEnumeration' |
    'VAttribute' | 'VReference' | 'VOperation' | 'VAnnotation' | 'VLiteral' |
    'VParameter' | 'VDetailEntry' , 
    private name: string,
    private children: EcoreNode[] = [], id? : string
  ) {
    children.forEach(child => child.setParent(this));
    if(id) this.id = id;
  }
  setId(id: string) {
    this.id = id;
  }
  getId() {
    return this.id;
  }
  getParameters() {
    return this.parameters;
  }
  setParameters(parameters: EcoreNode[]) {
    this.parameters = parameters;
  }
  setParent(parent: EcoreNode): void {
    this.parent = parent;
  }
  getParent(): EcoreNode | undefined {
    return this.parent;
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

