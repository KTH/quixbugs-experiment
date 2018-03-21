/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 04:22:33 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.SQRT;

public class SQRT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQRT sQRT0 = new SQRT();
  }

//  @Test(timeout = 4000)
//  public void test1()  throws Throwable  {
//      // Undeclared exception!
//      SQRT.sqrt((-1283.096), 0.0);
//  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = SQRT.sqrt((-1.0), 1528.85339);
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = SQRT.sqrt(1.0, 1.0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = SQRT.sqrt(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
