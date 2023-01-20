import * as vscode from 'vscode';
import * as fs from 'fs';
import * as path from 'path';

export function myCommand() {
  const boilerplate = `
  <!DOCTYPE html>
  <html>
  <head>
      <meta charset="utf-8">
      <title>My HTML File</title>
  </head>
  <body>
      <h1>Hello, World!</h1>
  </body>
  </html>
  `;

  // Show a dialog to prompt the user for the name of the file
  vscode.window.showInputBox({ prompt: 'Enter the name of the file' }).then(async (fileName) => {
    console.log(fileName);
    // If the user enters a file name, open the file
    if (fileName) {
      // Get the workspace folder
      if (!vscode.workspace.workspaceFolders) {

        // Show a file picker dialog to allow the user to select a folder
        vscode.window.showOpenDialog({
          canSelectFiles: false,
          canSelectFolders: true,
          canSelectMany: false,
          openLabel: 'Select Folder'
        }).then((selectedFolders) => {
          // If the user selects a folder, open it in Visual Studio Code
          if (selectedFolders && selectedFolders.length > 0) {
            vscode.commands.executeCommand('vscode.openFolder', selectedFolders[0]);

          }
        });
      }
      const workspaceFolder = vscode.workspace.workspaceFolders![0];
      fs.writeFileSync(path.join(workspaceFolder.uri.fsPath, `${fileName}.vmsc`), boilerplate);

      // Open the file in the editor
      vscode.workspace.openTextDocument(path.join(workspaceFolder.uri.fsPath, `${fileName}.vmsc`)).then((doc) => {
        vscode.window.showTextDocument(doc);
      });


      vscode.window.showInformationMessage('Temp file opened!');

    }
  });
}