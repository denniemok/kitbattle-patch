<br><br>
<p align="center">
    <img src=https://i.imgur.com/ymrFc2I.png"><br>
    <img src="https://img.shields.io/badge/Version-1.0.1-green"> <img src="https://img.shields.io/badge/Spigot-1.8+-lightgrey"> <img src="https://img.shields.io/badge/License-MIT-blue"> <img src="https://img.shields.io/badge/Language-Java-yellow">
</p>

<p align="center">
    <a href="https://www.spigotmc.org/resources/112496/">Spigot Page</a> •
    <a href="https://github.com/denniemok/kitbattle-patch/releases">Latest Release</a> •
    <a href="https://github.com/denniemok/kitbattle-patch/wiki">User Guide</a> •
    <a href="https://github.com/denniemok/kitbattle-patch/issues">Issue Tracker</a>
</p>
<br>

<hr>

### Introduction
This plugin is made to address 2 well-known KitBattle exploits: Iron Fist Exploit and Smuggling Exploit. While the fixes are pretty straightforward, the exploits themselves are rather intricate. A really big shoutout to the dedicated players at BattleAsya, who consistently go above and beyond in their quest to unearth peculiar and amusing bugs.

Note that this plugin is specifically made for use with a [KitBattle Advanced (Premium)](https://www.spigotmc.org/resources/kitbattle-advanced.2872/) instance. All exploits mentioned on this page can be replicated on a clean Spigot 1.8.8 server with KitBattle installed.

<hr>

### Iron Fist (Damage Bug)
Undoubtedly the most long-lasting KitBattle exploit, Iron Fist (a.k.a Damage Bug), has gained notoriety for allowing sword damage from a previously selected kit to persist even after a player logs out and back in.

<hr>

### Smuggling (Teleport Bug)
Smuggling (a.k.a. Teleport Bug) enables players to conveniently transport kit items between arenas upon teleportation, resulting in the possession of items or effects from multiple kits, thereby disrupting the game balance.

There are multiple occasions in which smuggling can come into play, within which FFA⇔Challenges Smuggling: Kit-Lock Bypass Variant and FFA⇔Spawn Smuggling: Potion Variant are among the most abused ones.

In a Kit-Lock Bypass scenario, players illegally transport kit items from a normal free-for-all arena, where all kits are accessible, into a kit-locked challenge arena (e.g., 1v1, 2v2, 3v3, etc.).

In a Return-To-Spawn Transport scenario, players take advantage of the /kb spawn delay to illegally transport an item back and forth in the main arena. This variant, however, has been addressed in recent versions but may still exist in older iterations of KitBattle.

<hr>

### Lag Machine (Arrow Particles Crash)
Abusers persistently abuse particles by generating hundreds of laggy arrows (with KitBattle trails) at spawn to crash the server. Very often, this is done skillfully as these arrows have to get stuck somewhere and not get cleaned up. Since arrows are no longer just bare arrows but entities with particles (heavier tracing and calculation), this exploit can easily destroy your server TPS and crash players with suboptimal PCs.

Although this bug is not covered by this patch, it can still be fixed easily without this plugin.

<hr>

### Runtime Requirements
- Java 8 or above
- Spigot 1.8 or above, or equivalent forks
- Permission plugin (Optional)

<hr>

### Build Dependencies
- Java 8
- Spigot-API 1.20.1 R0.1

<hr>

This project is released under the [MIT License](https://opensource.org/license/mit/).
