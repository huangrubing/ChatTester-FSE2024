// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/URLUtils_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:48:19 GMT 2024
 */
package org.jinstagram.http;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.http.URLUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class URLUtils_ESTest extends URLUtils_ESTest_scaffolding {
    @Test
    public void testAppendParametersToQueryString() {
        // Test case 1: url is null
        Map<String, String> params1 = new HashMap<>();
        params1.put("param1", "value1");
        String result1 = URLUtils.appendParametersToQueryString(null, params1);
        assertNull(result1);

        // Test case 2: params is null
        String url2 = "https://example.com";
        String result2 = URLUtils.appendParametersToQueryString(url2, null);
        assertEquals(url2, result2);

        // Test case 3: url and params are valid
        String url3 = "https://example.com";
        Map<String, String> params3 = new HashMap<>();
        params3.put("param1", "value1");
        params3.put("param2", "value2");
        String result3 = URLUtils.appendParametersToQueryString(url3, params3);
        String expected3 = "https://example.com?param1=value1&param2=value2";
        assertEquals(expected3, result3);
    }
}