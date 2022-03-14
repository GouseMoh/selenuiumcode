package day32;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Before class
//After class
public class Method02 {
	@BeforeClass
	void login()
	{
		System.out.println("login.......");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Serach ......");
	}
	@Test (priority=2)
	void  AdvSearch()
	{
		System.out.println("Adhv Search.....");
	}
	@AfterClass
	void Logout()
	{
		System.out.println("Logout .....");
	}
}
