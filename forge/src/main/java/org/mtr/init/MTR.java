package org.mtr.init;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import org.mtr.mod.Init;
import org.mtr.mod.InitClient;

@Mod(Init.MOD_ID)
public final class MTR {

	public MTR() {
		Init.init();
		if (FMLEnvironment.dist == Dist.CLIENT) {
			InitClient.init();
		}
	}
}
