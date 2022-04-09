package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) throws IOException {
		// Setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.getTitle()); // title of the current window
		String firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);
		
		
		// Click on the Open Home Page button
		driver.findElement(By.id("home")).click();
		
		//New window will be opened
		
		System.out.println("**************************************");
		//System.out.println(driver.getTitle()); 
		
		//To get all the window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//Copy the Set values into List
		List<String> listHandles = new ArrayList<String>(allWindowHandles);
		
		//String secondWindowHandle = listHandles.get(1);
		
		//switch to second window
		driver.switchTo().window(listHandles.get(1));
		
		System.out.println(driver.getTitle()); 
		
		driver.close(); //it will close the current window (2nd window)
		
		//to move the control to the first window
		driver.switchTo().window(listHandles.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.quit(); // Will close all the windows
				
		/*
		 * for (String eachHandle : allWindowHandles) { System.out.println(eachHandle);
		 * 
		 * }
		 */
		
		//want to move my control to the second window
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
