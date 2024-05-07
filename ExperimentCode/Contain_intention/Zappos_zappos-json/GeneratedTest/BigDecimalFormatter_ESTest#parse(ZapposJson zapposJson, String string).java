// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/format/BigDecimalFormatter_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:31:38 GMT 2024
 */
package com.zappos.json.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.BigDecimalFormatter;
import com.zappos.json.format.ValueFormatter;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BigDecimalFormatter_ESTest extends BigDecimalFormatter_ESTest_scaffolding {
    @Test
    public void testParse_withPattern() {
        BigDecimalFormatter formatter = new BigDecimalFormatter();
        ZapposJson zapposJson = new ZapposJson();
        String numberString = "123.45";
        String pattern = "#,##0.00";

        try {
            BigDecimal result = formatter.parse(zapposJson, numberString, pattern);
            assertNotNull(result);
            assertEquals(new BigDecimal("123.45"), result);
        } catch (Exception e) {
            fail("Exception thrown when parsing with pattern: " + e.getMessage());
        }
    }
}