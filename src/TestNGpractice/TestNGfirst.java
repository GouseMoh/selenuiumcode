package TestNGpractice;

import org.testng.annotations.Test;

public class TestNGfirst {
	@Test(priority=1)
	void openApp()
	{
	 System.out.println("OpeningApplication");
	}
	@Test(priority=2) 
	void login()
	{
		System.out.println("login to appliction");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("log out from the Application");
	}
	@Test(priority=4)
	void close()
	{
		System.out.println( "close the Application");
	}
}
