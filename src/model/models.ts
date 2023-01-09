// package
// class
import * as vscode from "vscode";

export class VcoreNode extends vscode.TreeItem {
  public readonly type:
    "Root"
    | "EClass"
    | "EAttribute"
    | "EReference"
    | "EDataType"
    | "EPackage"
    | "EConstraint";
  public readonly name: string;

  // public readonly value: any;

  public readonly children: VcoreNode[];

  constructor(type: any, name: any, children: VcoreNode[] = []) {
    super(
      name,
      children.length > 0
        ? vscode.TreeItemCollapsibleState.Collapsed
        : vscode.TreeItemCollapsibleState.None
    );
    this.children = children;
    this.name = name;
    this.type = type;
  }
}



class EClass extends VcoreNode {
  attributes: EAttribute[];
  references: EReference[];
  constraints: EConstraint[];

  constructor(name: string) {
    super(name, "EClass");
    this.attributes = [];
    this.references = [];
    this.constraints = [];
  }
}

class EAttribute extends VcoreNode {
  dataType: EDataType;
  constructor(name: string, dataType: EDataType) {
    super(name, "EAttribute");
    this.dataType = dataType;
  }
}

class EReference extends VcoreNode {
  target: EClass;
  constructor(name: string, target: EClass) {
    super(name, "EReference");
    this.target = target;
  }
}

class EDataType extends VcoreNode {
  constructor(name: string) {
    super(name, "EDataType");
  }
}

class EPackage extends VcoreNode {
  packages: EPackage[];
  classes: EClass[];
  dataTypes: EDataType[];
  constructor(name: string) {
    super(name, "EPackage");
    this.packages = [];
    this.classes = [];
    this.dataTypes = [];
  }
}

class EConstraint extends VcoreNode {
  expression: string;
  constructor(name: string, expression: string) {
    super(name, "EConstraint");
    this.expression = expression;
  }
}
