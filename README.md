<p align="center">
  <img width="766" alt="DupePlayerBlock-Banner" src="https://github.com/user-attachments/assets/6ab15e88-785c-4ef8-b3a5-cea4d9d7db51" />
</p>

#
A server-side mod/plugin for Minecraft using Fabric/Paper that block duplicate player joins

<img width="627" alt="in-game message screenshot" src="https://github.com/user-attachments/assets/efb37606-845d-4f80-86c5-19cdb2705bb3" /><br>

This project was based on [oxygencraft/DuplicatePlayerJoin](https://github.com/oxygencraft/DuplicatePlayerJoin).

It prevents bots (like **Herobrine**, most common name used) or malicious players from entering your server using your nickname. The server's default behavior is to drop your session with the message "you logged in from another location"; even if you have an authentication mod to prevent the other player or bot from connecting as your character, it remains annoying because you get disconnected whenever an attempt is made using your nickname. This mod changes the server's default login behavior: instead of disconnecting you, it blocks the other player or bot from connecting and displays the message "This account is already connected to the server."

My recommendations for greater privacy and security for your server:

- Install DupePlayerBlock (just on server);
- Enable the whitelist system and allow only your friends usernames:
   - server.properties: `white-list=true` (need to save and restart the server)
   - console command: `whitelist add NicknameHere`
   - in-game command (with op): `/whitelist add NicknameHere`
- Enable the option to hide the names of online players:
   - server.properties: `hide-online-players=true` (need to save and restart the server)
- Use an authentication mod (such as [Auth](https://www.curseforge.com/minecraft/mc-mods/auth)).

## Download
In the releases section: https://github.com/rogerwindberg/DupePlayerBlock/releases

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
