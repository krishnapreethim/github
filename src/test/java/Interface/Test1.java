package Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//Open browser 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		// Launch Site
		driver.get("chrome://settings/"); //base url
		Thread.sleep(2000);
		
		//Operate an element under nested shadow- root
		/*driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		      .findElement(By.id("toolbar")).getShadowRoot()
		      .findElement(By.id("search")).getShadowRoot()
		      .findElement(By.id("searchInput")).sendkeys("Krishna");*/
	}

}
