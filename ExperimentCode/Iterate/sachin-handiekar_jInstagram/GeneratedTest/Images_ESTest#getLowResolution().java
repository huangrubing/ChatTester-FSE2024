// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:42:55 GMT 2024
 */
package org.jinstagram.entity.common;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
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
    public void testGetLowResolution() {
        Images images = new Images();
        ImageData imageData = new ImageData();
        images.setLowResolution(imageData);

        ImageData retrievedImageData = images.getLowResolution();

        assertNotNull("Low resolution image data should not be null", retrievedImageData);
    }
}