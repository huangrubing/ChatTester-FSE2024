/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:48:49 GMT 2024
 */

package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Meta_ESTest extends Meta_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Meta meta0 = new Meta();
      meta0.setErrorType("QaA8CWd:gGDf&^hGxF");
      String string0 = meta0.getErrorType();
      assertEquals("QaA8CWd:gGDf&^hGxF", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Meta meta0 = new Meta();
      meta0.setErrorMessage("@Q-[d'EJX |r@hO0C$");
      String string0 = meta0.getErrorMessage();
      assertEquals("@Q-[d'EJX |r@hO0C$", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Meta meta0 = new Meta();
      meta0.setCode(332);
      int int0 = meta0.getCode();
      assertEquals(332, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Meta meta0 = new Meta();
      int int0 = meta0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Meta meta0 = new Meta();
      meta0.setErrorType("");
      String string0 = meta0.getErrorType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Meta meta0 = new Meta();
      meta0.setCode((-2928));
      int int0 = meta0.getCode();
      assertEquals((-2928), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Meta meta0 = new Meta();
      meta0.setErrorMessage("");
      String string0 = meta0.getErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Meta meta0 = new Meta();
      String string0 = meta0.toString();
      assertEquals("Meta [code=0, errorMessage=null, errorType=null]", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Meta meta0 = new Meta();
      String string0 = meta0.getErrorType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Meta meta0 = new Meta();
      String string0 = meta0.getErrorMessage();
      assertNull(string0);
  }
}