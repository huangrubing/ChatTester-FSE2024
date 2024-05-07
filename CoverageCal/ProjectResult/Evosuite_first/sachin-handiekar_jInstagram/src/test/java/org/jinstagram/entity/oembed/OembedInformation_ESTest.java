/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:07:06 GMT 2024
 */
package org.jinstagram.entity.oembed;


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.oembed.OembedInformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class OembedInformation_ESTest extends OembedInformation_ESTest_scaffolding {


@Test(timeout = 4000)
public void test01() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setWidth("");
    String string0 = oembedInformation0.getWidth();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test11() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setThumbnailWidth((-1));
    int int0 = oembedInformation0.getThumbnailWidth();
    assertEquals((-1), int0);
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setUrl("");
    String string0 = oembedInformation0.getUrl();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test22() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setHtml("");
    String string0 = oembedInformation0.getHtml();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test07() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setType("");
    String string0 = oembedInformation0.getType();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test44() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setAuthorUrl("");
    String string0 = oembedInformation0.getAuthorUrl();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test14() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setThumbnailHeight((-1));
    int int0 = oembedInformation0.getThumbnailHeight();
    assertEquals((-1), int0);
}


@Test(timeout = 4000)
public void test18() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setProviderName("");
    String string0 = oembedInformation0.getProviderName();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test09() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setTitle("");
    String string0 = oembedInformation0.getTitle();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test24() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setHeight("");
    String string0 = oembedInformation0.getHeight();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test03() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setVersion("");
    String string0 = oembedInformation0.getVersion();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test16() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setProviderUrl("");
    String string0 = oembedInformation0.getProviderUrl();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test12() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setThumbnailUrl("");
    String string0 = oembedInformation0.getThumbnailUrl();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test19() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setMediaId("type=");
    String string0 = oembedInformation0.getMediaId();
    assertEquals("type=", string0);
}


@Test(timeout = 4000)
public void test47() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setAuthorName("");
    String string0 = oembedInformation0.getAuthorName();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test53() throws Throwable {
    OembedInformation oembedInformation0 = new OembedInformation();
    oembedInformation0.setMediaId("");
    String string0 = oembedInformation0.toString();
    assertEquals("OembedInformation [mediaId=]", string0);
}

}