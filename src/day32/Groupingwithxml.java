package day32;

import org.testng.annotations.Test;

public class Groupingwithxml {
	@Test(priority=1,groups= {"Sanity","Regression"})
	void loginByEmail()
	{
	System.out.println("log in By Email");

	}
	
	@Test(priority=2,groups={"Sanity"})
	void  LoginByFacebook()
	{
		System.out.println("Log in By Facebook");
	}
	
	@Test(priority=3,groups= {"Sanity"})
	void LoginBytwitter()
	{
		System.out.println( "Log in by Twitter");
	}
	
	@Test(priority=4,groups = {"Sanity","Regression"})
	void SignupByEmail()
	{
		System.out.println("Sign up By Email");
	}
	@Test (priority=5,groups={"Regression"})
	void Signupbyfacebook()
	{
		System.out.println("Sign up by Facebook");
    }
	@Test(priority=6,groups= {"Regression"})
	void SignupbyTwitter()
	{
		System.out.println("Sign up by twitter");
	}	
	@Test(priority=7,groups= {"Sanity","Regression"})
	void PaymentinRuppes()
	{
		System.out.println("Payments Should be in Ruppes");
	}
	@Test(priority=8,groups={"Sanity"})
	void Paymentindollers()
	{
	 System.out.println("Payments should be done in Dollers");	
	}
	@Test(priority=9,groups= {"Regression"})
	void paymentreturntobank()
	{
		System.out.println("Payment should be return to the Bank");
	}
	
}


