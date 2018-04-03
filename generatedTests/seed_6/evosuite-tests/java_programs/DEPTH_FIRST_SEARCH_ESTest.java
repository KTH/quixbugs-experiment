/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 29 12:47:07 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.DEPTH_FIRST_SEARCH;
import java_programs.Node;

public class DEPTH_FIRST_SEARCH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DEPTH_FIRST_SEARCH dEPTH_FIRST_SEARCH0 = new DEPTH_FIRST_SEARCH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Node> arrayList0 = new ArrayList<Node>();
      Node node0 = new Node("=fe]Lzxj$Yd]^wt|iSA", arrayList0, arrayList0);
      Node node1 = new Node("=fe]Lzxj$Yd]^wt|iSA", arrayList0);
      arrayList0.add(node0);
      boolean boolean0 = DEPTH_FIRST_SEARCH.depth_first_search(node0, node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Node> arrayList0 = new ArrayList<Node>();
      Node node0 = new Node("=fe]Lzxj$Yd]^wt|iSA", arrayList0, arrayList0);
      Node node1 = new Node("=fe]Lzxj$Yd]^wt|iSA", arrayList0);
      arrayList0.add(node0);
      boolean boolean0 = DEPTH_FIRST_SEARCH.depth_first_search(node1, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Node node0 = new Node("TOMq2)hpE$$|\" u,Dr4");
      Node node1 = new Node("TOMq2)hpE$$|\" u,Dr4", node0);
      // Undeclared exception!
      try { 
        DEPTH_FIRST_SEARCH.depth_first_search(node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
