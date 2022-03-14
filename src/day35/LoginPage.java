package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//webdriver instance
WebDriver driver;
//construtor
public LoginPage(WebDriver driver) 
{
 this.driver=driver;
}
	//locators
By image_logo_loc=By.xpath("//div[@id='divLogo']//img");
By text_username_loc=By.name("txtUsername");
By text_userpwd_loc=By.xpath("//input[@id='txtPassword']");
By btn_login_Loc=By.xpath("	//input[@id='btnLogin'] ");


//Action
public boolean cheaklogoPresence()
{
	boolean status=driver.findElement(image_logo_loc).isDisplayed();
	return status;
}
public void setusername(String name)
{
	driver.findElement(text_username_loc).clear();
	driver.findElement(text_username_loc).sendKeys(name);
}
public void setpassword(String pwd)
{
	driver.findElement(text_userpwd_loc).clear();
	driver.findElement(text_userpwd_loc).sendKeys(pwd);
}

public void clicklogin()
{
	driver.findElement(btn_login_Loc).click();
}



}
	
	
	

