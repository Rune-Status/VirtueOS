package com.oldscape.client;

public class class246 {
   static IndexedSprite field2979;

   static final int method4490(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   static final void method4491() {
      Client.myPlayerIndex = 0;
      int x = (SoundTaskDataProvider.localPlayer.x >> 7) + class138.baseX;
      int y = (SoundTaskDataProvider.localPlayer.y >> 7) + class23.baseY;
      if(x >= 3053 && x <= 3156 && y >= 3056 && y <= 3136) {
         Client.myPlayerIndex = 1;
      }

      if(x >= 3072 && x <= 3118 && y >= 9492 && y <= 9535) {
         Client.myPlayerIndex = 1;
      }

      if(Client.myPlayerIndex == 1 && x >= 3139 && x <= 3199 && y >= 3008 && y <= 3062) {
         Client.myPlayerIndex = 0;
      }

   }
}
