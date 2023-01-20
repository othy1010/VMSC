import { startLanguageServer } from 'langium';
import { NodeFileSystem } from 'langium/node';
import { createConnection, ProposedFeatures } from 'vscode-languageserver/node';
import { createVmscServices } from './vmsc-module';

// Create a connection to the client
const connection = createConnection(ProposedFeatures.all);

// Inject the shared services and language-specific services
const { shared } = createVmscServices({ connection, ...NodeFileSystem });

// Start the language server with the shared services
startLanguageServer(shared);
