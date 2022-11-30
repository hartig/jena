package org.apache.jena.sparql.function.library.collection;

import org.apache.jena.sparql.ARQConstants;
import org.apache.jena.sparql.function.FunctionRegistry;

public class CollectionLiteralFunctions {
	public static void register( final FunctionRegistry functionRegistry ) {
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "concat",  ConcatFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "contains",  ContainsFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "containsTerm",  ContainsTermFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "get",     GetFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "head",    HeadFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "List",    ListFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "reverse", ReverseFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "size",    SizeFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "subseq",  SubSeqFct.class );
		functionRegistry.put( ARQConstants.CDTFunctionLibraryURI + "tail",    TailFct.class );
	}
}
