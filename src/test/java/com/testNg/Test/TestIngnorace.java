package com.testNg.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestIngnorace {
	@Test(description="优先级" ,priority= 10)
	public void TestpriorityAdd() {
		Reporter.log(String.valueOf(11+12));
	}
	@Test(description="优先级" ,priority= 2)
	public void Testprioritysub() {
		Reporter.log(String.valueOf(21-12));
	}
	@Test(description="优先级" ,priority= 5)
	public void TestpriorityCat() {
		Reporter.log("cat 喵喵");
	}
	@Test(description="优先级" ,priority= 4)
	public void TestprioritypDog() {
		Reporter.log("dog  汪汪");
	}
	
	@Test(description="优先级" ,priority= 8)
	public void TestpriorityEnglish() {
		Reporter.log("good English");
	}
	@Test(description="忽略测试" ,enabled=false)
	public void TestpriorityChinese() {
		Reporter.log("good Chinese");
	}
	
	
}