/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 11:32:52 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.WRAP;

public class WRAP_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WRAP wRAP0 = new WRAP();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[2];
      WRAP.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap("X6:KI4", (-4026));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<String> arrayList0 = WRAP.wrap("JS;}XSD#", 1);
      assertEquals(8, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      WRAP.wrap("`od[I :~a", 1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<String> arrayList0 = WRAP.wrap("'", 1413);
      assertEquals(1, arrayList0.size());
  }
}