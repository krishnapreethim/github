package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownExample 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.solugenix.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(5,document.body.scrollHeight)");
		
	//	driver.quit();
		
	}

}
