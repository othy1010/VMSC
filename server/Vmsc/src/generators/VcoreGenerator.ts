import fs from 'fs';
import { CompositeGeneratorNode, NL, Reference, toString } from 'langium';
import path from 'path';
import { VAnnotation, VAttribute, VClass, VModel, VOperation, VPackage, VReference, VStructuralComponent, VStructuralFeatures } from '../language-server/generated/ast';
import { extractDestinationAndName } from '../cli/cli-util';

export function generateEcore(model: VModel, filePath: string, destination: string | undefined): string {
  const data = extractDestinationAndName(filePath, destination);
  const generatedFilePath = `${path.join(data.destination, data.name)}.vmsc`;

  const fileNode = new CompositeGeneratorNode();

  fileNode.append('{', NL, '');
  model.VPackage.forEach(vpackage => fileNode.append(generateEPackage(vpackage), NL));

  if (!fs.existsSync(data.destination)) {
    fs.mkdirSync(data.destination, { recursive: true });
  }
  fs.writeFileSync(generatedFilePath, toString(fileNode));
  return generatedFilePath;
}

function generateEPackage(vpackage: VPackage): string {
  return `<ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name=${vpackage.name}${vpackage.VUri ? " nsURI=" + vpackage.VUri : ""}${vpackage.VPrefix ? " nsPrefix=" + vpackage.VPrefix : ""}>
    ${vpackage.VComponents ? vpackage.VComponents.map(generateEClassifier).join("\n") : ""}
    </ecore:EPackage>`;
}

function generateEClassifier(vclassifier: VStructuralComponent): string {
  if (vclassifier.$type === "VEnum")
    return generateEEnum(vclassifier);
  else if (vclassifier.$type === "VClass")
    return generateEClass(vclassifier);
  else
    return "";
}

function generateEClass(vclass: VClass): string {
  return `<eClassifiers xsi:type="ecore:EClass" name=${vclass.name} ${vclass.IsAbstract ? " abstract=true" : ""}${vclass.IsInterface ? " interface=true" : ""} eSuperTypes=\"${vclass.VSuperType ? vclass.VSuperType.map(generateESuperType).join("\n") + "\"" : ""}>
        ${vclass.VStructuralFeatures ? vclass.VStructuralFeatures.map(generateEStructuralFeature).join("\n") : ""}
       
        ${vclass.VOperations ? vclass.VOperations.map(generateEOperation).join("\n") : ""}
        ${vclass.VAnnotations ? vclass.VAnnotations.map(generateEAnnotation).join("\n") : ""}
    </eClassifiers>`;
}


function generateEStructuralFeature(vstructuralfeature: VStructuralFeatures): string {
  if (vstructuralfeature.$type === "VAttribute")
    return generateEAttribute(vstructuralfeature)
  else if (vstructuralfeature.$type === "VReference")
    return generateEReference(vstructuralfeature)
  else
    return "";
}

function generateEAttribute(vattribute: VAttribute): string {
  return `<eStructuralFeatures xsi:type="ecore:EAttribute" name=${vattribute.name} ${vattribute.IsNotOrdered ? " ordered=\"false\"" : ""}${vattribute.IsNotUnique ? " unique=\"false\"" : ""}${vattribute.LowerBound ? " lowerBound=" + vattribute.LowerBound + "\"" : ""}${vattribute.UpperBound ? " upperBound=\"" + vattribute.UpperBound + "\"" : ""} eType=${generateEType(vattribute.VType)}${vattribute.IsNotChangeable ? " changeable=\"false\"" : ""}${vattribute.IsVolatile ? " volatile=\"true\"" : ""}${vattribute.IsTransient ? " transient=\"true\"" : ""}${vattribute.IsUnsettable ? " unsettable=\"true\"" : ""}${vattribute.IsDerived ? " derived=\"true\"" : ""}${vattribute.IsID ? " iD=\"true\"" : ""}/>`;
}

function generateEReference(vreference: VReference): string {
  return `<eStructuralFeatures xsi:type="ecore:EReference" name=${vreference.name} ${vreference.IsNotOrdered ? " ordered=\"false\"" : ""}${vreference.IsNotUnique ? " unique=\"false\"" : ""}${vreference.LowerBound ? " lowerBound=" + vreference.LowerBound + "\"" : ""}${vreference.UpperBound ? " upperBound=\"" + vreference.UpperBound + "\"" : ""} eType=${generateETypeReference(vreference.VType)}${vreference.IsNotChangeable ? " changeable=\"false\"" : ""}${vreference.IsContainer ? " container=\"true\"" : ""}${vreference.IsContainment ? " containment=\"true\"" : ""}${vreference.IsDerived ? " derived=\"true\"" : ""}/>`;
}

function generateEEnum(vclassifier: VStructuralComponent): string {
  throw new Error('Function not implemented.');
}

function generateESuperType(value: Reference<VClass>, index: number, array: Reference<VClass>[]): unknown {
  // console.log(value);
  // console.log(index);
  // console.log(array);
  // add  #// to each name of the class
  const x = array.map(v => `#//${v.$nodeDescription?.name.slice(1, -1)} `);
  console.log(array[0].$nodeDescription?.name.slice(1, -1));
  return x;
}

function generateEOperation(value: VOperation, index: number, array: VOperation[]): unknown {
  throw new Error('Function not implemented.');
}


function generateEAnnotation(value: VAnnotation, index: number, array: unknown[]): unknown {
  throw new Error('Function not implemented.');
}

function generateEType(vtype: string): string {
  switch (vtype) {
    case "\"VInt\"":
      return `"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"`;
    case "\"VString\"":
      return `"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"`;
    case "\"VBoolean\"":
      return `"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean"`;
    case "\"VFloat\"":
      return `"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble"`;
    default:
      return "";
  }
}

function generateETypeReference(vtypes: Reference<VClass>): string {
  return `"#//${vtypes.$nodeDescription?.name.slice(1, -1)}"`;
}

