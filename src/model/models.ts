// package
// class
import * as vscode from "vscode";
import { EcoreNode } from "../treeview";

export class VcoreNode extends vscode.TreeItem {
  public readonly type:
    "Root"
    | "EPackage"
    | "EClass"
    | "EDataType"
    | "EEnumeration"
    | "EAttribute"
    | "EReference"
    | "EOperation"
    | "EAnnotation"
    | "EDetailEntry"
    | "EParameter"
    | "EAssociation"
    | "EGeneralization"
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

class EClass extends VcoreNode {
  attributes: EAttribute[];
  references: EReference[];
  operations: EOperation[];
  annotaions: EAnnotation[];
  constraints: EConstraint[];
  generalization: EGeneralization[];
  association: EAssociation[];

  constructor(name: string) {
    super(name, "EClass");
    this.attributes = [];
    this.references = [];
    this.operations = [];
    this.annotaions = [];
    this.generalization = [];
    this.association = [];
    this.constraints = [];
  }
}

class EDataType extends VcoreNode {
  constructor(name: string) {
    super(name, "EDataType");
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
class EOperation extends VcoreNode {
  target: EClass;
  parameters : EParameter[] = []
  constructor(name: string, target: EClass) {
    super(name, "EOperation");
    this.target = target;
  }
}
class EAnnotation extends VcoreNode {
  target: EClass;
  constructor(name: string, target: EClass) {
    super(name, "EAnnotation");
    this.target = target;
  }
}
class EParameter extends VcoreNode {
  dataType: EDataType;
  constructor(name: string, dataType: EDataType) {
    super(name, "EParameter");
    this.dataType = dataType;
  }
}

class EConstraint extends VcoreNode {
  expression: string;
  constructor(name: string, expression: string) {
    super(name, "EConstraint");
    this.expression = expression;
  }
}
class EGeneralization extends VcoreNode {
  parentNode: EClass;
  childNode: EClass;
  constructor(name: string, parentNode: EClass, childNode: EClass) {
    super(name, "EGeneralization");
    this.parentNode = parentNode;
    this.childNode = childNode;
  }
}
class EAssociation extends VcoreNode {
  nodeA: EClass;
  nodeB: EClass;
  constructor(name: string, nodeA: EClass, nodeB: EClass) {
    super(name, "EAssociation");
    this.nodeA = nodeA;
    this.nodeB = nodeB;
  }
}