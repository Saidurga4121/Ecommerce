package com.testing.PageObjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample 
{
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	
//	@BeforeTest
//	public void beforetest()
//	{
//		System.out.println("beforetest");
//	}
	
@BeforeClass
public void beforeClass()
{
	System.out.println("beforeClass");
}
	
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("beforeMethod");
//	}
//	
//	
//	@AfterMethod
//	public void AfterMethod()
//	{
//		System.out.println("AfterMethod");
//	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
//	@AfterTest
//	public void AfterTest()
//	{
//		System.out.println("AfterTest");
//	}
	
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	
	

}
