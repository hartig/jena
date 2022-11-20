package org.apache.jena.sparql.function.library.collection;

import java.util.List;

import org.apache.jena.cdt.CDTValue;
import org.apache.jena.cdt.CompositeDatatypeList;
import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.ExprEvalException;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase2;

public class ContainsFct extends FunctionBase2
{
	@Override
	public NodeValue exec( final NodeValue nv1, final NodeValue nv2 ) {
		final Node n1 = nv1.asNode();

		if ( ! CompositeDatatypeList.isListLiteral(n1) )
			throw new ExprEvalException("Not a list literal: " + nv1);

		final List<CDTValue> list = CompositeDatatypeList.getValue( n1.getLiteral() );
		final boolean result = containsNode( list, nv2 );
		return NodeValue.booleanReturn(result);
	}

	/**
	 * Returns true if the given list contains the given RDF term.
	 */
	protected boolean containsNode( final List<CDTValue> list, final NodeValue nv ) {
		for ( final CDTValue v : list ) {
			if ( v.isNode() ) {
				final NodeValue vv = NodeValue.makeNode( v.asNode() );
				if ( NodeValue.sameAs(vv, nv) ) {
					return true;
				}
			}
		}

		return false;
	}

}
