package day32;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AllAnnitations {

	@Test
	void test()
	{
		System.out.println("This test is to print");
	}
	@Test
	void test2(			 )
	{
		System.out.println("This TEST is to print");
	}
	@BeforeMethod
	void BM()
	{
		System.out.println("This is before Method");
	}
	@AfterMethod 
	void AM()
	{
		System.out.println("This is AfterMethod");
	}
	@BeforeClass
	void BC()
	{
	System.out.println("This is BeforeClass..");
	}
	@AfterClass
	void AC()
	{
		System.out.println("This is AfterClass..");
	}
	@BeforeTest
	void BT()
	{
		System.out.println("this is Before Test..");
	}
	@AfterTest
	void AT()
	{
		System.out.println("This is After Test..");
	}
	
	
	

}
