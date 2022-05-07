package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertToAppear {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//step1: Create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//step2: apply condition to wait
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
		
		driver.findElement(By.id("btn")).click();
		
	}

}
