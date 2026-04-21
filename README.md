# No-Vulkan

No-Vulkan is a Minecraft Java Edition utility mod that prevents the game from loading the Vulkan graphics API, forcing it to use OpenGL instead.
Designed for mod developers who need to debug and test their mods in OpenGL environments ahead of the Vulkan support introduced in version 26.2.

**This mod no longer works in Minecraft 26.2 snapshot 4.** If you want to force the graphics API to use OpenGL, launch the client with  `--graphicsBackend opengl` argument.

## Requirements

- Minecraft 26.2-snapshot-2+
- Fabric Loader 0.19.1+

## Overview

This mod forces the graphics API used by Minecraft to OpenGL, ignoring the graphics API setting from command line arguments or options.txt.

The following is an example of Minecraft startup log output when the mod is active:

```
[Render thread/INFO]: Initializing No-Vulkan mod
[Render thread/INFO]: Backend library: LWJGL version 3.4.1-snapshot
[Render thread/WARN]: Graphics backend forced to opengl by launch argument, in-game preferred graphics backend setting is ignored
```
