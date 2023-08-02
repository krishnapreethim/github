package automationtesting.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("amazon");
		WebElement selectamazon = driver.findElement(By.xpath("//span[text()='Amazon']"));
		selectamazon.click();
		WebElement selectfirst = driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
		selectfirst.click();
		driver.close();
	}

}
