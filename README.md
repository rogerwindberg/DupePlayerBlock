# DupePlayerBlock
A server-side mod/plugin for Minecraft using Fabric/Paper that block duplicate player joins

Download: https://github.com/rogerwindberg/DupePlayerBlock/releases

This project was based on [oxygencraft/DuplicatePlayerJoin](https://github.com/oxygencraft/DuplicatePlayerJoin).

It prevents bots or malicious players from entering your server using your nickname. The server's default behavior is to drop your session with the message "you logged in from another location"; even if you have an authentication mod to prevent the other player or bot from connecting as your character, it remains annoying because you get disconnected whenever an attempt is made using your nickname. This mod changes the server's default login behavior: instead of disconnecting you, it blocks the other player or bot from connecting and displays the message "This account is already connected to the server."

## Build Instructions

### Fabric mod

1. Make sure Java 21 is installed.
2. From the project root, run:
   ```bash
   ./gradlew clean build
   ```
3. The built jar will be generated in the `build/libs` directory.

### Paper plugin

1. Go to the `Paper` directory.
2. Run:
   ```bash
   mvn clean package
   ```
3. The built jar will be generated in the `Paper/target` directory.
