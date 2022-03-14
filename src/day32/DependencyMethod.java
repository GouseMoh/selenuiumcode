package day32;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test(priority=1)
	void OpenApp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=1,dependsOnMethods={"OpenApp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	void Search()
	{
		Assert.assertTrue(true);
		}
	@Test(priority=4)
	void AdvSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4) 
	void logout()
	{
		Assert.assertTrue(true);
	}
}
