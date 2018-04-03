/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 29 14:00:37 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java_programs.SHORTEST_PATH_LENGTHS;

public class SHORTEST_PATH_LENGTHS_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(505, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, hashMap0);
      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map0);
      assertTrue(map1.equals((Object)map0));
      assertEquals(4, map1.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      // Undeclared exception!
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(1173, hashMap0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1847), hashMap0);
      assertTrue(map0.isEmpty());
  }
}
