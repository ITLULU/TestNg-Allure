package com.testNg.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSecond {
  @Test
  public void TestAssert() {
	  Assert.assertEquals("2", 2);
  }
  @Test
  public void TestAssertT() {
	  Assert.assertEquals(2, 2);
  }
  @Test
  public void TestAssertThree() {
	  int a=3;
	  Assert.assertNull(a);
  }
  @Test
  public void TestAssertFour() {
	  String expected="预期结果";
	  String actual="实际结果";
	  Assert.assertSame(actual, expected);
  }
  @Test
  public void TestAssertW() {
	Assert.assertTrue(1==2);
  }
}
