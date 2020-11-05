package com.testNg.Test;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestException {
	
	@Test(description="测试异常",dataProvider="data", expectedExceptions=ArithmeticException.class)
	public void TestDataOut(int a,int b)  {
		int result=a+b;
		System.out.println("result:"+result);
		Reporter.log("测试结果："+result);
	}
	@DataProvider(name="data")
	public Object[][]dataprovide(){
		return new Object[][] {
			new Object[] {111111,1111111111},
			new Object[] {4,2147483647},
		};
	}
}