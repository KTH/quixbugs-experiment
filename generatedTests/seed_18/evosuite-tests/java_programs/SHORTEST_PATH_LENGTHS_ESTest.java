/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 29 14:26:53 GMT 2018
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
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, hashMap0);
      // Undeclared exception!
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(6071, map0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-104), (Map<List<Integer>, Integer>) null);
  }
}
