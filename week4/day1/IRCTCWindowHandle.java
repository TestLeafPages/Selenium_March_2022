package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTCWindowHandle {

	public static void main(String[] args) throws IOException {
		// Setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//load the application
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on OK
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		//Click on FLIGHTS link
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		//get all the window handles
		Set<String> allHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(allHandles);
		
		driver.switchTo().window(listHandles.get(1));
		
		//print the second window title
		System.out.println(driver.getTitle());
		
		//close the second window
		driver.close();
		
		driver.switchTo().window(listHandles.get(0));
		
		//print the first window title
		System.out.println(driver.getTitle());
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
