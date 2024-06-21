package com.actitime.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package_1.BaseTest;

public class Tc1 extends BaseTest {
	
	@Test
	public void test()
	{
		System.out.println("Hii");
		
		Assert.fail();
	}
	

}
