package com.oldscape.client;

public class class132 {
   public static boolean Viewport_containsMouse;
   public static int Viewport_mouseX;
   public static int Viewport_mouseY;
   public static boolean Viewport_false0;
   static int field1919;
   static int field1923;
   static int field1924;
   static int field1925;
   static int field1926;
   public static int Viewport_entityCountAtMouse;
   public static int[] Viewport_entityIdsAtMouse;
   static BuildType field1920;

   static {
      Viewport_containsMouse = false;
      Viewport_mouseX = 0;
      Viewport_mouseY = 0;
      Viewport_false0 = false;
      Viewport_entityCountAtMouse = 0;
      Viewport_entityIdsAtMouse = new int[1000];
   }

   public static int djb2Hash(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + Client.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }

   static int method2776(int var0, Script var1, boolean var2) {
      Widget var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class44.getWidget(class81.intStack[--WorldComparator.intStackSize]);
      } else {
         var3 = var2?class81.field1285:Signlink.field2218;
      }

      FontName.method5490(var3);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var3.modelType = 2;
            var3.modelId = class81.intStack[--WorldComparator.intStackSize];
            return 1;
         } else if(var0 == 1202) {
            var3.modelType = 3;
            var3.modelId = SoundTaskDataProvider.localPlayer.composition.method4385();
            return 1;
         } else {
            return 2;
         }
      } else {
         WorldComparator.intStackSize -= 2;
         int var4 = class81.intStack[WorldComparator.intStackSize];
         int var5 = class81.intStack[WorldComparator.intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemComposition var6 = class47.getItemDefinition(var4);
         var3.rotationX = var6.xan2d;
         var3.rotationZ = var6.yan2d;
         var3.rotationY = var6.zan2d;
         var3.offsetX2d = var6.offsetX2d;
         var3.offsetY2d = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if(var0 == 1205) {
            var3.field2853 = 0;
         } else if(var0 == 1212 | var6.isStackable == 1) {
            var3.field2853 = 1;
         } else {
            var3.field2853 = 2;
         }

         if(var3.field2880 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field2880;
         } else if(var3.originalWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.originalWidth;
         }

         return 1;
      }
   }
}
