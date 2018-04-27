package com.oldscape.client;

import java.util.Iterator;

public class CombatInfo1 extends Node {
   static MachineInfo platformInfo;
   int cycle;
   int healthRatio;
   int health;
   int int2;

   CombatInfo1(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.healthRatio = var2;
      this.health = var3;
      this.int2 = var4;
   }

   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.healthRatio = var2;
      this.health = var3;
      this.int2 = var4;
   }

   public static Sequence getAnimation(int var0) {
      Sequence var1 = (Sequence)Sequence.sequences.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Sequence.seq_ref.getConfigData(12, var0);
         var1 = new Sequence();
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         Sequence.sequences.put(var1, (long)var0);
         return var1;
      }
   }

   static void method1672() {
      Iterator var0 = class95.messages.iterator();

      while(var0.hasNext()) {
         MessageNode var1 = (MessageNode)var0.next();
         var1.method1162();
      }

   }

   public static final void method1677(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= 48000) {
         AbstractSoundSystem.sampleRate = var0;
         AbstractSoundSystem.audioHighMemory = var1;
         Varbit.field3538 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method1681(String var0, boolean var1) {
      if(Client.field1097) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class20.font_p12full.method5507(var0, 250);
         int var6 = class20.font_p12full.method5508(var0, 250) * 13;
         Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
         Rasterizer2D.drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
         class20.font_p12full.method5514(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         MapLabel.method411(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2);
         if(var1) {
            MapCacheArchiveNames.rasterProvider.drawFull(0, 0);
         } else {
            int var7 = var3;
            int var8 = var4;
            int var9 = var5;
            int var10 = var6;

            for(int var11 = 0; var11 < Client.widgetCount; ++var11) {
               if(Client.widgetBoundsWidth[var11] + Client.widgetPositionX[var11] > var7 && Client.widgetPositionX[var11] < var9 + var7 && Client.widgetPositionY[var11] + Client.widgetBoundsHeight[var11] > var8 && Client.widgetPositionY[var11] < var10 + var8) {
                  Client.field1073[var11] = true;
               }
            }
         }

      }
   }

   static boolean method1679() {
      return Client.field1016 || KeyFocusListener.keyPressed[81];
   }
}
