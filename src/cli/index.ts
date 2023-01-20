import chalk from 'chalk';
import { Command } from 'commander';
import { VModel } from '../language-server/generated/ast';
import { VmscLanguageMetaData } from '../language-server/generated/module';
import { createVmscServices } from '../language-server/vmsc-module';
import { extractAstNode } from './cli-util';
import { generateEcore } from '../generators/EcoreGenerator';
import { NodeFileSystem } from 'langium/node';
import { generateLangium } from '../generators/LangiumGenerator';

export const generateAction = async (fileName: string, opts: GenerateOptions): Promise<void> => {
    const services = createVmscServices(NodeFileSystem).Vmsc;
    const model = await extractAstNode<VModel>(fileName, services);
    const generatedFilePath = generateEcore(model, fileName, opts.destination);
    console.log(chalk.green(`Ecore code generated successfully: ${generatedFilePath}`));
};
export const generateAction2 = async (fileName: string, opts: GenerateOptions): Promise<void> => {
    const services = createVmscServices(NodeFileSystem).Vmsc;
    const model = await extractAstNode<VModel>(fileName, services);
    const generatedFilePath = generateLangium(model, fileName, opts.destination);
    console.log(chalk.green(`Ecore code generated successfully: ${generatedFilePath}`));
};

export type GenerateOptions = {
    destination?: string;
}

export default function (): void {
    const program = new Command();

    program
        // eslint-disable-next-line @typescript-eslint/no-var-requires
        .version(require('../../package.json').version);

    const fileExtensions = VmscLanguageMetaData.fileExtensions.join(', ');
    program
        .command('generateEcore')
        .argument('<file>', `source file (possible file extensions: ${fileExtensions})`)
        .option('-d, --destination <dir>', 'destination directory of generating')
        .description('generates Ecore from vmsc file')
        .action(generateAction);
    program
        .command('generateLangium')
        .argument('<file>', `source file (possible file extensions: ${fileExtensions})`)
        .option('-d, --destination <dir>', 'destination directory of generating')
        .description('generates Langium from vmsc file')
        .action(generateAction2);

    program.parse(process.argv);
}
