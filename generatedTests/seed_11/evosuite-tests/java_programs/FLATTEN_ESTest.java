/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 20:25:22 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.FLATTEN;

public class FLATTEN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FLATTEN fLATTEN0 = new FLATTEN();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) null);
      ArrayList arrayList1 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertEquals(1, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      arrayList0.add((Object) arrayList1);
      ArrayList arrayList2 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertEquals(0, arrayList2.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = FLATTEN.flatten((Object) null);
      assertNull(object0);
  }
}
