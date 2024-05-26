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

package org.apache.jena.ontapi.common;

import org.apache.jena.ontapi.OntModelControls;

/**
 * Collection of ontology configurations.
 */
public class OntConfigs {

    public static final OntConfig OWL2_CONFIG = OntConfig.DEFAULT
            .setTrue(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setTrue(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setFalse(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setTrue(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setFalse(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setFalse(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setTrue(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);

    public static final OntConfig OWL2_EL_CONFIG = OntConfig.DEFAULT
            .setTrue(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setTrue(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setFalse(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setFalse(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setFalse(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setFalse(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setTrue(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);

    public static final OntConfig OWL2_QL_CONFIG = OntConfig.DEFAULT
            .setTrue(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setTrue(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setFalse(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setFalse(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setFalse(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setFalse(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setTrue(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);

    public static final OntConfig OWL2_RL_CONFIG = OntConfig.DEFAULT
            .setTrue(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setTrue(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setFalse(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setTrue(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setFalse(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setFalse(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setTrue(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);

    public static final OntConfig OWL1_CONFIG = OntConfig.DEFAULT
            .setTrue(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setTrue(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setTrue(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setTrue(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setTrue(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setTrue(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setTrue(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setTrue(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setFalse(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);

    public static final OntConfig OWL1_LITE_CONFIG = OntConfig.DEFAULT
            .setTrue(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setTrue(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setTrue(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setTrue(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setTrue(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setTrue(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setTrue(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setTrue(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setTrue(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setTrue(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setFalse(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setFalse(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setTrue(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setTrue(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);

    public static final OntConfig RDFS_CONFIG = OntConfig.DEFAULT
            .setFalse(OntModelControls.USE_GENERATE_ONTOLOGY_HEADER_IF_ABSENT_STRATEGY)
            .setFalse(OntModelControls.USE_CHOOSE_MOST_SUITABLE_ONTOLOGY_HEADER_STRATEGY)
            .setFalse(OntModelControls.USE_BUILTIN_HIERARCHY_SUPPORT)
            .setTrue(OntModelControls.USE_SIMPLIFIED_TYPE_CHECKING_WHILE_LIST_INDIVIDUALS)
            .setFalse(OntModelControls.USE_OWL2_DEPRECATED_VOCABULARY_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DATARANGE_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL1_DISTINCT_MEMBERS_PREDICATE_FEATURE)
            .setFalse(OntModelControls.ALLOW_NAMED_CLASS_EXPRESSIONS)
            .setFalse(OntModelControls.ALLOW_GENERIC_CLASS_EXPRESSIONS)
            .setTrue(OntModelControls.ALLOW_ANONYMOUS_INDIVIDUALS)
            .setTrue(OntModelControls.USE_LEGACY_COMPATIBLE_NAMED_CLASS_FACTORY)
            .setFalse(OntModelControls.USE_OWL2_NAMED_INDIVIDUAL_DECLARATION_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_CLASS_HAS_KEY_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_NAMED_CLASS_DISJOINT_UNION_FEATURE)
            .setFalse(OntModelControls.USE_OWL_CLASS_DISJOINT_WITH_FEATURE)
            .setFalse(OntModelControls.USE_OWL_CLASS_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_PROPERTY_DISJOINT_WITH_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_EQUIVALENT_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_INVERSE_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_DATA_PROPERTY_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_OBJECT_PROPERTY_FUNCTIONAL_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_SYMMETRIC_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_ASYMMETRIC_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_TRANSITIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_REFLEXIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_IRREFLEXIVE_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_INVERSE_OF_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INVERSE_OBJECT_PROPERTY_FEATURE)
            .setFalse(OntModelControls.USE_OWL_PROPERTY_CHAIN_AXIOM_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INDIVIDUAL_SAME_AS_FEATURE)
            .setFalse(OntModelControls.USE_OWL_INDIVIDUAL_DIFFERENT_FROM_FEATURE)
            .setFalse(OntModelControls.USE_OWL2_QUALIFIED_CARDINALITY_RESTRICTION_FEATURE);
}
