
package day34;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(day34.MyListener.class)
public class Mytest {
@Test(priority=1)
void test1()
{
	Assert.assertEquals("a", "a");
}
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("a", "b");
	}
	
	@Test(priority=3,dependsOnMethods= {"test2"}) 
	void test3()
	{
		Assert.assertEquals("a","a");
	}
	
}
