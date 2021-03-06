package com.oldscape.client;
import java.util.Comparator;

public class OwnWorldComparator implements Comparator {

	static int[] field866;

	boolean field865;

	int method1234(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.field865) {
				if (Client.world == var1.world) {
					return -1;
				}

				if (var2.world == Client.world) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1234((GrandExchangeEvent) var1, (GrandExchangeEvent) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static int method1235(int var0, Script var1, boolean var2) {
		if (var0 == 5630) {
			Client.field915 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	static final void method1247(PendingSpawn var0) {
		int var1 = 0;
		int var2 = -1;
		int var3 = 0;
		int var4 = 0;
		if (var0.type == 0) {
			var1 = class255.region.getWallObjectHash(var0.level, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class255.region.method2879(var0.level, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class255.region.method2888(var0.level, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class255.region.getGroundObjectHash(var0.level, var0.x, var0.y);
		}

		if (var1 != 0) {
			int var5 = class255.region.getObjectFlags(var0.level, var0.x, var0.y, var1);
			var2 = var1 >> 14 & 32767;
			var3 = var5 & 31;
			var4 = var5 >> 6 & 3;
		}

		var0.field1146 = var2;
		var0.field1147 = var3;
		var0.field1144 = var4;
	}

	static final void method1248() {
		Client.field1060 = Client.cycleCntr;
	}
}
