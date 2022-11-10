/* Generated By:JavaCC: Do not edit this line. CDTLiteralParserTokenManager.java */
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.cdt.parser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jena.cdt.*;
import org.apache.jena.graph.Node;
import org.apache.jena.ttl.turtle.TurtleParserBase;

/** Token Manager. */
public class CDTLiteralParserTokenManager implements CDTLiteralParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(0, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(0, 0);
      case 12:
         jjmatchedKind = 5;
         return jjMoveNfa_0(0, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(0, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 31;
         return jjMoveNfa_0(0, 0);
      case 58:
         jjmatchedKind = 32;
         return jjMoveNfa_0(0, 0);
      case 64:
         jjmatchedKind = 34;
         return jjMoveNfa_0(0, 0);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 91:
         jjmatchedKind = 29;
         return jjMoveNfa_0(0, 0);
      case 93:
         jjmatchedKind = 30;
         return jjMoveNfa_0(0, 0);
      case 94:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 123:
         jjmatchedKind = 27;
         return jjMoveNfa_0(0, 0);
      case 125:
         jjmatchedKind = 28;
         return jjMoveNfa_0(0, 0);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 0);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 94:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 1);
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000100L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 2);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 3;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 101:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 3;
         }
         break;
      case 108:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 3);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 4;
         }
         break;
      case 101:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 4;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 4);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0xfffe7000fffffff6L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x7e00000000ffffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0x0L, 0xbfff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec6 = {
   0x3000L, 0xffff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec8 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffL
};
static final long[] jjbitVec9 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffffL
};
static final long[] jjbitVec10 = {
   0x0L, 0x0L, 0x80000000000000L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec11 = {
   0xffffffffffffffffL, 0xbfffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec12 = {
   0x8000000000003000L, 0xffff000000000001L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 74;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAddStates(0, 7);
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjCheckNAddStates(8, 12);
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(54, 56);
                  else if (curChar == 60)
                     jjCheckNAddTwoStates(37, 38);
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 34;
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 22;
                  if (curChar == 34)
                     jjCheckNAddStates(13, 15);
                  else if (curChar == 39)
                     jjCheckNAddStates(16, 18);
                  break;
               case 1:
                  if ((0x8400000000L & l) != 0L && kind > 15)
                     kind = 15;
                  break;
               case 2:
                  if (curChar == 39)
                     jjCheckNAddStates(16, 18);
                  break;
               case 3:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 5:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 6:
                  if (curChar == 39 && kind > 16)
                     kind = 16;
                  break;
               case 7:
                  if (curChar == 34)
                     jjCheckNAddStates(13, 15);
                  break;
               case 8:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 10:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 11:
                  if (curChar == 34 && kind > 17)
                     kind = 17;
                  break;
               case 12:
                  if (curChar == 39)
                     jjCheckNAddStates(19, 22);
                  break;
               case 13:
               case 17:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(19, 22);
                  break;
               case 15:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(19, 22);
                  break;
               case 16:
               case 19:
                  if (curChar == 39)
                     jjCheckNAdd(17);
                  break;
               case 18:
                  if (curChar == 39)
                     jjAddStates(23, 24);
                  break;
               case 20:
                  if (curChar == 39 && kind > 18)
                     kind = 18;
                  break;
               case 21:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 23:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 34)
                     jjCheckNAddStates(25, 28);
                  break;
               case 25:
               case 29:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(25, 28);
                  break;
               case 27:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(25, 28);
                  break;
               case 28:
               case 31:
                  if (curChar == 34)
                     jjCheckNAdd(29);
                  break;
               case 30:
                  if (curChar == 34)
                     jjAddStates(29, 30);
                  break;
               case 32:
                  if (curChar == 34 && kind > 19)
                     kind = 19;
                  break;
               case 33:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 35:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 60)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 37:
                  if ((0xaffffffa00000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 38:
                  if (curChar == 62 && kind > 21)
                     kind = 21;
                  break;
               case 39:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(41, 42);
                  break;
               case 41:
                  if ((0x3ff600000000000L & l) != 0L)
                     jjCheckNAddTwoStates(41, 42);
                  break;
               case 42:
                  if ((0x3ff200000000000L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 46:
                  if (curChar == 45)
                     jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAddTwoStates(46, 47);
                  break;
               case 48:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAddStates(8, 12);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(49);
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(50, 51);
                  break;
               case 51:
                  if (curChar != 46)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(52);
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(52);
                  break;
               case 53:
                  if (curChar == 46)
                     jjCheckNAdd(54);
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(54);
                  break;
               case 55:
                  if (curChar == 46)
                     jjCheckNAdd(56);
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(56, 57);
                  break;
               case 58:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(59);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(59);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(31, 34);
                  break;
               case 61:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(61, 62);
                  break;
               case 62:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 63:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 65:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(66);
                  break;
               case 66:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(66);
                  break;
               case 67:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(67, 68);
                  break;
               case 69:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(70);
                  break;
               case 70:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(70);
                  break;
               case 71:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddStates(0, 7);
                  break;
               case 72:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(72);
                  break;
               case 73:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(54, 56);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 64)
                     jjCheckNAdd(45);
                  else if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 39;
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x14404410144044L & l) != 0L && kind > 15)
                     kind = 15;
                  break;
               case 3:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 4:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 8:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 9:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 13:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(19, 22);
                  break;
               case 14:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(19, 22);
                  break;
               case 17:
                  jjCheckNAddStates(19, 22);
                  break;
               case 25:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(25, 28);
                  break;
               case 26:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(25, 28);
                  break;
               case 29:
                  jjCheckNAddStates(25, 28);
                  break;
               case 37:
                  if ((0xc7fffffeafffffffL & l) != 0L)
                     jjAddStates(35, 36);
                  break;
               case 40:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(41, 42);
                  break;
               case 41:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(41, 42);
                  break;
               case 42:
                  if ((0x7fffffe87fffffeL & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 43:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 44:
                  if (curChar == 64)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAddTwoStates(45, 46);
                  break;
               case 47:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAddTwoStates(46, 47);
                  break;
               case 57:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(37, 38);
                  break;
               case 64:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(39, 40);
                  break;
               case 68:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(41, 42);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(16, 18);
                  break;
               case 8:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(13, 15);
                  break;
               case 13:
               case 17:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(19, 22);
                  break;
               case 25:
               case 29:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(25, 28);
                  break;
               case 37:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(35, 36);
                  break;
               case 40:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(41, 42);
                  break;
               case 41:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(41, 42);
                  break;
               case 42:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 22)
                     kind = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 74 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   49, 50, 51, 61, 62, 67, 68, 72, 49, 50, 53, 55, 60, 8, 9, 11, 
   3, 4, 6, 13, 14, 16, 18, 19, 21, 25, 26, 28, 30, 31, 33, 61, 
   62, 67, 68, 37, 38, 58, 59, 65, 66, 69, 70, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec9[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec11[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec12[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec9[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, 
"\156\165\154\154", "\173", "\175", "\133", "\135", "\54", "\72", "\136\136", "\100", null, null, 
null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fcff8f81L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[74];
private final int[] jjstateSet = new int[148];
protected char curChar;
/** Constructor. */
public CDTLiteralParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public CDTLiteralParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 74; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
