/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:19:12 GMT 2024
 */
package com.zappos.json;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class ZapposJson_ESTest extends ZapposJson_ESTest_scaffolding {
    @Test 
    public void testGetField() throws Exception { 
    JsonBeanAttribute jsonBeanAttribute = new JsonBeanAttribute();
    Field field = jsonBeanAttribute.getField();
    assertEquals(field, jsonBeanAttribute.getField());
    }
    
}