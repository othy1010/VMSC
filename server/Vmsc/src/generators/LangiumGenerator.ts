import fs from 'fs';
import { CompositeGeneratorNode, NL, toString } from 'langium';
import path from 'path';
import { VAttribute, VClass, VModel, VPackage } from '../language-server/generated/ast';
import { extractDestinationAndName } from '../cli/cli-util';

export function generateLangium(model: VModel, filePath: string, destination: string | undefined): string {
  const data = extractDestinationAndName(filePath, destination);
  const generatedFilePath = `${path.join(data.destination, data.name)}.langium`;

  const fileNode = new CompositeGeneratorNode();
  const vpackage = model.VPackage[0];
  fileNode.append(`grammar ${vpackage.name.slice(1, -1)}`, NL, NL, 'entry ');
  // const vcomponent = vpackage.VComponents[0];

  vpackage.VComponents.forEach(vcomp => fileNode.append(generateElement(vcomp), NL));

  if (!fs.existsSync(data.destination)) {
    fs.mkdirSync(data.destination, { recursive: true });
  }
  fileNode.append(`
terminal FLOAT: /\\d+.\\d+/;
hidden terminal WS: /\\s+|','+/;
terminal ID: /["][_a-zA-Z][\\w_]*["]/;
terminal STRING: /["][^"]*["]/;
terminal INT returns number: /[0-9]+/;


hidden terminal ML_COMMENT: /\\/\\*[\\s\\S]*?\\*\\//;
hidden terminal SL_COMMENT: /\\/\\/[^\\n\\r]*/;
  `);
  fs.writeFileSync(generatedFilePath, toString(fileNode));
  return generatedFilePath;
}

function generateElement(e: any): string {
  switch (e.$type) {

    case "VPackage":
      return generatePackage(e);
    case "VClass":
      return generateClass(e);
    case "VAttribute":
      return generateAttribute(e);
    case "VReference":
      return generateReference(e);
    case "VEnum":
      return generateEnum(e);
    case "VEnumLiteral":
      return generateEnumLiteral(e);
    case "VAttribute":
      return generateAttribute(e);
    default:
      return "";
  }
}

function generatePackage(e: VPackage): string {
  return "";
}
// A returns A:
// 	{A}
// 	'A'
// 	'{'
// 		('aa' aa=EInt)?
// 		('ab' ab=[B|EString])?
// 	'}';

function generateClass(e: VClass): string {

  return `${e.name.slice(1, -1)} : 
  \"${e.name.slice(1, -1)}\"
  name=ID
  '{'
${e.VStructuralFeatures.map(a => generateElement(a)).join('\n')}
    '}';
    `
}

function generateAttribute(e: VAttribute): string {
  const name = e.name.substring(1, e.name.length - 1)
  return `${e.name} ${name}=${generateType(e.VType)}`;
}

function generateReference(e: any): string {
  return "";
}

function generateEnum(e: any): string {
  return "";
}

function generateEnumLiteral(e: any): string {
  return "";
}

function generateType(type: string) {
  switch (type.substring(1, type.length - 1)) {
    case "VInt":
      return "INT";
    case "VString":
      return "STRING";
    case "VFloat":
      return "FLOAT";
    case "VBoolean":
      return "BOOLEAN";
    default:
      return "ID";
  }
}

