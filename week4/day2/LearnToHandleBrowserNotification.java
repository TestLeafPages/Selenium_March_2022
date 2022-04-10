package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToHandleBrowserNotification {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement eleMen = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		
		Actions builder = new Actions(driver);
		builder
		.moveToElement(eleMen)
		.click(driver.findElement(By.xpath("(//span[contains(text(),'Shirts')])[2]")))
		.perform();
		
		
		WebElement firstWishlist = driver.findElement(By.xpath("//span[@class='animated-icon']"));
		
		builder
		.moveToElement(firstWishlist)
		.click(driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")))
		.perform();
		
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
