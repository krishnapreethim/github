package automationtesting.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitHubPage 
{
	public static void main(String[] args) throws Throwable 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement text = driver.findElement(By.linkText("Forgot password?"));
		String tx = text.getText();
		text.click();
		System.out.println(tx);
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement page_header = driver.findElement(By.tagName("h1"));
		String pb = page_header.getText();
		System.out.println(pb);
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='login_field']"));
		username.sendKeys("krishnapreethi.m@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Vekanna@Swami1982");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//details[@class='details-overlay details-reset js-feature-preview-indicator-container']//details-menu[@role='menu']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		String Curl=driver.getCurrentUrl();
		System.out.println(Curl);
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
