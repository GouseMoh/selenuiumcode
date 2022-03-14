package day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {
WebDriver driver;

public loginpage2(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//div[@id='divLogo']//img")
WebElement img_logo_loc;
@FindBy(xpath="//input[@id='txtUsername']")
WebElement text_username_loc;
@FindBy(xpath="//input[@id='txtPassword']")
WebElement txtpassword_loc;
@FindBy(xpath="//input[@id='btnLogin']")
WebElement btnlogin_loc;

public boolean cheaklogoPresence()
{
	boolean status=img_logo_loc.isDisplayed();
	return true;
}
public void setusername(String name)	
{
	text_username_loc.clear();
	text_username_loc.sendKeys("name");
}
public void setpassword(String pwd)
{
	txtpassword_loc.clear();
	txtpassword_loc.sendKeys("pwd");
}
	
public void clicklogin()
{
	btnlogin_loc.click();	
}
	
	
	
	
}
