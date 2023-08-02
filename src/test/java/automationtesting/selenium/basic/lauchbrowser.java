package automationtesting.selenium.basic;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lauchbrowser
{
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		String url= driver.getCurrentUrl();
		System.out.println("Url of the page::"+url);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Get title og the page::"+title);
		driver.close();
	}

}
