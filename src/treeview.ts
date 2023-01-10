import * as vscode from "vscode";
import * as fs from 'fs';
import * as path from 'path';

export class VcoreProvider implements vscode.TreeDataProvider<VcoreNode> {

  private _onDidChangeTreeData: vscode.EventEmitter<VcoreNode | undefined | void> = new vscode.EventEmitter<VcoreNode | undefined | void>();
  readonly onDidChangeTreeData: vscode.Event<VcoreNode | undefined | void> = this._onDidChangeTreeData.event;

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

  constructor() { }

  getTreeItem(element: EcoreNode): vscode.TreeItem {
    // Return a TreeItem based on the type of element
    switch (element.type) {
      case 'EModel':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded,
          contextValue: 'EModel'
        };
      case 'EClass':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded,
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
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded,
          contextValue: 'EReference'
        };
      case 'EDataType':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded,
          contextValue: 'EDataType'
        };
      case 'EPackage':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded,
          contextValue: 'EPackage'
        };
      case 'EConstraint':
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded,
          contextValue: 'EConstraint'
        };
      default:
        return {
          label: 'Unknown Element',
          collapsibleState: vscode.TreeItemCollapsibleState.Expanded
        };
    }
  }

  getChildren(element?: EcoreNode): vscode.ProviderResult<EcoreNode[]> {
    // If no element is provided, return the root nodes of the model
    const JModel = convertJsonToEcoreModel();
    if (!element) {
      return JModel.rootNodes;
    }

    // Otherwise, return the children of the element
    return element.children;
  }
}

export class EcoreNode {
  constructor(
    public readonly type: 'EClass' | 'EAttribute' | 'EReference' | 'EDataType' | 'EPackage' | 'EConstraint' | 'EModel',
    public readonly name: string,
    public readonly children: EcoreNode[] = []
  ) { }
}
export class EcoreModel {
  constructor(public readonly rootNodes: EcoreNode[]) { }
}



function convertJsonToEcoreModel(): EcoreModel {

  // const workspaceRoot =
  //   vscode.workspace.workspaceFolders &&
  //     vscode.workspace.workspaceFolders.length > 0
  //     ? vscode.workspace.workspaceFolders[0].uri.fsPath
  //     : undefined;
  // if (!workspaceRoot) {
  //   vscode.window.showInformationMessage("No Model in empty workspace");
  //   const packageJsonPath = path.join(workspaceRoot!, "test.model");
  //   if (pathExists(packageJsonPath)) {
  //     // return Promise.resolve(this.getVcoreModel(packageJsonPath));
  //   } else {
  //     vscode.window.showInformationMessage("Workspace has no test.model");
  //     // return Promise.resolve([]);
  //   }
  // }




  const workspaceRoot =
    vscode.workspace.workspaceFolders &&
      vscode.workspace.workspaceFolders.length > 0
      ? vscode.workspace.workspaceFolders[0].uri.fsPath
      : undefined;
  if (pathExists(workspaceRoot!) && workspaceRoot) {
    const vcoreString = fs.readFileSync(workspaceRoot, "utf8");

    const vcoreJson = JSON.parse(vcoreString);

    // const vcoreModel = this.convertJsonToModel(vcoreJson);
    console.log(vcoreString);
    const model = transformJsonToTree(vcoreJson);
    // const model = new EcoreModel([
    //   new EcoreNode('EModel', 'EModel', [
    //     new EcoreNode('EPackage', 'Package 1', [
    //       new EcoreNode('EClass', 'My Class', [
    //         new EcoreNode('EAttribute', 'My Attribute'),
    //         new EcoreNode('EReference', 'My Reference'),
    //         new EcoreNode('EDataType', 'My Data Type'),
    //         new EcoreNode('EConstraint', 'My Constraint')
    //       ])
    //     ]),
    //     new EcoreNode('EPackage', 'Package 2')]),
    // ]);
    return model;
  } else {
    return new EcoreModel([
      new EcoreNode('EModel', 'EModel', [
        new EcoreNode('EPackage', 'Package 1', [
          new EcoreNode('EClass', 'My Class', [
            new EcoreNode('EAttribute', 'My Attribute'),
            new EcoreNode('EReference', 'My Reference'),
            new EcoreNode('EDataType', 'My Data Type'),
            new EcoreNode('EConstraint', 'My Constraint')
          ])
        ]),
        new EcoreNode('EPackage', 'Package 2')]),
    ]);
  }

}

function transformJsonToTree(json: any): EcoreModel {
  // create the root EModel node
  let root = new EcoreNode('EModel', json.name);

  // create a recursive function to traverse the json object
  function parseJson(node: EcoreNode, json: any) {
    // if the json object has a "packages" property, recursively parse it
    if (json.hasOwnProperty("packages")) {
      json.packages.forEach((child: any) => {
        let childNode = new EcoreNode(child.type, child.name);
        node.children.push(childNode);
        parseJson(childNode, child);
      });
    }
    // if the json object has a "classes" property, recursively parse it
    if (json.hasOwnProperty("classes")) {
      json.classes.forEach((child: any) => {
        let childNode = new EcoreNode(child.type, child.name);
        node.children.push(childNode);
        parseJson(childNode, child);
      });
    }
    // if the json object has a "attributes" property, add it as a child
    if (json.hasOwnProperty("attributes")) {
      json.attributes.forEach((child: any) => {
        let childNode = new EcoreNode(child.type, child.name);
        node.children.push(childNode);
      });
    }
    // if the json object has a "references" property, recursively parse it
    if (json.hasOwnProperty("references")) {
      json.references.forEach((child: any) => {
        let childNode = new EcoreNode(child.type, child.name);
        node.children.push(childNode);
        parseJson(childNode, child);
      });
    }
    // if the json object has a "datatype" property, recursively parse it
    if (json.hasOwnProperty("datatype")) {
      json.datatype.forEach((child: any) => {
        let childNode = new EcoreNode(child.type, child.name);
        node.children.push(childNode);
        parseJson(childNode, child);
      });
    }
    // if the json object has a "constraints" property, recursively parse it
    if (json.hasOwnProperty("constraints")) {
      json.constraints.forEach((child: any) => {
        let childNode = new EcoreNode(child.type, child.name);
        node.children.push(childNode);
        parseJson(childNode, child);
      });
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