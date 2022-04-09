package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Setup driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Load salesforce application
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // 30 secs
		
		
		
		//Login to Salesforce		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();
				
		//wait for 10 secs
		//Thread.sleep(10000); // java wait // Create is appeared at 8th sec
		
		
		
		//click on Create dropdown
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		
		
		
		
	}

}
