// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Meta_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:48:49 GMT 2024
 */
package org.jinstagram.entity.common;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Meta_ESTest extends Meta_ESTest_scaffolding {

@Test
public void testGetErrorType() {
    // Create an instance of Meta
    Meta meta = new Meta();

    // Set the error type
    String errorType = "Runtime Error";
    meta.setErrorType(errorType);

    // Get the error type using the focal method
    String result = meta.getErrorType();

    // Assert that the returned error type matches the set error type
    assertEquals(errorType, result);
}

@Test
public void testToString() {
    // Create a Meta object with test values
    Meta meta = new Meta();
    meta.setCode(200);
    meta.setErrorType("Error");
    meta.setErrorMessage("An error occurred");

    // Call the toString() method
    String result = meta.toString();

    // Verify the expected output
    String expected = "Meta [code=200, errorMessage=An error occurred, errorType=Error]";
    assertEquals(expected, result);
}

@Test
public void testGetErrorMessage() {
    // Create an instance of Meta
    Meta meta = new Meta();

    // Set the error message
    String errorMessage = "Test Error Message";
    meta.setErrorMessage(errorMessage);

    // Call the getErrorMessage() method
    String result = meta.getErrorMessage();

    // Assert that the returned value is equal to the set error message
    assertEquals(errorMessage, result);
}

    @Test
    public void testSetErrorType() {
        Meta meta = new Meta();
        String errorType = "Runtime Error";
        
        meta.setErrorType(errorType);
        
        assertEquals(errorType, meta.getErrorType());
    }

    @Test
    public void testSetCode() {
        // Create an instance of Meta
        Meta meta = new Meta();

        // Set the code using the setCode method
        int code = 123;
        meta.setCode(code);

        // Verify that the code has been set correctly
        assertEquals(code, meta.getCode());
    }

@Test
public void testGetCode() {
    // Create an instance of Meta
    Meta meta = new Meta();

    // Set the code using the setter method
    meta.setCode(123);

    // Get the code using the getter method
    int code = meta.getCode();

    // Assert that the returned code matches the expected value
    assertEquals(123, code);
}

}