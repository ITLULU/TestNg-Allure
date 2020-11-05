package com.testNg.Test;

import static org.testng.Assert.assertEquals;

import javax.xml.crypto.Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDataProvider {
	@Test
	@Parameters({ "param1", "param2" })
	public void TestParamter(int num1, int num2) {
		System.out.println(num1 + num2);
		assertEquals(num1 + num2, 23);
	}

	@Test(dataProvider = "dp")
	public void TestDataprovide(Integer a, String b) {
			System.out.println("a:"+a+"   b:"+b);
	}

	@DataProvider(name = "dp")
	public Object[][] Dataprovider() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	
	
}