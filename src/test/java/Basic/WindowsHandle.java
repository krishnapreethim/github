package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.solugenix.com/");
		driver.findElement(By.xpath("//div[@id='hs_menu_wrapper_module_165791234703007']//span[contains(text(),'About Us')]")).click();
		// store the current window handle
		String mainWindow = driver.getWindowHandle();
		for(String windowHandle : driver.getWindowHandles())
		{
			if(windowHandle.equals(mainWindow))
			{
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		// Switch back to the main window or default content
		driver.switchTo().window(mainWindow);
	}

}
