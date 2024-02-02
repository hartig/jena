package org.apache.jena.cdt;

import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.graph.impl.LiteralLabel;
import org.apache.jena.riot.lang.extra.LangParserBase;

public class CDTLiteralParserBase extends LangParserBase
{
	@Override
	protected Node createBNode(String label, int line, int column) {
		final Node b = super.createBNode(label, line, column);
System.out.println("createBNode(" + label + ") " + b.toString() + "  -- profile type: " + profile.getClass().getName() );
//TODO: first step, the parser profile used for the parsing of the TTL file is still not the CDT-aware one :-(
//		second step, think whether the profile used here should not be the CDT-aware one but just the standard one
//		...or perhaps not? think about recursive parsing of CDT literals -- the question is about bnode identifiers
//		inside a CDT literal that is inside another CDT literal
		return b;
	}
	@Override
	protected Node createLiteral( final String lex, final String langTag, final String datatypeURI, final int line, final int column ) {
		if ( CompositeDatatypeList.uri.equals(datatypeURI) ) {
			final LiteralLabel lit = new LiteralLabelForList(lex);
			return NodeFactory.createLiteral(lit);
		}

		if ( CompositeDatatypeMap.uri.equals(datatypeURI) ) {
			final LiteralLabel lit = new LiteralLabelForMap(lex);
			return NodeFactory.createLiteral(lit);
		}

		return super.createLiteral(lex, langTag, datatypeURI, line, column);
	}

}
