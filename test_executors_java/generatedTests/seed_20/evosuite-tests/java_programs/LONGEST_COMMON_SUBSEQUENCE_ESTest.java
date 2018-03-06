/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 00:25:15 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LONGEST_COMMON_SUBSEQUENCE;

public class LONGEST_COMMON_SUBSEQUENCE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("TlT!:]<d?Nk", "+I5LeP)TCJ-Ow");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      String string0 = null;
      String string1 = "";
      // Undeclared exception!
      try { 
        LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("q!KaNwHeTXw", "q!KaNwHeTXw");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("m&^D}c", "v");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("ZGz/%x", "tuZ^Ae)$");
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("JltB'~MayIK`T", "");
      String string1 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("uV#vS7URHZQ99zD", "");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "<CTh!BmAo2\"b~z:Jt?]");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("<<.Q~mfR/r)T", "?G;Bhx=m=");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("@n<o3k0>R*QJsDLA'a0", "@n<o3k0>R*QJsDLA'a0");
  }
}