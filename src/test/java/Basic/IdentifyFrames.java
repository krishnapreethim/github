package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyFrames 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	     // Identify and count the number of frames on the page
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("Number of frames: " + frames.size());
        // Loop through each fream and check for inner frames
        for(int i=0; i<frames.size();i++)
        {
        	driver.switchTo().frame(i);
        	// identify and count the number of inner frames within the current frame
        	List<WebElement>innerFrames = driver.findElements(By.tagName("iframe"));
        	System.out.println("Number of inner frames in Frame"+i+" "+innerFrames.size());
        	// Switch back to the main content or parent frame
        	driver.switchTo().defaultContent();
        }

	driver.quit();
	
	}

}
