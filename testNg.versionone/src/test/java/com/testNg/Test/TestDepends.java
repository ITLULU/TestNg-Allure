package com.testNg.Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDepends {
	
	@Test(description="登录测试" )
	public void Testlogin() {
		Reporter.log("测试登录失败");
		Assert.fail();
	}
	@Test(description="依赖登录" ,dependsOnMethods= {"Testlogin"})
	public void TestPayOrder() {
		System.out.println("----支付购买----");
		Reporter.log("登陆成功---可以支付购买物品");
	}
}