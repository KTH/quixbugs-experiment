/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 03:09:26 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.QUICKSORT;

public class QUICKSORT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QUICKSORT qUICKSORT0 = new QUICKSORT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2513));
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(2, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2513));
      Integer integer1 = new Integer(0);
      arrayList0.add(integer1);
      arrayList0.add(integer0);
      QUICKSORT.quicksort(arrayList0);
      assertEquals(2, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        QUICKSORT.quicksort((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(0, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2513));
      arrayList0.add(integer0);
      Integer integer1 = new Integer(0);
      arrayList0.add(integer1);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(2, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }
}