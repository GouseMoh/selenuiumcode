package day32;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Method01 {
	@BeforeMethod
	void Login()
	{
		System.out.println("log in........");
		
	}
	@Test(priority=2)
	void search()
	{
		System.out.println("searching.....!");
	}
	@Test(priority=1)
	void AdvaSearch()
	{
		System.out.println("AdvSearch......!");
	}
	@AfterMethod
   void Logout()
   {
	   System.out.println("Logout ......!");
   }
	
   
   
   
}
