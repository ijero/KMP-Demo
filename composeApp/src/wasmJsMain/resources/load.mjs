import { instantiate } from './lovehut.uninstantiated.mjs';

await wasmSetup;

instantiate({ skia: Module['asm'] });
