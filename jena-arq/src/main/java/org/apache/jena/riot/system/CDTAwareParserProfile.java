package org.apache.jena.riot.system;

import java.util.List;

import org.apache.jena.cdt.CDTValue;
import org.apache.jena.cdt.CompositeDatatypeList;
import org.apache.jena.cdt.LiteralLabelForList;
import org.apache.jena.cdt.ParserForCDTLiterals;
import org.apache.jena.datatypes.DatatypeFormatException;
import org.apache.jena.datatypes.RDFDatatype;
import org.apache.jena.graph.Node;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.graph.impl.LiteralLabel;
import org.apache.jena.irix.IRIxResolver;
import org.apache.jena.sparql.util.Context;

public class CDTAwareParserProfile extends ParserProfileStd
{
	public CDTAwareParserProfile( final FactoryRDF factory,
	                              final ErrorHandler errorHandler,
	                              final IRIxResolver resolver,
	                              final PrefixMap prefixMap,
	                              final Context context,
	                              final boolean checking,
	                              final boolean strictMode ) {
		super(factory, errorHandler, resolver, prefixMap, context, checking, strictMode);
	}

	@Override
	public Node createTypedLiteral( final String lexical, final RDFDatatype datatype, final long line, final long col ) {
System.out.println("createTypedLiteral(" + lexical + ")   -- datatype type: " + datatype.getClass().getName() );
		if ( datatype.equals(CompositeDatatypeList.type) ) {
			// Attention: In contrast to the overridden function in the superclass,
			// for literals of the CDT datatypes we do not perform a checkLiteral
			// check because that would parse the lexical form of the literal
			// already once before doing the other parse to obtain the value.

			final boolean recursive = false;
			final List<CDTValue> value;
			try {
				value = ParserForCDTLiterals.parseListLiteral(getFactorRDF(), lexical, recursive);
			}
			catch ( final Exception ex ) {
				throw new DatatypeFormatException(lexical, datatype, ex);
			}
			final LiteralLabel lit = new LiteralLabelForList(lexical, value);
			return NodeFactory.createLiteral(lit);
		}

		return super.createTypedLiteral(lexical, datatype, line, col);
	}

}
