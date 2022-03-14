package day_16;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Thiredclass {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
    driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
 
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.className("a-aui_72554-c a-aui_accordion_a11y_role_354025-c a-aui_killswitch_csa_logger_372963-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate")).click();
	
	
	
	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
