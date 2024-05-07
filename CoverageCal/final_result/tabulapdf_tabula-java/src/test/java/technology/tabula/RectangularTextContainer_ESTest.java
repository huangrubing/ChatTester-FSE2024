/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:07:21 GMT 2024
 */
package technology.tabula;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.RectangularTextContainer;
import technology.tabula.TextChunk;
import technology.tabula.TextElement;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class RectangularTextContainer_ESTest extends RectangularTextContainer_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        TextChunk textChunk0 = TextChunk.EMPTY;
        RectangularTextContainer<TextElement> rectangularTextContainer0 = new RectangularTextContainer<TextElement>(0.0F, 0.0F, 0.0F, 734.0F);
        textChunk0.merge(rectangularTextContainer0);
        assertEquals(734.0F, textChunk0.height, 0.01F);
    }
}