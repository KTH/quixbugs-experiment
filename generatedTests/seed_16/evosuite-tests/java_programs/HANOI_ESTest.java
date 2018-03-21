/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:29:23 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.List;
import java_programs.HANOI;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class HANOI_ESTest {

  @Test(timeout = 8000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(object0, "");
      HANOI.Pair<Object, Object> hANOI_Pair1 = new HANOI.Pair<Object, Object>(object0, hANOI_Pair0);
      Integer integer0 = new Integer(2);
      Integer.compareUnsigned(0, (-452));
      HANOI.Pair<Integer, Object> hANOI_Pair2 = new HANOI.Pair<Integer, Object>(integer0, object0);
      Integer.getInteger("");
      HANOI.Pair<Object, Integer> hANOI_Pair3 = new HANOI.Pair<Object, Integer>(object0, (Integer) null);
      Integer integer1 = hANOI_Pair3.getSecond();
      assertNull(integer1);
  }

  @Test(timeout = 8000)
  public void test01()  throws Throwable  {
      HANOI.hanoi(2, 2, (-351));
      Integer integer0 = new Integer(0);
      HANOI.Pair<String, String> hANOI_Pair0 = new HANOI.Pair<String, String>("EeX/[f@4Xq", "}Tl>");
      HANOI.Pair<Integer, Object> hANOI_Pair1 = new HANOI.Pair<Integer, Object>(integer0, hANOI_Pair0);
      Integer integer1 = hANOI_Pair1.getFirst();
      Integer integer2 = new Integer(0);
      HANOI.Pair<Integer, Integer> hANOI_Pair2 = new HANOI.Pair<Integer, Integer>(integer1, integer2);
      HANOI.Pair<Object, Object> hANOI_Pair3 = new HANOI.Pair<Object, Object>(hANOI_Pair2, integer0);
      Integer integer3 = new Integer((-2051));
      hANOI_Pair3.setFirst(integer3);
      assertFalse(integer1.equals((Object)integer3));
  }

  @Test(timeout = 8000)
  public void test02()  throws Throwable  {
      HANOI.Pair<String, String> hANOI_Pair0 = new HANOI.Pair<String, String>("6MlP8<GmH/l8'V", "zejvyb");
      hANOI_Pair0.setSecond("zejvyb");
      hANOI_Pair0.setFirst("6MlP8<GmH/l8'V");
      hANOI_Pair0.toString();
      HANOI.Pair<Object, Object> hANOI_Pair1 = new HANOI.Pair<Object, Object>("zejvyb", "6MlP8<GmH/l8'V");
      hANOI_Pair1.setFirst("zejvyb");
      Object object0 = new Object();
      hANOI_Pair1.setFirst(object0);
      hANOI_Pair1.setFirst(hANOI_Pair0);
      Integer integer0 = new Integer(227);
      HANOI.Pair<Integer, Object> hANOI_Pair2 = new HANOI.Pair<Integer, Object>(integer0, hANOI_Pair1);
      hANOI_Pair2.setSecond(integer0);
      Integer integer1 = new Integer(227);
      hANOI_Pair1.setFirst(integer1);
      HANOI hANOI0 = new HANOI();
      Integer integer2 = new Integer(227);
      Integer.compareUnsigned(227, 227);
      HANOI.Pair<String, Object> hANOI_Pair3 = new HANOI.Pair<String, Object>("", integer2);
      hANOI_Pair3.getFirst();
      HANOI.Pair<Integer, HANOI.Pair<String, String>> hANOI_Pair4 = new HANOI.Pair<Integer, HANOI.Pair<String, String>>(integer0, hANOI_Pair0);
      Integer integer3 = new Integer(227);
      hANOI_Pair4.setFirst(integer3);
      assertTrue(integer3.equals((Object)integer1));
  }

//  @Test(timeout = 12000)
//  public void test03()  throws Throwable  {
//      HANOI hANOI0 = new HANOI();
//      HANOI.Pair<Object, String> hANOI_Pair0 = (HANOI.Pair<Object, String>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
//      doReturn((String) null).when(hANOI_Pair0).toString();
//      HANOI.Pair<String, HANOI.Pair<Object, String>> hANOI_Pair1 = new HANOI.Pair<String, HANOI.Pair<Object, String>>(")", hANOI_Pair0);
//      hANOI_Pair1.toString();
//      HANOI.Pair<Object, String> hANOI_Pair2 = new HANOI.Pair<Object, String>(")", "");
//      hANOI_Pair2.toString();
//      hANOI_Pair1.setSecond(hANOI_Pair2);
//      hANOI_Pair1.toString();
//      hANOI_Pair2.getSecond();
//      int int0 = 805;
//      HANOI.hanoi(int0, int0, int0);
//      int int1 = 0;
//      int int2 = 0;
//      HANOI.hanoi(int1, int2, int0);
//      int int3 = 2;
//      int int4 = 0;
//      int int5 = 763;
//      HANOI.hanoi(int3, int4, int5);
//      HANOI.Pair<Object, String> hANOI_Pair3 = hANOI_Pair1.getSecond();
//      String string0 = "";
//      hANOI_Pair3.setSecond(string0);
//  }

  @Test(timeout = 8000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      HANOI.Pair<String, Integer> hANOI_Pair0 = new HANOI.Pair<String, Integer>("", integer0);
      assertNotNull(hANOI_Pair0);
      
      HANOI.Pair<Object, String> hANOI_Pair1 = new HANOI.Pair<Object, String>(hANOI_Pair0, "");
      assertNotNull(hANOI_Pair1);
      
      Object object0 = hANOI_Pair1.getFirst();
      assertNotNull(object0);
  }

  @Test(timeout = 8000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>(integer0, "");
      assertNotNull(hANOI_Pair0);
      
      HANOI hANOI0 = new HANOI();
      assertNotNull(hANOI0);
      
      HANOI.Pair<String, Object> hANOI_Pair1 = new HANOI.Pair<String, Object>(">6v6tsMyWm.|%z", hANOI0);
      assertNotNull(hANOI_Pair1);
      
      Integer integer1 = new Integer(0);
      assertTrue(integer1.equals((Object)integer0));
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      HANOI.Pair<Integer, Object> hANOI_Pair2 = new HANOI.Pair<Integer, Object>(integer1, object0);
      assertTrue(integer1.equals((Object)integer0));
      assertNotNull(hANOI_Pair2);
      
      Object object1 = hANOI_Pair2.getFirst();
      assertTrue(integer1.equals((Object)integer0));
      assertTrue(object1.equals((Object)integer0));
      assertNotNull(object1);
      assertEquals(0, object1);
      
      hANOI_Pair1.setSecond(object1);
      assertTrue(integer1.equals((Object)integer0));
      assertTrue(object1.equals((Object)integer0));
  }

  @Test(timeout = 8000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      HANOI.Pair<Object, Object> hANOI_Pair0 = new HANOI.Pair<Object, Object>(object0, object0);
      assertNotNull(hANOI_Pair0);
      
      Object object1 = hANOI_Pair0.getSecond();
      assertNotNull(object1);
      assertSame(object0, object1);
      assertSame(object1, object0);
      
      HANOI.Pair<String, HANOI.Pair<Object, Object>> hANOI_Pair1 = new HANOI.Pair<String, HANOI.Pair<Object, Object>>("mH;]Y1XTOS6s)", hANOI_Pair0);
      assertNotNull(hANOI_Pair1);
      
      String string0 = hANOI_Pair1.toString();
      assertNotNull(string0);
      assertSame(object0, object1);
  }

  @Test(timeout = 8000)
  public void test07()  throws Throwable  {
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("", "");
      assertNotNull(hANOI_Pair0);
      
      String string0 = hANOI_Pair0.getFirst();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 8000)
  public void test08()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      assertNotNull(hANOI0);
      
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(0, 0, (-1317));
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertNotNull(list0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("XtO*+]$iv", object0);
      assertNotNull(hANOI_Pair0);
      
      HANOI.Pair<String, Object> hANOI_Pair1 = new HANOI.Pair<String, Object>((String) null, hANOI_Pair0);
      assertFalse(hANOI_Pair1.equals((Object)hANOI_Pair0));
      assertNotNull(hANOI_Pair1);
      
      String string0 = hANOI_Pair1.getFirst();
      assertFalse(hANOI_Pair0.equals((Object)hANOI_Pair1));
      assertFalse(hANOI_Pair1.equals((Object)hANOI_Pair0));
      assertNull(string0);
      assertNotSame(hANOI_Pair0, hANOI_Pair1);
      assertNotSame(hANOI_Pair1, hANOI_Pair0);
      
      HANOI.Pair<Object, String> hANOI_Pair2 = (HANOI.Pair<Object, String>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(2559);
      assertNotNull(integer0);
      assertEquals(2559, (int)integer0);
      
      HANOI.Pair<HANOI.Pair<Object, String>, Integer> hANOI_Pair3 = new HANOI.Pair<HANOI.Pair<Object, String>, Integer>(hANOI_Pair2, integer0);
      assertNotNull(hANOI_Pair3);
      
      Integer integer1 = new Integer(2559);
      assertTrue(integer1.equals((Object)integer0));
      assertNotNull(integer1);
      assertEquals(2559, (int)integer1);
      
      int int0 = Integer.compare(2559, 2559);
      assertEquals(0, int0);
      
      hANOI_Pair3.setSecond(integer1);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)integer1));
      assertTrue(integer1.equals((Object)integer0));
      assertFalse(integer1.equals((Object)int0));
  }

  @Test(timeout = 8000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-1600));
      assertNotNull(integer0);
      assertEquals((-1600), (int)integer0);
      
      int int0 = Integer.min((-1600), (-1600));
      assertEquals((-1600), int0);
      
      int int1 = Integer.compare((-1600), (-1600));
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>(integer0, "+~GH ");
      assertFalse(integer0.equals((Object)int1));
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(hANOI_Pair0);
      
      hANOI_Pair0.setSecond("+~GH ");
      assertFalse(integer0.equals((Object)int1));
      assertTrue(integer0.equals((Object)int0));
      
      HANOI.Pair<Object, Object> hANOI_Pair1 = new HANOI.Pair<Object, Object>((Object) null, "+~GH ");
      assertNotNull(hANOI_Pair1);
      
      Integer integer1 = Integer.getInteger("");
      assertNull(integer1);
      
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(0, 0, (-1600));
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
      
      Integer integer2 = new Integer(0);
      assertFalse(integer2.equals((Object)integer0));
      assertTrue(integer2.equals((Object)int1));
      assertFalse(integer2.equals((Object)int0));
      assertNotNull(integer2);
      assertEquals(0, (int)integer2);
      
      HANOI.Pair<Integer, Object> hANOI_Pair2 = new HANOI.Pair<Integer, Object>(integer2, integer2);
      assertFalse(integer2.equals((Object)integer0));
      assertTrue(integer2.equals((Object)int1));
      assertFalse(integer2.equals((Object)int0));
      assertNotNull(hANOI_Pair2);
      
      HANOI.Pair<Integer, String> hANOI_Pair3 = new HANOI.Pair<Integer, String>(integer0, "k9C");
      assertFalse(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)integer2));
      assertTrue(integer0.equals((Object)int0));
      assertFalse(hANOI_Pair3.equals((Object)hANOI_Pair0));
      assertNotNull(hANOI_Pair3);
  }

  @Test(timeout = 8000)
  public void test10()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-1), 0, (-1));
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
      
      HANOI.Pair<HANOI.Pair<Integer, Object>, String> hANOI_Pair0 = new HANOI.Pair<HANOI.Pair<Integer, Object>, String>((HANOI.Pair<Integer, Object>) null, "");
      assertNotNull(hANOI_Pair0);
      
      String string0 = hANOI_Pair0.getSecond();
      assertNotNull(string0);
      assertEquals("", string0);
  }
}
