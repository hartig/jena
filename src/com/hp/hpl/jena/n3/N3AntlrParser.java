// $ANTLR : "c:/home/afs/Projects/Jena2/src/com/hp/hpl/jena/n3/n3.g" -> "N3AntlrParser.java"$

package com.hp.hpl.jena.n3 ;
import java.io.* ;
import antlr.TokenStreamRecognitionException ;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class N3AntlrParser extends antlr.LLkParser
       implements N3AntlrParserTokenTypes
 {

	// Extra code for the parser.

	N3AntlrLexer lexer = null ;
	void setLexer(N3AntlrLexer _lexer) { lexer = _lexer ; }

	// Internallly generated anon id.  Avoid clash with _:xxx
	private int anonId = 0 ;
	private String genAnonId() { return "=:"+(anonId++) ; }

	// Forumla zero is the outer context.  Avoid clash with other labels.
	private int formulaId = 1 ;
	private String genFormulaId() { return "{}:"+(formulaId++) ; }

	private N3ParserEventHandler handler = null ;

	public void setEventHandler(N3ParserEventHandler h) { this.handler = h ; }

	private void startDocument()
	{
		if ( handler == null )
			throw new RuntimeException("N3AntlrParser: No sink specified") ;
		handler.startDocument() ;
	}

	private void endDocument() { handler.endDocument() ; }


	private void startFormula(String context)
	{
		handler.startFormula(lexer.getLine(), context) ;
	}

	private void endFormula(String context)
	{
		handler.endFormula(lexer.getLine(), context) ;
	}

	private String currentFormula = null ;

    private void emitQuad(AST subj, AST prop, AST obj)
	{ 
		handler.quad(lexer.getLine(), subj, prop, obj, currentFormula ) ;
	}

	private void directive(AST directive, AST arg)
	{
		handler.directive(lexer.getLine(),
						  directive, new AST[]{arg},
						  currentFormula) ;
	}

	private void directive(AST directive, AST arg1, AST arg2)
	{
		handler.directive(lexer.getLine(),
						  directive, new AST[]{arg1, arg2},
						  currentFormula) ;
	}

	public void reportError(RecognitionException ex)
	{
		handler.error(ex, "N3 error: ["+ex.line+":"+ex.column+"] "+ex.getMessage());
    }

    /** Parser error-reporting function can be overridden in subclass */
    public void reportError(String s)
    {
	    //System.err.println("N3AntlrParser(s): "+s);
		handler.error(null, "N3AntlrParser(s): ["+lexer.getLine()+":"+lexer.getColumn()+"] "+s) ;
    }

	private String damlFirst  = "http://www.daml.org/2001/03/daml+oil#first" ;
	private String damlRest   = "http://www.daml.org/2001/03/daml+oil#rest" ;
	private String damlNil    = "http://www.daml.org/2001/03/daml+oil#nil" ;


protected N3AntlrParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public N3AntlrParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected N3AntlrParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public N3AntlrParser(TokenStream lexer) {
  this(lexer,1);
}

public N3AntlrParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final void document() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST document_AST = null;
		
		try {      // for error handling
			if ( inputState.guessing==0 ) {
				startDocument() ;
			}
			{
			_loop3:
			do {
				switch ( LA(1)) {
				case AT_PREFIX:
				{
					n3Directive();
					break;
				}
				case QNAME:
				case KW_THIS:
				case STRING:
				case LBRACK:
				case LCURLY:
				case LPAREN:
				case URIREF:
				case UVAR:
				{
					statement();
					break;
				}
				default:
				{
					break _loop3;
				}
				}
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				endDocument() ;
			}
			AST tmp1_AST = null;
			tmp1_AST = (AST)astFactory.create(LT(1));
			match(Token.EOF_TYPE);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex) ; throw ex ;
			} else {
				throw ex;
			}
		}
		catch (TokenStreamRecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex.recog) ; throw ex.recog ;
			} else {
				throw ex;
			}
		}
		returnAST = document_AST;
	}
	
	public final void n3Directive() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST n3Directive_AST = null;
		
		n3Directive0();
		match(SEP);
		returnAST = n3Directive_AST;
	}
	
	public final void statement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST statement_AST = null;
		
		statement0();
		match(SEP);
		returnAST = statement_AST;
	}
	
	public final void n3Directive0() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST n3Directive0_AST = null;
		Token  d = null;
		AST d_AST = null;
		AST ns_AST = null;
		AST u_AST = null;
		
		d = LT(1);
		d_AST = (AST)astFactory.create(d);
		match(AT_PREFIX);
		nsprefix();
		ns_AST = (AST)returnAST;
		uriref();
		u_AST = (AST)returnAST;
		if ( inputState.guessing==0 ) {
			directive(d_AST, ns_AST, u_AST);
		}
		returnAST = n3Directive0_AST;
	}
	
	public final void nsprefix() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST nsprefix_AST = null;
		Token  ns = null;
		AST ns_AST = null;
		
		try {      // for error handling
			ns = LT(1);
			ns_AST = (AST)astFactory.create(ns);
			astFactory.addASTChild(currentAST, ns_AST);
			match(QNAME);
			if (!( ns.getText().endsWith(":") ))
			  throw new SemanticException(" ns.getText().endsWith(\":\") ");
			nsprefix_AST = (AST)currentAST.root;
		}
		catch (SemanticException ex) {
			if (inputState.guessing==0) {
				
						RecognitionException rEx = 
				new RecognitionException("Illegal prefix: '"+ns.getText()+"'") ; 
						rEx.line = lexer.getLine() ; rEx.column = lexer.getColumn() ; 
						throw rEx ;
					
			} else {
				throw ex;
			}
		}
		returnAST = nsprefix_AST;
	}
	
	public final void uriref() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST uriref_AST = null;
		
		AST tmp4_AST = null;
		tmp4_AST = (AST)astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp4_AST);
		match(URIREF);
		uriref_AST = (AST)currentAST.root;
		returnAST = uriref_AST;
	}
	
	public final void statement0() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST statement0_AST = null;
		AST subj_AST = null;
		
		subject();
		subj_AST = (AST)returnAST;
		propertyList(subj_AST);
		returnAST = statement0_AST;
	}
	
	public final void subject() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST subject_AST = null;
		
		item();
		astFactory.addASTChild(currentAST, returnAST);
		subject_AST = (AST)currentAST.root;
		returnAST = subject_AST;
	}
	
	public final void propertyList(
		AST subj
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST propertyList_AST = null;
		
		switch ( LA(1)) {
		case NAME_OP:
		{
			match(NAME_OP);
			anonnode(subj);
			propertyList(subj);
			break;
		}
		case QNAME:
		case KW_THIS:
		case KW_HAS:
		case KW_A:
		case KW_IS:
		case STRING:
		case EQUAL:
		case ARROW_R:
		case ARROW_L:
		case ARROW_P_L:
		case LBRACK:
		case LCURLY:
		case LPAREN:
		case URIREF:
		case UVAR:
		{
			propValue(subj);
			{
			switch ( LA(1)) {
			case SEMI:
			{
				AST tmp6_AST = null;
				tmp6_AST = (AST)astFactory.create(LT(1));
				match(SEMI);
				propertyList(subj);
				break;
			}
			case SEP:
			case RBRACK:
			case RCURLY:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			break;
		}
		case SEP:
		case RBRACK:
		case RCURLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = propertyList_AST;
	}
	
	public final void formulaList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST formulaList_AST = null;
		
		switch ( LA(1)) {
		case QNAME:
		case KW_THIS:
		case AT_PREFIX:
		case STRING:
		case LBRACK:
		case LCURLY:
		case LPAREN:
		case URIREF:
		case UVAR:
		{
			{
			switch ( LA(1)) {
			case QNAME:
			case KW_THIS:
			case STRING:
			case LBRACK:
			case LCURLY:
			case LPAREN:
			case URIREF:
			case UVAR:
			{
				statement0();
				break;
			}
			case AT_PREFIX:
			{
				n3Directive0();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case SEP:
			{
				AST tmp7_AST = null;
				tmp7_AST = (AST)astFactory.create(LT(1));
				match(SEP);
				formulaList();
				break;
			}
			case RCURLY:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			break;
		}
		case RCURLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = formulaList_AST;
	}
	
	public final void item() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST item_AST = null;
		AST n_AST = null;
		AST n1_AST = null;
		AST n2_AST = null;
		
		node();
		n_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop21:
		do {
			switch ( LA(1)) {
			case PATH:
			{
				match(PATH);
				node();
				n1_AST = (AST)returnAST;
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					
								AST a1 = (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(ANON,genAnonId()))) ;
								emitQuad(n_AST, n1_AST, a1) ;
								n_AST = a1 ;
							
				}
				break;
			}
			case RPATH:
			{
				match(RPATH);
				node();
				n2_AST = (AST)returnAST;
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					
								AST a2 = (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(ANON,genAnonId()))) ;
								emitQuad(a2, n2_AST, n_AST) ;
								n_AST = a2 ;
							
				}
				break;
			}
			default:
			{
				break _loop21;
			}
			}
		} while (true);
		}
		if ( inputState.guessing==0 ) {
			item_AST = (AST)currentAST.root;
			item_AST = n_AST ;
			currentAST.root = item_AST;
			currentAST.child = item_AST!=null &&item_AST.getFirstChild()!=null ?
				item_AST.getFirstChild() : item_AST;
			currentAST.advanceChildToEnd();
		}
		item_AST = (AST)currentAST.root;
		returnAST = item_AST;
	}
	
	public final void anonnode(
		AST label
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST anonnode_AST = null;
		String oldCxt = null ; String cxt = null ;
		
		switch ( LA(1)) {
		case LBRACK:
		{
			match(LBRACK);
			if ( inputState.guessing==0 ) {
				anonnode_AST = (AST)currentAST.root;
				if ( label == null )
					          label = (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(ANON,genAnonId()))) ;
						  anonnode_AST = label ;
						
				currentAST.root = anonnode_AST;
				currentAST.child = anonnode_AST!=null &&anonnode_AST.getFirstChild()!=null ?
					anonnode_AST.getFirstChild() : anonnode_AST;
				currentAST.advanceChildToEnd();
			}
			propertyList(label);
			astFactory.addASTChild(currentAST, returnAST);
			match(RBRACK);
			anonnode_AST = (AST)currentAST.root;
			break;
		}
		case LCURLY:
		{
			match(LCURLY);
			if ( inputState.guessing==0 ) {
				anonnode_AST = (AST)currentAST.root;
				oldCxt = currentFormula ;
						  if ( label == null )
					          label = (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(FORMULA,genFormulaId()))) ;
					      cxt = label.getText() ;
						  currentFormula = cxt ;
						  startFormula(cxt) ;
						  anonnode_AST = label ;
						
				currentAST.root = anonnode_AST;
				currentAST.child = anonnode_AST!=null &&anonnode_AST.getFirstChild()!=null ?
					anonnode_AST.getFirstChild() : anonnode_AST;
				currentAST.advanceChildToEnd();
			}
			formulaList();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				endFormula(cxt) ; currentFormula = oldCxt ;
			}
			match(RCURLY);
			anonnode_AST = (AST)currentAST.root;
			break;
		}
		case LPAREN:
		{
			match(LPAREN);
			damllist(label);
			astFactory.addASTChild(currentAST, returnAST);
			match(RPAREN);
			anonnode_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = anonnode_AST;
	}
	
	public final void propValue(
		AST subj
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST propValue_AST = null;
		AST v1_AST = null;
		AST v2_AST = null;
		
		switch ( LA(1)) {
		case QNAME:
		case KW_THIS:
		case KW_HAS:
		case KW_A:
		case STRING:
		case EQUAL:
		case ARROW_R:
		case ARROW_L:
		case ARROW_P_L:
		case LBRACK:
		case LCURLY:
		case LPAREN:
		case URIREF:
		case UVAR:
		{
			verb();
			v1_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			objectList(subj, v1_AST);
			astFactory.addASTChild(currentAST, returnAST);
			propValue_AST = (AST)currentAST.root;
			break;
		}
		case KW_IS:
		{
			verbReverse();
			v2_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			subjectList(subj, v2_AST);
			astFactory.addASTChild(currentAST, returnAST);
			propValue_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = propValue_AST;
	}
	
	public final void verb() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST verb_AST = null;
		
		switch ( LA(1)) {
		case QNAME:
		case KW_THIS:
		case STRING:
		case LBRACK:
		case LCURLY:
		case LPAREN:
		case URIREF:
		case UVAR:
		{
			item();
			astFactory.addASTChild(currentAST, returnAST);
			verb_AST = (AST)currentAST.root;
			break;
		}
		case KW_A:
		{
			kwA();
			astFactory.addASTChild(currentAST, returnAST);
			verb_AST = (AST)currentAST.root;
			break;
		}
		case EQUAL:
		{
			AST tmp16_AST = null;
			tmp16_AST = (AST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp16_AST);
			match(EQUAL);
			verb_AST = (AST)currentAST.root;
			break;
		}
		case ARROW_R:
		{
			AST tmp17_AST = null;
			tmp17_AST = (AST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp17_AST);
			match(ARROW_R);
			verb_AST = (AST)currentAST.root;
			break;
		}
		case ARROW_L:
		{
			AST tmp18_AST = null;
			tmp18_AST = (AST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp18_AST);
			match(ARROW_L);
			verb_AST = (AST)currentAST.root;
			break;
		}
		case ARROW_P_L:
		{
			match(ARROW_P_L);
			node();
			astFactory.addASTChild(currentAST, returnAST);
			match(ARROW_P_R);
			verb_AST = (AST)currentAST.root;
			break;
		}
		case KW_HAS:
		{
			kwHAS();
			item();
			astFactory.addASTChild(currentAST, returnAST);
			verb_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = verb_AST;
	}
	
	public final void objectList(
		AST subj, AST prop
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST objectList_AST = null;
		AST obj_AST = null;
		
		item();
		obj_AST = (AST)returnAST;
		if ( inputState.guessing==0 ) {
			emitQuad(subj,prop,obj_AST) ;
		}
		{
		switch ( LA(1)) {
		case COMMA:
		{
			AST tmp21_AST = null;
			tmp21_AST = (AST)astFactory.create(LT(1));
			match(COMMA);
			objectList(subj, prop);
			break;
		}
		case SEP:
		case SEMI:
		case RBRACK:
		case RCURLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		returnAST = objectList_AST;
	}
	
	public final void verbReverse() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST verbReverse_AST = null;
		AST n_AST = null;
		
		kwIS();
		node();
		n_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		kwOF();
		verbReverse_AST = (AST)currentAST.root;
		returnAST = verbReverse_AST;
	}
	
	public final void subjectList(
		AST oldSub, AST prop
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST subjectList_AST = null;
		AST obj_AST = null;
		
		item();
		obj_AST = (AST)returnAST;
		if ( inputState.guessing==0 ) {
			emitQuad(obj_AST, prop, oldSub) ;
		}
		{
		switch ( LA(1)) {
		case COMMA:
		{
			AST tmp22_AST = null;
			tmp22_AST = (AST)astFactory.create(LT(1));
			match(COMMA);
			subjectList(oldSub, prop);
			break;
		}
		case SEP:
		case SEMI:
		case RBRACK:
		case RCURLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		returnAST = subjectList_AST;
	}
	
	public final void node() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST node_AST = null;
		
		switch ( LA(1)) {
		case QNAME:
		{
			qname();
			astFactory.addASTChild(currentAST, returnAST);
			node_AST = (AST)currentAST.root;
			break;
		}
		case URIREF:
		{
			uriref();
			astFactory.addASTChild(currentAST, returnAST);
			node_AST = (AST)currentAST.root;
			break;
		}
		case LBRACK:
		case LCURLY:
		case LPAREN:
		{
			anonnode(null);
			astFactory.addASTChild(currentAST, returnAST);
			node_AST = (AST)currentAST.root;
			break;
		}
		case STRING:
		{
			literal();
			astFactory.addASTChild(currentAST, returnAST);
			node_AST = (AST)currentAST.root;
			break;
		}
		case KW_THIS:
		{
			kwTHIS();
			astFactory.addASTChild(currentAST, returnAST);
			node_AST = (AST)currentAST.root;
			break;
		}
		case UVAR:
		{
			variable();
			astFactory.addASTChild(currentAST, returnAST);
			node_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = node_AST;
	}
	
	public final void testPoint() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST testPoint_AST = null;
		AST v_AST = null;
		
		verb();
		v_AST = (AST)returnAST;
		if ( inputState.guessing==0 ) {
			AntlrUtils.ast(System.out, v_AST) ;
		}
		returnAST = testPoint_AST;
	}
	
	public final void qname() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST qname_AST = null;
		
		AST tmp23_AST = null;
		tmp23_AST = (AST)astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp23_AST);
		match(QNAME);
		qname_AST = (AST)currentAST.root;
		returnAST = qname_AST;
	}
	
	public final void literal() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST literal_AST = null;
		Token  s = null;
		AST s_AST = null;
		
		s = LT(1);
		s_AST = (AST)astFactory.create(s);
		astFactory.addASTChild(currentAST, s_AST);
		match(STRING);
		literalModifier();
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			literal_AST = (AST)currentAST.root;
			literal_AST.setType(LITERAL) ;
		}
		literal_AST = (AST)currentAST.root;
		returnAST = literal_AST;
	}
	
	public final void kwTHIS() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST kwTHIS_AST = null;
		
		AST tmp24_AST = null;
		tmp24_AST = (AST)astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp24_AST);
		match(KW_THIS);
		kwTHIS_AST = (AST)currentAST.root;
		returnAST = kwTHIS_AST;
	}
	
	public final void variable() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST variable_AST = null;
		Token  v = null;
		AST v_AST = null;
		
		v = LT(1);
		v_AST = (AST)astFactory.create(v);
		astFactory.addASTChild(currentAST, v_AST);
		match(UVAR);
		variable_AST = (AST)currentAST.root;
		returnAST = variable_AST;
	}
	
	public final void kwOF() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST kwOF_AST = null;
		
		AST tmp25_AST = null;
		tmp25_AST = (AST)astFactory.create(LT(1));
		match(KW_OF);
		returnAST = kwOF_AST;
	}
	
	public final void kwHAS() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST kwHAS_AST = null;
		
		AST tmp26_AST = null;
		tmp26_AST = (AST)astFactory.create(LT(1));
		match(KW_HAS);
		returnAST = kwHAS_AST;
	}
	
	public final void kwA() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST kwA_AST = null;
		
		AST tmp27_AST = null;
		tmp27_AST = (AST)astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp27_AST);
		match(KW_A);
		kwA_AST = (AST)currentAST.root;
		returnAST = kwA_AST;
	}
	
	public final void kwIS() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST kwIS_AST = null;
		
		AST tmp28_AST = null;
		tmp28_AST = (AST)astFactory.create(LT(1));
		match(KW_IS);
		returnAST = kwIS_AST;
	}
	
	public final void damllist(
		AST label
	) throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST damllist_AST = null;
		AST i_AST = null;
		AST n_AST = null;
		
		switch ( LA(1)) {
		case QNAME:
		case KW_THIS:
		case STRING:
		case LBRACK:
		case LCURLY:
		case LPAREN:
		case URIREF:
		case UVAR:
		{
			item();
			i_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				damllist_AST = (AST)currentAST.root;
				
					  	if ( label == null )
					          label = (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(ANON,genAnonId()))) ;
						damllist_AST = label ;
					
				currentAST.root = damllist_AST;
				currentAST.child = damllist_AST!=null &&damllist_AST.getFirstChild()!=null ?
					damllist_AST.getFirstChild() : damllist_AST;
				currentAST.advanceChildToEnd();
			}
			damllist(null);
			n_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				
					    emitQuad(label, (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(URIREF,damlFirst))), i_AST);
						emitQuad(label, (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(URIREF,damlRest))), n_AST) ;
					
			}
			damllist_AST = (AST)currentAST.root;
			break;
		}
		case RPAREN:
		{
			if ( inputState.guessing==0 ) {
				damllist_AST = (AST)currentAST.root;
				damllist_AST = (AST)astFactory.make( (new ASTArray(1)).add((AST)astFactory.create(URIREF,damlNil)));
				currentAST.root = damllist_AST;
				currentAST.child = damllist_AST!=null &&damllist_AST.getFirstChild()!=null ?
					damllist_AST.getFirstChild() : damllist_AST;
				currentAST.advanceChildToEnd();
			}
			damllist_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = damllist_AST;
	}
	
	public final void literalModifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST literalModifier_AST = null;
		
		literalModifier1();
		astFactory.addASTChild(currentAST, returnAST);
		literalModifier1();
		astFactory.addASTChild(currentAST, returnAST);
		literalModifier_AST = (AST)currentAST.root;
		returnAST = literalModifier_AST;
	}
	
	public final void literalModifier1() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST literalModifier1_AST = null;
		AST dt_AST = null;
		
		boolean synPredMatched37 = false;
		if (((LA(1)==AT_LANG))) {
			int _m37 = mark();
			synPredMatched37 = true;
			inputState.guessing++;
			try {
				{
				match(AT_LANG);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched37 = false;
			}
			rewind(_m37);
			inputState.guessing--;
		}
		if ( synPredMatched37 ) {
			AST tmp29_AST = null;
			tmp29_AST = (AST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp29_AST);
			match(AT_LANG);
			literalModifier1_AST = (AST)currentAST.root;
		}
		else {
			boolean synPredMatched39 = false;
			if (((LA(1)==DATATYPE))) {
				int _m39 = mark();
				synPredMatched39 = true;
				inputState.guessing++;
				try {
					{
					match(DATATYPE);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched39 = false;
				}
				rewind(_m39);
				inputState.guessing--;
			}
			if ( synPredMatched39 ) {
				AST tmp30_AST = null;
				tmp30_AST = (AST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp30_AST);
				match(DATATYPE);
				datatype();
				dt_AST = (AST)returnAST;
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					literalModifier1_AST = (AST)currentAST.root;
					literalModifier1_AST = (AST)astFactory.make( (new ASTArray(2)).add((AST)astFactory.create(tmp30_AST)).add(dt_AST)) ;
					currentAST.root = literalModifier1_AST;
					currentAST.child = literalModifier1_AST!=null &&literalModifier1_AST.getFirstChild()!=null ?
						literalModifier1_AST.getFirstChild() : literalModifier1_AST;
					currentAST.advanceChildToEnd();
				}
				literalModifier1_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_2.member(LA(1)))) {
				literalModifier1_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			returnAST = literalModifier1_AST;
		}
		
	public final void datatype() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST datatype_AST = null;
		
		node();
		astFactory.addASTChild(currentAST, returnAST);
		datatype_AST = (AST)currentAST.root;
		returnAST = datatype_AST;
	}
	
	public final void variableDT() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST variableDT_AST = null;
		Token  v = null;
		AST v_AST = null;
		AST dt_AST = null;
		
		v = LT(1);
		v_AST = (AST)astFactory.create(v);
		astFactory.addASTChild(currentAST, v_AST);
		match(UVAR);
		{
		switch ( LA(1)) {
		case DATATYPE:
		{
			AST tmp31_AST = null;
			tmp31_AST = (AST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp31_AST);
			match(DATATYPE);
			datatype();
			dt_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case EOF:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		if ( inputState.guessing==0 ) {
			variableDT_AST = (AST)currentAST.root;
			variableDT_AST = (AST)astFactory.make( (new ASTArray(2)).add((AST)astFactory.create(UVAR,v.getText())).add(dt_AST)) ;
			currentAST.root = variableDT_AST;
			currentAST.child = variableDT_AST!=null &&variableDT_AST.getFirstChild()!=null ?
				variableDT_AST.getFirstChild() : variableDT_AST;
			currentAST.advanceChildToEnd();
		}
		variableDT_AST = (AST)currentAST.root;
		returnAST = variableDT_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"ANON",
		"FORMULA",
		"QNAME",
		"KEYWORD",
		"NAME_OP",
		"KW_THIS",
		"KW_OF",
		"KW_HAS",
		"KW_A",
		"KW_IS",
		"AT_PREFIX",
		"AT_LANG",
		"STRING",
		"LITERAL",
		"SEP",
		"SEMI",
		"COMMA",
		"PATH",
		"RPATH",
		"EQUAL",
		"ARROW_R",
		"ARROW_L",
		"ARROW_P_L",
		"ARROW_P_R",
		"LBRACK",
		"RBRACK",
		"LCURLY",
		"RCURLY",
		"LPAREN",
		"RPAREN",
		"DATATYPE",
		"URIREF",
		"UVAR",
		"QNAME_OR_KEYWORD_OR_NAME_OP",
		"URI_OR_IMPLIES",
		"URICHAR",
		"AT_WORD",
		"AT",
		"NAME_IT",
		"QUESTION",
		"ARROW_MEANS",
		"COLON",
		"SL_COMMENT",
		"NL1",
		"NL2",
		"NL3",
		"NL",
		"WS",
		"ALPHA",
		"ALPHANUMERIC",
		"NON_ANC",
		"NSNAME",
		"LNAME",
		"STRING1",
		"STRING2",
		"QUOTE3S",
		"QUOTE3D",
		"ESCAPE",
		"ESC_CHAR"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 34359738368L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 137438805826L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	
	}
