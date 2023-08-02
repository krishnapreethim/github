package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uplods {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Home\\Downloads\\IMG-20220503-WA0009_1660184767425.jpg");
		driver.findElement(By.id("file-submit")).submit();
	/*	if(driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded");
		}
		else{
				System.out.println("file not uploaded");
			}*/
		//driver.quit();
	}
	

}
