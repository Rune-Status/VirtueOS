package com.oldscape.client;

public class Script extends CacheableNode {
   static NodeCache field1459;
   static int field1455;
   int[] instructions;
   int[] intOperands;
   String[] stringOperands;
   int localIntCount;
   int localStringCount;
   int intStackCount;
   int stringStackCount;
   IterableHashTable[] switches;

   static {
      field1459 = new NodeCache(128);
   }

   IterableHashTable[] method2016(int var1) {
      return new IterableHashTable[var1];
   }
}
