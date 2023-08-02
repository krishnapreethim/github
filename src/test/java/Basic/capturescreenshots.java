package Basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class capturescreenshots {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcFile= screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:/Users/Home/eclipse-workspace/Java_Programes/target/screenshot.png");
		FileUtils.copyFile(srcFile, destFile);
		
	}

}
