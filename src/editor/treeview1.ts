// import * as vscode from "vscode";
// import * as fs from "fs";
// import * as path from "path";
// import { VcoreNode } from "../model/models";

// export class VcoreTreeDataProvider
//   implements vscode.TreeDataProvider<VcoreNode>
// {
//   private _onDidChangeTreeData: vscode.EventEmitter<VcoreNode | undefined> =
//     new vscode.EventEmitter<VcoreNode | undefined>();
//   readonly onDidChangeTreeData: vscode.Event<VcoreNode | undefined> =
//     this._onDidChangeTreeData.event;
//   constructor(private workspaceRoot: string | undefined) {
//   }
//   getTreeItem(element: VcoreNode): vscode.TreeItem {
//     switch (element.type) {
//       case "EClass":
//         return {
//           label: element.name,
//           collapsibleState: vscode.TreeItemCollapsibleState.Collapsed,
//           contextValue: "EClass",
//         };
//       case "EAttribute":
//         return {
//           label: element.name,
//           collapsibleState: vscode.TreeItemCollapsibleState.None,
//           contextValue: "EAttribute",
//         };
//       case "EReference":
//         return {
//           label: element.name,
//           collapsibleState: vscode.TreeItemCollapsibleState.None,
//           contextValue: "EReference",
//         };
//       case "EDataType":
//         return {
//           label: element.name,
//           collapsibleState: vscode.TreeItemCollapsibleState.None,
//           contextValue: "EDataType",
//         };
//       case "EPackage":
//         return {
//           label: element.name,
//           collapsibleState: vscode.TreeItemCollapsibleState.Collapsed,
//           contextValue: "EPackage",
//         };
//       case "EConstraint":
//         return {
//           label: element.name,
//           collapsibleState: vscode.TreeItemCollapsibleState.None,
//           contextValue: "EConstraint",
//         };
//       default:
//         return {
//           label: "Unknown Element",
//           collapsibleState: vscode.TreeItemCollapsibleState.None,
//         };
//     }
//   }

//   // getChildren(element?: VcoreNode): vscode.ProviderResult<VcoreNode[]> {
//   //   const workspaceRoot =
//   //     vscode.workspace.workspaceFolders &&
//   //       vscode.workspace.workspaceFolders.length > 0
//   //       ? vscode.workspace.workspaceFolders[0].uri.fsPath
//   //       : undefined;
//   //   if (!workspaceRoot) {
//   //     vscode.window.showInformationMessage("No dependency in empty workspace");
//   //     return Promise.resolve([]);
//   //   }

//   //   if (element) {
//   //     return Promise.resolve(
//   //       this.getVcoreModel(
//   //         path.join(workspaceRoot, "test.model")
//   //       )
//   //     );
//   //   } else {
//   //     const packageJsonPath = path.join(workspaceRoot, "test.model");
//   //     if (this.pathExists(packageJsonPath)) {
//   //       return Promise.resolve(this.getVcoreModel(packageJsonPath));
//   //     } else {
//   //       vscode.window.showInformationMessage("Workspace has no test.model");
//   //       return Promise.resolve([]);
//   //     }
//   //   }
//   // }
//   getChildren(element?: VcoreNode): vscode.ProviderResult<VcoreNode[]> {
//     const workspaceRoot =
//       vscode.workspace.workspaceFolders &&
//         vscode.workspace.workspaceFolders.length > 0
//         ? vscode.workspace.workspaceFolders[0].uri.fsPath
//         : undefined;
//     if (!workspaceRoot) {
//       vscode.window.showInformationMessage("No dependency in empty workspace");
//       return Promise.resolve([]);
//     }

//     if (element) {
//       // If an element is specified, return its children
//       return Promise.resolve(element.children);
//     } else {
//       // If no element is specified, return the root nodes of the tree
//       const packageJsonPath = path.join(workspaceRoot, "test.model");
//       if (this.pathExists(packageJsonPath)) {
//         // Read the JSON data from the file and convert it to a tree of VcoreNode objects
//         const vcoreString = fs.readFileSync(packageJsonPath, "utf8");
//         const vcoreJson = JSON.parse(vcoreString);
//         const vcoreModel = this.convertJsonToModel(vcoreJson);
//         return Promise.resolve(vcoreModel);
//       } else {
//         vscode.window.showInformationMessage("Workspace has no test.model");
//         return Promise.resolve([]);
//       }
//     }
//   }

//   private getVcoreModel(VcorePath: string): VcoreNode[] {
//     const workspaceRoot =
//       vscode.workspace.workspaceFolders &&
//         vscode.workspace.workspaceFolders.length > 0
//         ? vscode.workspace.workspaceFolders[0].uri.fsPath
//         : undefined;
//     if (this.pathExists(VcorePath) && workspaceRoot) {
//       const vcoreString = fs.readFileSync(VcorePath, "utf8");

//       const vcoreJson: any = JSON.parse(vcoreString);

//       const vcoreModel = this.convertJsonToModel(vcoreJson);
//       return vcoreModel;
//     } else {
//       return [];
//     }
//   }
//   private convertJsonToModel(json: any): VcoreNode[] {
//     // Create a map of all the nodes in the JSON data, indexed by their id
//     const nodeMap: { [id: string]: VcoreNode } = {};
//     json.forEach((node: any) => {
//       const vcoreNode = this.createVcoreNode(node);
//       nodeMap[node.id] = vcoreNode;
//     });

//     // Set the child and parent nodes for each node
//     Object.values(nodeMap).forEach((vcoreNode: VcoreNode) => {
//       if (vcoreNode.parentId) {
//         const parentNode = nodeMap[vcoreNode.parentId];
//         vcoreNode.parent = parentNode;
//         parentNode.children.push(vcoreNode);
//       }
//     });

//     // Return the root nodes of the tree
//     return Object.values(nodeMap).filter((vcoreNode: VcoreNode) => !vcoreNode.parent);
//   }

//   private createVcoreNode(node: any): VcoreNode {
//     switch (node.type) {
//       case "EClass":
//         return new VcoreNode(node.id, node.name, node.parentId);
//       case "EAttribute":
//         return new VcoreNode(node.id, node.name, node.parentId, node.dataType);
//       case "EReference":
//         return new VcoreNode(node.id, node.name, node.parentId, node.target);
//       case "EDataType":
//         return new VcoreNode(node.id, node.name, node.parentId);
//       case "EPackage":
//         return new VcoreNode(node.id, node.name, node.parentId);
//       case "EConstraint":
//         return new VcoreNode(node.id, node.name, node.parentId, node.expression);
//       default:
//         return new VcoreNode(node.id, node.name, node.parentId);
//     }
//   }

//   private pathExists(p: string): boolean {
//     try {
//       fs.accessSync(p);
//     } catch (err) {
//       return false;
//     }

//     return true;
//   }
// }

