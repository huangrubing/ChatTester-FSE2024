// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:42:55 GMT 2024
 */
package org.jinstagram.entity.common;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.ImageData;
import org.jinstagram.entity.common.Images;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Images_ESTest extends Images_ESTest_scaffolding {
    @Test
    public void testGetThumbnail() {
        // Create an instance of Images
        Images images = new Images();

        // Create an instance of ImageData for thumbnail
        ImageData thumbnail = new ImageData();

        // Set the thumbnail in Images
        images.setThumbnail(thumbnail);

        // Call the getThumbnail() method
        ImageData result = images.getThumbnail();

        // Assert that the returned thumbnail is the same as the one set
        assertEquals(thumbnail, result);
    }
}