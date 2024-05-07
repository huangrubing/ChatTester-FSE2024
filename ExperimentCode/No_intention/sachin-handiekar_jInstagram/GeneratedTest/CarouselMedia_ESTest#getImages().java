// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/CarouselMedia_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:26:18 GMT 2024
 */
package org.jinstagram.entity.users.feed;
import org.jinstagram.entity.common.Images;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CarouselMedia_ESTest extends CarouselMedia_ESTest_scaffolding {
    @Test
    public void testGetImages() {
        // Create a CarouselMedia object
        CarouselMedia carouselMedia = new CarouselMedia();

        // Create an Images object
        Images images = new Images();
        // Set the properties of the Images object
        // 

        // Set the Images object in the CarouselMedia object
        carouselMedia.setImages(images);

        // Call the getImages() method
        Images result = carouselMedia.getImages();

        // Assert that the returned Images object is not null
        assertNotNull(result);

        // Assert that the returned Images object is the same as the one set
        assertSame(images, result);
    }
}