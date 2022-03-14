package day32.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataBaseTest1 {
	@Test(priority=1)
	void test_insert()
	{
		System.out.println("insertion is completed");
	}
  @Test(priority=2)
  void test_update()
  {
	  System.out.println("update is completed");
  }
   @BeforeTest
   void Connect_database()
   {
	   System.out.println("Connection to the Database is sucssesfull");
   }
}
