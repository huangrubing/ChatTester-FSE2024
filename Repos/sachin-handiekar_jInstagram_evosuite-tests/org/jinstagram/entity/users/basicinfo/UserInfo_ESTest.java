/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:22:05 GMT 2024
 */

package org.jinstagram.entity.users.basicinfo;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserInfo_ESTest extends UserInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      Meta meta0 = new Meta();
      meta0.setCode(663);
      userInfo0.setMeta(meta0);
      Meta meta1 = userInfo0.getMeta();
      assertNull(meta1.getErrorMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      Meta meta0 = new Meta();
      meta0.setCode((-1));
      userInfo0.setMeta(meta0);
      Meta meta1 = userInfo0.getMeta();
      assertEquals((-1), meta1.getCode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      UserInfoData userInfoData0 = new UserInfoData();
      userInfoData0.setBusiness(true);
      userInfo0.setData(userInfoData0);
      UserInfoData userInfoData1 = userInfo0.getData();
      assertNull(userInfoData1.getFullName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      Meta meta0 = new Meta();
      userInfo0.setMeta(meta0);
      Meta meta1 = userInfo0.getMeta();
      assertNull(meta1.getErrorMessage());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      Meta meta0 = userInfo0.getMeta();
      assertNull(meta0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      UserInfoData userInfoData0 = new UserInfoData();
      userInfo0.setData(userInfoData0);
      UserInfoData userInfoData1 = userInfo0.getData();
      assertNull(userInfoData1.getFirstName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      String string0 = userInfo0.toString();
      assertEquals("UserInfo [data=null]", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UserInfo userInfo0 = new UserInfo();
      UserInfoData userInfoData0 = userInfo0.getData();
      assertNull(userInfoData0);
  }
}