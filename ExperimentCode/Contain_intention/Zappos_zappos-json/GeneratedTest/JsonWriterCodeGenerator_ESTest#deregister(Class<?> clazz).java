// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/JsonWriterCodeGenerator_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:02:58 GMT 2024
 */
package com.zappos.json;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonBeanIntrospector;
import com.zappos.json.JsonWriterCodeGenerator;
import com.zappos.json.JsonWriterInvoker;
import com.zappos.json.ZapposJson;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonWriterCodeGenerator_ESTest extends JsonWriterCodeGenerator_ESTest_scaffolding {
    @Test
    public void testDeregister() {
        // Setup
        JsonWriterCodeGenerator jsonWriterCodeGenerator = new JsonWriterCodeGenerator(new ZapposJson(), new JsonBeanIntrospector());
        Class<?> testClass = String.class;
        jsonWriterCodeGenerator.registerWriter(testClass); // Register a writer for the test class

        // Verify that the writer is registered before deregistering
        assertNotNull(jsonWriterCodeGenerator.getWriter(testClass));

        // Call the method under test
        jsonWriterCodeGenerator.deregister(testClass);

        // Verify that the writer is deregistered after calling the method
        assertNull(jsonWriterCodeGenerator.getWriter(testClass));
    }
}