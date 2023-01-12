import * as vscode from "vscode";
import * as fs from 'fs';
import * as path from 'path';



export class EcoreTreeDataProvider implements vscode.TreeDataProvider<EcoreNode> {
  private _onDidChangeTreeData: vscode.EventEmitter<EcoreNode | undefined> = new vscode.EventEmitter<EcoreNode | undefined>();
  readonly onDidChangeTreeData: vscode.Event<EcoreNode | undefined> = this._onDidChangeTreeData.event;

  constructor() { }

  getTreeItem(element: EcoreNode): vscode.TreeItem {
    // Return a TreeItem based on the type of element
    switch (element.
      type) {
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



  const workspaceRoot =
    vscode.workspace.workspaceFolders &&
      vscode.workspace.workspaceFolders.length > 0
      ? vscode.workspace.workspaceFolders[0].uri.fsPath
      : undefined;
  if (pathExists(workspaceRoot!) && workspaceRoot) {
    const packageJsonPath = path.join(workspaceRoot!, "test.model");
    const vcoreString = fs.readFileSync(packageJsonPath, "utf8");

    const vcoreJson = JSON.parse(vcoreString);

    console.log(vcoreString);
    const model = transformJsonToTree(vcoreJson);

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