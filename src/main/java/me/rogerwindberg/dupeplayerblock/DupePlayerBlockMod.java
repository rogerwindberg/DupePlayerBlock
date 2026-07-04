package me.rogerwindberg.dupeplayerblock;

import net.fabricmc.api.ModInitializer;

public class DupePlayerBlockMod implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("[DupePlayerBlock] Active: blocking duplicate logins for already connected players.");
	}
}
