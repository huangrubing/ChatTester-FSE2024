/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:53:01 GMT 2024
 */

package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.User;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      User user0 = new User();
      user0.setWebsiteUrl("User [bio=%s, fullName=%s, id=%s, profilePictureUrl=%s, userName=%s, websiteUrl=%s]");
      String string0 = user0.getWebsiteUrl();
      assertEquals("User [bio=%s, fullName=%s, id=%s, profilePictureUrl=%s, userName=%s, websiteUrl=%s]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      User user0 = new User();
      user0.setUserName("[b)]+!S=UKo4*knCt)a");
      String string0 = user0.getUserName();
      assertEquals("[b)]+!S=UKo4*knCt)a", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      User user0 = new User();
      user0.setProfilePictureUrl("User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null]");
      String string0 = user0.getProfilePictureUrl();
      assertEquals("User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      User user0 = new User();
      user0.setProfilePictureUrl("");
      String string0 = user0.getProfilePictureUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      User user0 = new User();
      user0.setId("\"m*Dx6<&");
      String string0 = user0.getId();
      assertEquals("\"m*Dx6<&", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      User user0 = new User();
      user0.setFullName("ei\";]aXi");
      String string0 = user0.getFullName();
      assertEquals("ei\";]aXi", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      User user0 = new User();
      user0.setBio("\r={bHvZkX'.Qun4R=_");
      String string0 = user0.getBio();
      assertEquals("\r={bHvZkX'.Qun4R=_", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getProfilePictureUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      User user0 = new User();
      user0.setUserName("");
      String string0 = user0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getWebsiteUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.toString();
      assertEquals("User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      User user0 = new User();
      user0.setId("");
      String string0 = user0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getUserName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      User user0 = new User();
      user0.setBio("");
      String string0 = user0.getBio();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      User user0 = new User();
      user0.setFullName("");
      String string0 = user0.getFullName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getBio();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      User user0 = new User();
      user0.setWebsiteUrl("");
      String string0 = user0.getWebsiteUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getFullName();
      assertNull(string0);
  }
}