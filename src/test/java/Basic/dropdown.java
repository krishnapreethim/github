package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		// Find the dropdown/select element
		WebElement dropdown = driver.findElement(By.xpath("//select[@title='Search in']"));
		dropdown.click();
		
		// Create a Select object
		Select select = new Select(dropdown);
		
		// Select by visible text
		select.selectByVisibleText("Automotive");
		
		// Select by value
		select.selectByValue("search-alias=beauty-intl-ship");
		
		//Select by index
		select.selectByIndex(4);
		
		// print
		System.out.println(select);
	}

}
