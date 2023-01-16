import * as vscode from "vscode";
import * as fs from "fs";
import * as path from "path";
import { VcoreNode } from "../model/models";

export class VcoreTreeDataProvider
  implements vscode.TreeDataProvider<VcoreNode>
{
  private _onDidChangeTreeData: vscode.EventEmitter<VcoreNode | undefined> =
    new vscode.EventEmitter<VcoreNode | undefined>();
  readonly onDidChangeTreeData: vscode.Event<VcoreNode | undefined> =
    this._onDidChangeTreeData.event;
  constructor(private workspaceRoot: string | undefined) {
  }
  getTreeItem(element: VcoreNode): vscode.TreeItem {
    switch (element.type) {

      case "EPackage":
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Collapsed,
          contextValue: "EPackage",
        };
      case "EClass":
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.Collapsed,
          contextValue: "EClass",
        };
      case "EDataType":
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: "EDataType",
        };
      case "EAttribute":
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: "EAttribute",
        };
      case "EReference":
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: "EReference",

        };
      case "EConstraint":
        return {
          label: element.name,
          collapsibleState: vscode.TreeItemCollapsibleState.None,
          contextValue: "EConstraint",
        };
      default:
        return {
          label: "Unknown Element",
          collapsibleState: vscode.TreeItemCollapsibleState.None,
        };
    }
  }

  getChildren(element?: VcoreNode): vscode.ProviderResult<VcoreNode[]> {
    const workspaceRoot =
      vscode.workspace.workspaceFolders &&
        vscode.workspace.workspaceFolders.length > 0
        ? vscode.workspace.workspaceFolders[0].uri.fsPath
        : undefined;
    if (!workspaceRoot) {
      vscode.window.showInformationMessage("No dependency in empty workspace");
      return Promise.resolve([]);
    }

    if (element) {
      return Promise.resolve(
        this.getVcoreModel(
          path.join(workspaceRoot, "test.model")
        )
      );
    } else {
      const packageJsonPath = path.join(workspaceRoot, "test.model");
      if (this.pathExists(packageJsonPath)) {
        return Promise.resolve(this.getVcoreModel(packageJsonPath));
      } else {
        vscode.window.showInformationMessage("Workspace has no test.model");
        return Promise.resolve([]);
      }
    }
  }
  private getVcoreModel(VcorePath: string): VcoreNode[] {
    const workspaceRoot =
      vscode.workspace.workspaceFolders &&
        vscode.workspace.workspaceFolders.length > 0
        ? vscode.workspace.workspaceFolders[0].uri.fsPath
        : undefined;
    if (this.pathExists(VcorePath) && workspaceRoot) {
      const vcoreString = fs.readFileSync(VcorePath, "utf8");

      const vcoreJson: VcoreNode[] = JSON.parse(vcoreString);

      // const vcoreModel = this.convertJsonToModel(vcoreJson);
      console.log(vcoreString);
      return vcoreJson;
    } else {
      return [];
    }
  }
  // private convertJsonToModel(json: any): VcoreNode[] {
  //   let vcoreModel: VcoreNode[] = [];

  //   if (json.type == "Root") {
  //     const node = this.convertJsonObjectToModel(json);
  //     return vcoreModel;

  //   } else {
  //     //print error
  //     vscode.window.showInformationMessage("No Root Element");
  //     return [];
  //   }

  // }

  // private convertJsonArrayToModel(jsonArray: any[]): VcoreNode[] {
  //   const vcoreModel: VcoreNode[] = [];

  //   for (const element of jsonArray) {
  //     if (element instanceof Array) {
  //       const children = this.convertJsonArrayToModel(element);

  //       const node = new VcoreNode("package", element, children);

  //       vcoreModel.push(node);
  //     } else if (typeof element === "object") {
  //       const node = this.convertJsonObjectToModel(element);

  //       vcoreModel.push(node);
  //     } else {
  //       const node = new VcoreNode(element, element);

  //       vcoreModel.push(node);
  //     }
  //   }

  //   return vcoreModel;
  // }
  // private convertJsonObjectToModel(json: any): VcoreNode {
  //   const vcoreModel: VcoreNode[] = [];

  //   for (const prop in json) {
  //     const value = json[prop];

  //     if (value instanceof Array) {
  //       const children = this.convertJsonArrayToModel(value);

  //       const node = new VcoreNode(prop, children);

  //       vcoreModel.push(node);
  //     } else if (typeof value === "object") {
  //       const node = this.convertJsonObjectToModel(value);

  //       vcoreModel.push(node);
  //     } else {
  //       const node = new VcoreNode(prop, value);

  //       vcoreModel.push(node);
  //     }
  //   }

  //   const root = new VcoreNode(json, vcoreModel);

  //   return root;
  // }

  private pathExists(p: string): boolean {
    try {
      fs.accessSync(p);
    } catch (err) {
      return false;
    }

    return true;
  }
}

