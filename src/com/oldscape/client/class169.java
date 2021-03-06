package com.oldscape.client;
import java.io.IOException;

public abstract class class169 {

	static int field2228;

	public abstract boolean vmethod3335(int var1) throws IOException;

	public abstract int vmethod3334() throws IOException;

	public abstract int vmethod3349() throws IOException;

	public abstract int vmethod3348(byte[] var1, int var2, int var3) throws IOException;

	public abstract void vmethod3337(byte[] var1, int var2, int var3) throws IOException;

	public abstract void vmethod3331();

	static int method3291(int var0, int var1) {
		Overlay var2 = class95.getOverlayDefinition(var0);
		if (var2 == null) {
			return var1;
		} else if (var2.otherRgbColor >= 0) {
			return var2.otherRgbColor | -16777216;
		} else if (var2.texture >= 0) {
			int var3 = class27.method247(Graphics3D.textureLoader.getAverageTextureRGB(var2.texture), 96);
			return Graphics3D.colorPalette[var3] | -16777216;
		} else if (var2.color == 16711935) {
			return var1;
		} else {
			int var4 = var2.hue;
			int var5 = var2.saturation;
			int var6 = var2.lightness;
			if (var6 > 179) {
				var5 /= 2;
			}

			if (var6 > 192) {
				var5 /= 2;
			}

			if (var6 > 217) {
				var5 /= 2;
			}

			if (var6 > 243) {
				var5 /= 2;
			}

			int var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
			int var8 = class27.method247(var7, 96);
			return Graphics3D.colorPalette[var8] | -16777216;
		}
	}

	static final String method3290(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		return var1.length() > 9
				? " " + class45.getColTags(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")"
						+ "</col>"
				: (var1.length() > 6
						? " " + class45.getColTags(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " ("
								+ var1 + ")" + "</col>"
						: " " + class45.getColTags(16776960) + var1 + "</col>");
	}
}
