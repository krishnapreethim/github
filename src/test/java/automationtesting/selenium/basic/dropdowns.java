package automationtesting.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		WebElement username = driver.findElement(By.xpath("//input[@id='login_field']"));
		username.sendKeys("krishnapreethi.m@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Vekanna@Swami1982");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement dd = driver.findElement(By.xpath("//summary[@aria-label='View profile and more']"));
		dd.click();
		WebElement logout = driver.findElement(By.xpath("//button[contains(text(),'Sign out')]"));
		logout.click();
		Select profile = new Select(logout);
		profile.selectByVisibleText("submit");
		WebElement selectedone = profile.getFirstSelectedOption();
		System.out.println(selectedone.getText());
	
		
		
	}

}
