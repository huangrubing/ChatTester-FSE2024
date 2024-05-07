// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/oembed/OembedInformation_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:07:06 GMT 2024
 */
package org.jinstagram.entity.oembed;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.oembed.OembedInformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class OembedInformation_ESTest extends OembedInformation_ESTest_scaffolding {

    @Test
    public void testSetWidth() {
        // Given
        OembedInformation oembedInformation = new OembedInformation();
        String expectedWidth = "100";

        // When
        oembedInformation.setWidth(expectedWidth);

        // Then
        assertEquals(expectedWidth, oembedInformation.getWidth());
    }

    @Test
    public void testGetType() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setType("video");

        assertEquals("video", oembedInformation.getType());
    }

    @Test
    public void testGetHtml() {
        // Given
        OembedInformation oembedInformation = new OembedInformation();
        String expectedHtml = "<div>Sample HTML content</div>";
        oembedInformation.setHtml(expectedHtml);

        // When
        String actualHtml = oembedInformation.getHtml();

        // Then
        assertEquals(expectedHtml, actualHtml);
    }

    @Test
    public void testSetThumbnailWidth() {
        OembedInformation oembedInformation = new OembedInformation();
        int expectedThumbnailWidth = 100;

        oembedInformation.setThumbnailWidth(expectedThumbnailWidth);

        assertEquals(expectedThumbnailWidth, oembedInformation.getThumbnailWidth());
    }

    @Test
    public void testGetUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String expectedUrl = "https://example.com";
        oembedInformation.setUrl(expectedUrl);

        String actualUrl = oembedInformation.getUrl();

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testGetHeight() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setHeight("100");

        assertEquals("100", oembedInformation.getHeight());
    }

    @Test
    public void testSetAuthorUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String authorUrl = "https://www.example.com/author";
        
        oembedInformation.setAuthorUrl(authorUrl);
        
        assertEquals(authorUrl, oembedInformation.getAuthorUrl());
    }

    @Test
    public void testSetType() {
        // Given
        OembedInformation oembedInformation = new OembedInformation();
        String expectedType = "video";

        // When
        oembedInformation.setType(expectedType);

        // Then
        assertEquals(expectedType, oembedInformation.getType());
    }

    @Test
    public void testSetTitle() {
        OembedInformation oembedInformation = new OembedInformation();
        String title = "Test Title";
        oembedInformation.setTitle(title);
        
        assertEquals(title, oembedInformation.getTitle());
    }

    @Test
    public void testSetHtml() {
        OembedInformation oembedInformation = new OembedInformation();
        String htmlContent = "<div>This is a test HTML content</div>";
        
        oembedInformation.setHtml(htmlContent);
        
        assertEquals(htmlContent, oembedInformation.getHtml());
    }

    @Test
    public void testSetProviderName() {
        OembedInformation oembedInformation = new OembedInformation();
        String providerName = "Test Provider";
        
        oembedInformation.setProviderName(providerName);
        
        assertEquals(providerName, oembedInformation.getProviderName());
    }

    @Test
    public void testGetProviderName() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setProviderName("Test Provider");

        String expectedProviderName = "Test Provider";
        String actualProviderName = oembedInformation.getProviderName();

        assertEquals(expectedProviderName, actualProviderName);
    }

    @Test
    public void testGetThumbnailHeight() {
        OembedInformation oembedInformation = new OembedInformation();
        int expectedThumbnailHeight = 100;
        oembedInformation.setThumbnailHeight(expectedThumbnailHeight);

        int actualThumbnailHeight = oembedInformation.getThumbnailHeight();

        assertEquals(expectedThumbnailHeight, actualThumbnailHeight);
    }

    @Test
    public void testGetProviderUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setProviderUrl("https://example.com/provider");

        String expectedProviderUrl = "https://example.com/provider";
        String actualProviderUrl = oembedInformation.getProviderUrl();

        assertEquals(expectedProviderUrl, actualProviderUrl);
    }

    @Test
    public void testGetMediaId() {
        OembedInformation oembedInformation = new OembedInformation();
        String expectedMediaId = "testMediaId";
        oembedInformation.setMediaId(expectedMediaId);

        String actualMediaId = oembedInformation.getMediaId();

        assertEquals(expectedMediaId, actualMediaId);
    }

    @Test
    public void testGetThumbnailUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String expectedThumbnailUrl = "https://example.com/thumbnail.jpg";
        oembedInformation.setThumbnailUrl(expectedThumbnailUrl);

        String actualThumbnailUrl = oembedInformation.getThumbnailUrl();

        assertEquals(expectedThumbnailUrl, actualThumbnailUrl);
    }

    @Test
    public void testGetVersion() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setVersion("1.0");
        
        String expectedVersion = "1.0";
        String actualVersion = oembedInformation.getVersion();
        
        assertEquals(expectedVersion, actualVersion);
    }

    @Test
    public void testSetProviderUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String providerUrl = "https://example.com/provider";

        oembedInformation.setProviderUrl(providerUrl);

        assertEquals(providerUrl, oembedInformation.getProviderUrl());
    }

    @Test
    public void testGetTitle() {
        // Given
        OembedInformation oembedInformation = new OembedInformation();
        String expectedTitle = "Sample Title";
        oembedInformation.setTitle(expectedTitle);

        // When
        String actualTitle = oembedInformation.getTitle();

        // Then
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testGetThumbnailWidth() {
        OembedInformation oembedInformation = new OembedInformation();
        int expectedThumbnailWidth = 100; // Set the expected value here

        // Set the thumbnailWidth using a public setter method
        oembedInformation.setThumbnailWidth(expectedThumbnailWidth);

        // Call the method to be tested
        int actualThumbnailWidth = oembedInformation.getThumbnailWidth();

        // Assert that the returned value matches the expected value
        assertEquals(expectedThumbnailWidth, actualThumbnailWidth);
    }

    @Test
    public void testSetHeight() {
        OembedInformation oembedInformation = new OembedInformation();
        String expectedHeight = "100"; // Define the expected height value

        oembedInformation.setHeight(expectedHeight);

        assertEquals(expectedHeight, oembedInformation.getHeight());
    }

    @Test
    public void testSetThumbnailUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String thumbnailUrl = "https://example.com/image.jpg";
        
        oembedInformation.setThumbnailUrl(thumbnailUrl);
        
        assertEquals(thumbnailUrl, oembedInformation.getThumbnailUrl());
    }

    @Test
    public void testSetUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String url = "https://www.example.com";
        
        oembedInformation.setUrl(url);
        
        assertEquals(url, oembedInformation.getUrl());
    }

    @Test
    public void testSetAuthorName() {
        OembedInformation oembedInformation = new OembedInformation();
        String authorName = "John Doe";
        oembedInformation.setAuthorName(authorName);
        
        assertEquals(authorName, oembedInformation.getAuthorName());
    }

    @Test
    public void testSetVersion() {
        // Given
        OembedInformation oembedInformation = new OembedInformation();
        String version = "1.0";

        // When
        oembedInformation.setVersion(version);

        // Then
        assertEquals(version, oembedInformation.getVersion());
    }

    @Test
    public void testGetAuthorUrl() {
        OembedInformation oembedInformation = new OembedInformation();
        String expectedAuthorUrl = "https://example.com/author";
        oembedInformation.setAuthorUrl(expectedAuthorUrl);

        String actualAuthorUrl = oembedInformation.getAuthorUrl();

        assertEquals(expectedAuthorUrl, actualAuthorUrl);
    }

    @Test
    public void testToString() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setProviderUrl("https://example.com");
        oembedInformation.setTitle("Sample Title");
        oembedInformation.setUrl("https://example.com/sample");
        oembedInformation.setAuthorName("John Doe");
        oembedInformation.setHeight("200");
        oembedInformation.setWidth("300");
        oembedInformation.setVersion("1.0");
        oembedInformation.setAuthorUrl("https://example.com/author");
        oembedInformation.setProviderName("Sample Provider");
        oembedInformation.setType("video");
        oembedInformation.setMediaId("12345");

        String expected = "OembedInformation [provider_url=https://example.com, title=Sample Title, url=https://example.com/sample, author_name=John Doe, height=200, width=300, version=1.0, author_url=https://example.com/author, provider_name=Sample Provider, type=video, mediaId=12345]";
        String actual = oembedInformation.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetAuthorName() {
        OembedInformation oembedInformation = new OembedInformation();
        String expectedAuthorName = "John Doe";
        oembedInformation.setAuthorName(expectedAuthorName);

        String actualAuthorName = oembedInformation.getAuthorName();

        assertEquals(expectedAuthorName, actualAuthorName);
    }

    @Test
    public void testSetThumbnailHeight() {
        OembedInformation oembedInformation = new OembedInformation();
        int expectedThumbnailHeight = 100;

        oembedInformation.setThumbnailHeight(expectedThumbnailHeight);

        assertEquals(expectedThumbnailHeight, oembedInformation.getThumbnailHeight());
    }

    @Test
    public void testGetWidth() {
        OembedInformation oembedInformation = new OembedInformation();
        oembedInformation.setWidth("100");

        String width = oembedInformation.getWidth();

        assertEquals("100", width);
    }

    @Test
    public void testSetMediaId() {
        OembedInformation oembedInformation = new OembedInformation();
        String mediaId = "12345";
        oembedInformation.setMediaId(mediaId);
        
        assertEquals(mediaId, oembedInformation.getMediaId());
    }

}