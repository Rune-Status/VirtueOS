package com.oldscape.client;

public final class BoundingBox3D extends BoundingBox {

	static Widget field259;

	final int int1;

	final int int2;

	final int int3;

	final int int4;

	final int int5;

	final int int6;

	final int color;

	BoundingBox3D(Model var1, int var2, int var3, int var4, int var5) {
		this.int1 = var2 + var1.centerX - var1.extremeX;
		this.int2 = var3 + var1.centerY - var1.extremeY;
		this.int3 = var4 + var1.centerZ - var1.extremeZ;
		this.int4 = var2 + var1.centerX + var1.extremeX;
		this.int5 = var3 + var1.centerY + var1.extremeY;
		this.int6 = var4 + var1.extremeZ + var1.centerZ;
		this.color = var5;
	}

	@Override
	public final void vmethod46() {
		for (int var4 = 0; var4 < 8; ++var4) {
			int var1 = (var4 & 1) == 0 ? this.int1 : this.int4;
			int var2 = (var4 & 2) == 0 ? this.int2 : this.int5;
			int var3 = (var4 & 4) == 0 ? this.int3 : this.int6;
			if ((var4 & 1) == 0) {
				class27.method245(var1, var2, var3, this.int4, var2, var3, this.color);
			}

			if ((var4 & 2) == 0) {
				class27.method245(var1, var2, var3, var1, this.int5, var3, this.color);
			}

			if ((var4 & 4) == 0) {
				class27.method245(var1, var2, var3, var1, var2, this.int6, this.color);
			}
		}

	}

	static void method48(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.dynamicWidth == 0) {
			var0.width = var0.originalWidth;
		} else if (var0.dynamicWidth == 1) {
			var0.width = var1 - var0.originalWidth;
		} else if (var0.dynamicWidth == 2) {
			var0.width = var0.originalWidth * var1 >> 14;
		}

		if (var0.buttonType == 0) {
			var0.height = var0.originalHeight;
		} else if (var0.buttonType == 1) {
			var0.height = var2 - var0.originalHeight;
		} else if (var0.buttonType == 2) {
			var0.height = var2 * var0.originalHeight >> 14;
		}

		if (var0.dynamicWidth == 4) {
			var0.width = var0.field2839 * var0.height / var0.field2840;
		}

		if (var0.buttonType == 4) {
			var0.height = var0.field2840 * var0.width / var0.field2839;
		}

		if (var0.contentType == 1337) {
			Client.field1039 = var0;
		}

		if (var3 && var0.onResizeListener != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.objs = var0.onResizeListener;
			Client.field1066.addFront(var6);
		}

	}

	static void method52(Widget var0, int var1, int var2) {
		if (var0.dynamicX == 0) {
			var0.relativeX = var0.originalX;
		} else if (var0.dynamicX == 1) {
			var0.relativeX = var0.originalX + (var1 - var0.width) / 2;
		} else if (var0.dynamicX == 2) {
			var0.relativeX = var1 - var0.width - var0.originalX;
		} else if (var0.dynamicX == 3) {
			var0.relativeX = var0.originalX * var1 >> 14;
		} else if (var0.dynamicX == 4) {
			var0.relativeX = (var0.originalX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.relativeX = var1 - var0.width - (var0.originalX * var1 >> 14);
		}

		if (var0.dynamicY == 0) {
			var0.relativeY = var0.originalY;
		} else if (var0.dynamicY == 1) {
			var0.relativeY = (var2 - var0.height) / 2 + var0.originalY;
		} else if (var0.dynamicY == 2) {
			var0.relativeY = var2 - var0.height - var0.originalY;
		} else if (var0.dynamicY == 3) {
			var0.relativeY = var2 * var0.originalY >> 14;
		} else if (var0.dynamicY == 4) {
			var0.relativeY = (var2 * var0.originalY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.relativeY = var2 - var0.height - (var2 * var0.originalY >> 14);
		}

	}
}
