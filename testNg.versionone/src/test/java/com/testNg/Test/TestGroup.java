package com.testNg.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup {
	@Test(description="测试分组" ,groups= {"operation"})
	public void TestGroupAdd() {
		Reporter.log(String.valueOf(11+12));
	}
	@Test(description="测试分组" ,groups= {"operation"})
	public void TestGroupsub() {
		Reporter.log(String.valueOf(21-12));
	}
	@Test(description="测试分组" ,groups= {"annimal","Nooperation"})
	public void TestGroupCat() {
		Reporter.log("cat 喵喵");
	}
	@Test(description="测试分组" ,groups= {"annimal","Nooperation"})
	public void TestGroupDog() {
		Reporter.log("dog  汪汪");
	}
	
	@Test(description="测试分组" ,groups= {"Language"})
	public void TestGroupEnglish() {
		Reporter.log("good English");
	}
	@Test(description="测试分组" ,groups= {"Language"})
	public void TestGroupChinese() {
		Reporter.log("good Chinese");
	}
	
	
}