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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class RectangularTextContainer_ESTest extends RectangularTextContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer0 = new RectangularTextContainer<RectangularTextContainer<TextElement>>(1.0F, 0.0F, 0.0F, 1.0F);
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer1 = new RectangularTextContainer<RectangularTextContainer<TextElement>>((-198.57213F), 1.0F, (-1133.79F), 0.0F);
      rectangularTextContainer0.merge(rectangularTextContainer1);
      assertEquals((-198.57213F), rectangularTextContainer0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer0 = new RectangularTextContainer<RectangularTextContainer<TextElement>>(3718.457F, 3718.457F, (-1177.0F), 0.0F);
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer1 = rectangularTextContainer0.merge(rectangularTextContainer0);
      assertEquals(1177.0F, rectangularTextContainer1.width, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer0 = new RectangularTextContainer<RectangularTextContainer<TextElement>>((-1.0F), (-1.0F), (-1.0F), (-1.0F));
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer1 = rectangularTextContainer0.merge(rectangularTextContainer0);
      assertEquals(1.0F, rectangularTextContainer1.width, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      textChunk0.setTextElements((List<TextElement>) null);
      List<TextElement> list0 = textChunk0.getTextElements();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextChunk textChunk0 = new TextChunk(0.0F, 1.0F, 0.0F, 0.0F);
      List<TextElement> list0 = textChunk0.getTextElements();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextChunk textChunk0 = new TextChunk((-2372.5F), (-2372.5F), 0.0F, 0.0F);
      String string0 = textChunk0.getText(false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextChunk textChunk0 = new TextChunk(0.0F, 0.0F, 0.0F, 0.0F);
      String string0 = textChunk0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      // Undeclared exception!
      try { 
        textChunk0.merge((RectangularTextContainer<TextElement>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.Rectangle", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      textChunk0.setTextElements((List<TextElement>) null);
      // Undeclared exception!
      try { 
        textChunk0.getText(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.TextChunk", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      textChunk0.setTextElements((List<TextElement>) null);
      // Undeclared exception!
      try { 
        textChunk0.getText();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.TextChunk", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer0 = new RectangularTextContainer<RectangularTextContainer<TextElement>>(1.0F, 0.0F, 0.0F, 1.0F);
      // Undeclared exception!
      try { 
        rectangularTextContainer0.getText();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.RectangularTextContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      String string0 = textChunk0.toString();
      assertEquals("technology.tabula.TextChunk[x=0.0,y=0.0,w=0.0,h=0.0,bottom=0.000000,right=0.000000,text=\"\"]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      RectangularTextContainer<TextElement> rectangularTextContainer0 = new RectangularTextContainer<TextElement>(0.0F, 0.0F, 0.0F, 734.0F);
      textChunk0.merge(rectangularTextContainer0);
      assertEquals(734.0F, textChunk0.height, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      RectangularTextContainer<TextElement> rectangularTextContainer0 = textChunk0.merge((RectangularTextContainer<TextElement>) textChunk0);
      assertSame(textChunk0, rectangularTextContainer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextChunk textChunk0 = TextChunk.EMPTY;
      Point2D.Float point2D_Float0 = new Point2D.Float(0.0F, 2.0F);
      Cell cell0 = new Cell(point2D_Float0, point2D_Float0);
      Character character0 = new Character('K');
      List<TextChunk> list0 = textChunk0.squeeze(character0, (-1844));
      cell0.setTextElements(list0);
      List<TextChunk> list1 = cell0.getTextElements();
      assertTrue(list1.contains(textChunk0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RectangularTextContainer<RectangularTextContainer<TextElement>> rectangularTextContainer0 = new RectangularTextContainer<RectangularTextContainer<TextElement>>(0.0F, 0.0F, 0.0F, 0.0F);
      // Undeclared exception!
      try { 
        rectangularTextContainer0.toString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.RectangularTextContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangularTextContainer<TextChunk> rectangularTextContainer0 = new RectangularTextContainer<TextChunk>(0.0F, 0.0F, 0.0F, 0.0F);
      // Undeclared exception!
      try { 
        rectangularTextContainer0.getText(false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.RectangularTextContainer", e);
      }
  }
}