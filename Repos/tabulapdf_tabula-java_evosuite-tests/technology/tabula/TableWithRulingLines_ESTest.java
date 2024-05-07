/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:13:13 GMT 2024
 */

package technology.tabula;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.Rectangle;
import technology.tabula.Ruling;
import technology.tabula.TableWithRulingLines;
import technology.tabula.extractors.BasicExtractionAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TableWithRulingLines_ESTest extends TableWithRulingLines_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicExtractionAlgorithm basicExtractionAlgorithm0 = new BasicExtractionAlgorithm((List<Ruling>) null);
      TableWithRulingLines tableWithRulingLines0 = null;
      try {
        tableWithRulingLines0 = new TableWithRulingLines((Rectangle) null, (List<Cell>) null, (List<Ruling>) null, (List<Ruling>) null, basicExtractionAlgorithm0, 1886);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/locationtech/jts/index/strtree/STRtree
         //
         verifyException("technology.tabula.RectangleSpatialIndex", e);
      }
  }
}