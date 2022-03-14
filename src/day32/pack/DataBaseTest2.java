package day32.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DataBaseTest2 {
	@Test(priority=3)
	void test_Select()
	{
		System.out.println("Selected Sucssesfully");
	}
	@Test(priority=4)
	void Test_delete()
	{
		System.out.println("deleted Sucssesfully");
	}
	@AfterTest
	void close_db()
	{
	System.out.println("Close DataBase");	
	}

}
