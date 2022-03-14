 package day31testNG;

import org.testng.annotations.Test;

/*
 1.open the URL
 2.login the Application
 3.logout the Application
 4.close the Application
 */
public class FirstTestNG {
	
	@Test (priority=2)
	void Login()
	{
		System.out.println("loginto Application");
	}
    @Test(priority=3)
   void logout()
   {
	System.out.println("logout the application");
   }
   @Test (priority=4,enabled=false)
   void close()
  {
	System.out.println("closing the application");
  }
   @Test (priority=1)
   void openurl()
  {
	 System.out.println("Opening the URL"); 
   }

}
