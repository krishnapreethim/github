package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		// Fine the element to mouseover
		WebElement mouse = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		//Creat an Action object
		Actions actions = new Actions(driver);
		
		//perform mouse over object
		actions.moveToElement(mouse).perform();
		
		actions.click();
	}

}
