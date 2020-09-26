package com.testNg.Test;

import org.testng.annotations.Test;

public class TestOutTime {
	
	@Test(description="超时测试,设置超时2秒",timeOut=2000)
	public void TestOutTimes() throws InterruptedException {
		Thread.sleep(3000);
	}
	@Test(description="超时测试,设置超时2秒",timeOut=2000)
	public void TestOutTimesTwo() throws InterruptedException {
		Thread.sleep(1000);
	}
}