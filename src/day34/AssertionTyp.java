package day34;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTyp {
	@Test
	void test_hardassertion()
	{
		Assert.assertTrue (true);
		System.out.println("Hard Assertion is completed...");
	}

	@Test
	void test_softassertion()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Soft Assertion is completed");
	
	sa.assertAll();
	}
}
