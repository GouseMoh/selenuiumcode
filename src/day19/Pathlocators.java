package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pathlocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
		driver.manage().window().maximize();
	//using Absalute path
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("mobile");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
	 // using Relative path 
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("cricketbats");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@type=\"text\"][@id=\"twotabsearchtextbox\"]")).sendKeys("books");
		//driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"][@type=\"submit\"]")).click();
	//xpath with (Or) operator
		//driver.findElement(By.xpath("//input[@type=\"text\"or@id=\"twotabsearchtextbox\"]")).sendKeys("pens");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	//xpath with and operator
		//driver.findElement(By.xpath("//*[@type=\"text\"and@id=\"twotabsearchtextbox\"]")).sendKeys("rice");
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"and@type=\"submit\"]")).click();	
	//xpath with contains()
		//driver.findElement(By.xpath("//*[contains(@name,\"field\")]")).sendKeys("biskets");
		//driver.findElement(By.xpath("//*[contains(@id,'nav-search-submit-button')]")).click();
	//xpath starts with ()
		//driver.findElement(By.xpath("//*[starts-with(@name,'field')]")).sendKeys("beds");
		//driver.findElement(By.xpath(" //*[starts-with(@id,'nav-search-submit')]")).click();
	//xpath text()
		//driver.findElement(By.xpath("//*[text()='Fresh']")).click();
		//driver.findElement(By.xpath("//*[text()='Pet Supplies']")).click();
	//xpath chained
		//driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]/*[@id=\"nav-logo\" ]"));
	//List<WebElement>images=driver.findElements(By.tagName("img"));
	//System.out.println("Number of Images in Amazon:"+images.size());
	
	//List<WebElement>links=driver.findElements(By.className("a"));
	//System.out.println("Number of linkes in Amazon:"+links.size());
	List<WebElement>sliders=driver.findElements(By.className("_cropped-image-link_style_fluidLandscapeImage__3eTVC _cropped-image-link_style_fluidImage__iJ3aE"));
	System.out.println("Number of slider:"+sliders.size());


		
	}

	
}
