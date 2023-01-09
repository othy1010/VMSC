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
