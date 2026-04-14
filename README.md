# No-Vulkan

No-Vulkan is a Minecraft Java Edition utility mod that prevents the game from loading the Vulkan graphics API, forcing it to use OpenGL instead. 
Designed for mod developers who need to debug and test their mods in OpenGL environments ahead of the Vulkan support introduced in version 26.2.

This mod forces the graphics API used by Minecraft to OpenGL, ignoring the graphics API setting from command line arguments or options.txt.
