// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/relationships/RelationshipFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:10:49 GMT 2024
 */
package org.jinstagram.entity.relationships;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.relationships.RelationshipData;
import org.jinstagram.entity.relationships.RelationshipFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RelationshipFeed_ESTest extends RelationshipFeed_ESTest_scaffolding {
@Test
public void testSetMeta() {
    // Create a new instance of the class
    RelationshipFeed relationshipFeed = new RelationshipFeed();

    // Create a new instance of the Meta class
    Meta meta = new Meta();

    // Set the meta object using the setMeta method
    relationshipFeed.setMeta(meta);

    // Get the meta object using the getMeta method
    Meta actualMeta = relationshipFeed.getMeta();

    // Assert that the actual meta object is equal to the expected meta object
    assertEquals(meta, actualMeta);
}
}