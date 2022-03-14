package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaTest {
  WebDriver driver;
  
  @BeforeClass
  @Parameters({"browser","url"})
  void setup(String br,String Appurl)
  {
    if(br.equals("chrome"))
    {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
    }
    else if (br.equals("edge"))
  {
	  System.setProperty("webdriver.edge.driver","C:\\Drivers\\edgedriver_win64\\CDriversedgedriver_win64.exe)");
	  driver=new EdgeDriver();
  }
    else if (br.equals("firefox"))
    {
    	System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
    	driver=new FirefoxDriver();
    }
    driver.get(Appurl);
    Assert.assertTrue(true);
  }

  @Test(priority=1)
  void TestLogo()
  {
	  try
	  {
	 WebElement logo= driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	 Assert.assertEquals(logo.isDisplayed(),true);
	  }
	  catch(Exception e)
	  {
		  Assert.fail();
	  }
  }
  
  @Test(priority=2)
  void testTitle()
  {
	 Assert.assertEquals( driver.getTitle(),"OrangeHRM","Title aer not found");
	  }
  @AfterClass
  void tearDemo()
  {
	  driver.quit();
  }
  
  
  
	}


