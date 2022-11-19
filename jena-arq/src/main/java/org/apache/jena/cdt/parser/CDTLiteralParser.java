/* Generated By:JavaCC: Do not edit this line. CDTLiteralParser.java */
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

public class CDTLiteralParser extends CDTLiteralParserBase implements CDTLiteralParserConstants {

// --- Entry point for cdt:List literals
  final public List<CDTValue> List() throws ParseException {
                          List<CDTValue> l = new ArrayList<CDTValue>();
    jj_consume_token(LBRACKET);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
    case FALSE:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
    case IRIref:
    case BLANK_NODE_LABEL:
    case NULL:
    case LBRACE:
    case LBRACKET:
      NonEmptyListContent(l);
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    jj_consume_token(RBRACKET);
    {if (true) return l;}
    throw new Error("Missing return statement in function");
  }

  final public void NonEmptyListContent(List<CDTValue> l) throws ParseException {
    ListElement(l);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      jj_consume_token(COMMA);
      ListElement(l);
    }
  }

  final public void ListElement(List<CDTValue> l) throws ParseException {
                                       String iri; Node n; List<CDTValue> subList; Map<CDTKey,CDTValue> m;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IRIref:
      iri = IRI_REF();
                          n = createNode(iri);  l.add( CDTFactory.createValue(n) );
      break;
    case BLANK_NODE_LABEL:
      n = BlankNode();
                          l.add( CDTFactory.createValue(n) );
      break;
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
      n = RDFLiteral();
                          l.add( CDTFactory.createValue(n) );
      break;
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
      n = NumericLiteral();
                          l.add( CDTFactory.createValue(n) );
      break;
    case TRUE:
    case FALSE:
      n = BooleanLiteral();
                          l.add( CDTFactory.createValue(n) );
      break;
    case NULL:
      jj_consume_token(NULL);
                          l.add( CDTFactory.getNullValue() );
      break;
    case LBRACKET:
      subList = List();
                          l.add( CDTFactory.createValue(subList) );
      break;
    case LBRACE:
      m = Map();
                          l.add( CDTFactory.createValue(m) );
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

// --- Entry point for cdt:Map literals
  final public Map<CDTKey,CDTValue> Map() throws ParseException {
                               Map<CDTKey,CDTValue> m = new HashMap<CDTKey,CDTValue>();
    jj_consume_token(LBRACE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
    case FALSE:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
    case IRIref:
    case BLANK_NODE_LABEL:
      NonEmptyMapContent(m);
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    jj_consume_token(RBRACE);
    {if (true) return m;}
    throw new Error("Missing return statement in function");
  }

  final public void NonEmptyMapContent(Map<CDTKey,CDTValue> m) throws ParseException {
    MapEntry(m);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMMA);
      MapEntry(m);
    }
  }

  final public void MapEntry(Map<CDTKey,CDTValue> m) throws ParseException {
                                          CDTKey key; CDTValue value;
    key = MapKey();
    jj_consume_token(COLON);
    value = MapValue();
    final CDTValue oldValue = m.put(key, value);
    if ( oldValue != null ) {if (true) throw new ParseException("map with non-unique key (" + key.toString() + ")");}
  }

  final public CDTKey MapKey() throws ParseException {
                    String iri; Node n;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IRIref:
      iri = IRI_REF();
                          n = createNode(iri);  {if (true) return CDTFactory.createKey(n);}
      break;
    case BLANK_NODE_LABEL:
      n = BlankNode();
                          {if (true) return CDTFactory.createKey(n);}
      break;
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
      n = RDFLiteral();
                          {if (true) return CDTFactory.createKey(n);}
      break;
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
      n = NumericLiteral();
                          {if (true) return CDTFactory.createKey(n);}
      break;
    case TRUE:
    case FALSE:
      n = BooleanLiteral();
                          {if (true) return CDTFactory.createKey(n);}
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public CDTValue MapValue() throws ParseException {
                        String iri; Node n; List<CDTValue> subList; Map<CDTKey,CDTValue> m;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IRIref:
      iri = IRI_REF();
                          n = createNode(iri);  {if (true) return CDTFactory.createValue(n);}
      break;
    case BLANK_NODE_LABEL:
      n = BlankNode();
                          {if (true) return CDTFactory.createValue(n);}
      break;
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
      n = RDFLiteral();
                          {if (true) return CDTFactory.createValue(n);}
      break;
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
      n = NumericLiteral();
                          {if (true) return CDTFactory.createValue(n);}
      break;
    case TRUE:
    case FALSE:
      n = BooleanLiteral();
                          {if (true) return CDTFactory.createValue(n);}
      break;
    case NULL:
      jj_consume_token(NULL);
                          {if (true) return CDTFactory.getNullValue();}
      break;
    case LBRACKET:
      subList = List();
                          {if (true) return CDTFactory.createValue(subList);}
      break;
    case LBRACE:
      m = Map();
                          {if (true) return CDTFactory.createValue(m);}
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

// ---- Basic terms
  final public String IRI_REF() throws ParseException {
                     Token t ;
    t = jj_consume_token(IRIref);
    {if (true) return resolveQuotedIRI(t.image, t.beginLine, t.beginColumn) ;}
    throw new Error("Missing return statement in function");
  }

  final public Node BlankNode() throws ParseException {
                      Token t = null ;
    t = jj_consume_token(BLANK_NODE_LABEL);
    {if (true) return createBNode(t.image, t.beginLine, t.beginColumn);}
    throw new Error("Missing return statement in function");
  }

  final public Node NumericLiteral() throws ParseException {
                          Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER:
      t = jj_consume_token(INTEGER);
                  {if (true) return createLiteralInteger(t.image);}
      break;
    case DECIMAL:
      t = jj_consume_token(DECIMAL);
                  {if (true) return createLiteralDecimal(t.image);}
      break;
    case DOUBLE:
      t = jj_consume_token(DOUBLE);
                  {if (true) return createLiteralDouble(t.image);}
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Node BooleanLiteral() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
      jj_consume_token(TRUE);
            {if (true) return XSD_TRUE;}
      break;
    case FALSE:
      jj_consume_token(FALSE);
             {if (true) return XSD_FALSE;}
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Node RDFLiteral() throws ParseException {
                      String lex = null ;
    lex = String();
    String lang = null ; String dt = null ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LANGTAG:
    case DATATYPE:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LANGTAG:
        lang = Langtag();
        break;
      case DATATYPE:
        jj_consume_token(DATATYPE);
        dt = IRI_REF();
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    {if (true) return createLiteral(lex, lang, dt);}
    throw new Error("Missing return statement in function");
  }

  final public String Langtag() throws ParseException {
                     Token t ;
    t = jj_consume_token(LANGTAG);
    String lang = stripChars(t.image, 1) ; {if (true) return lang ;}
    throw new Error("Missing return statement in function");
  }

  final public String String() throws ParseException {
                    Token t ;  String lex ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL1:
      t = jj_consume_token(STRING_LITERAL1);
                            lex = stripQuotes(t.image) ;
      break;
    case STRING_LITERAL2:
      t = jj_consume_token(STRING_LITERAL2);
                            lex = stripQuotes(t.image) ;
      break;
    case STRING_LITERAL_LONG1:
      t = jj_consume_token(STRING_LITERAL_LONG1);
                                 lex = stripQuotes3(t.image) ;
      break;
    case STRING_LITERAL_LONG2:
      t = jj_consume_token(STRING_LITERAL_LONG2);
                                 lex = stripQuotes3(t.image) ;
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
      lex = unescapeStr(lex,  t.beginLine, t.beginColumn) ;
      {if (true) return lex ;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public CDTLiteralParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x2c6f0f80,0x80000000,0x2c6f0f80,0x6f0f80,0x80000000,0x6f0f80,0x2c6f0f80,0xe00,0x180,0x800000,0x800000,0xf0000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x2,0x2,0x0,};
   }

  /** Constructor with InputStream. */
  public CDTLiteralParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CDTLiteralParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CDTLiteralParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public CDTLiteralParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new CDTLiteralParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public CDTLiteralParser(CDTLiteralParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CDTLiteralParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[40];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 40; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
