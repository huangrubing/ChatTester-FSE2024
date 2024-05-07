// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/tags/TagInfoFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:14:28 GMT 2024
 */
package org.jinstagram.entity.tags;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.tags.TagInfoData;
import org.jinstagram.entity.tags.TagInfoFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TagInfoFeed_ESTest extends TagInfoFeed_ESTest_scaffolding {
@Test
public void testToString() {
    // Create test data
    Meta meta = new Meta();
    TagInfoData tagInfo = new TagInfoData();
    TagInfoFeed tagInfoFeed = new TagInfoFeed();
    tagInfoFeed.setMeta(meta);
    tagInfoFeed.setTagInfo(tagInfo);

    // Call the method under test
    String result = tagInfoFeed.toString();

    // Verify the result
    String expected = String.format("TagInfoFeed [meta=%s, tagInfo=%s]", meta, tagInfo);
    assertEquals(expected, result);
}
}