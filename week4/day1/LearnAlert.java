package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
//		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	//	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		// switch to alert
		Alert alert = driver.switchTo().alert();
		
		// get the alert text
//		String text = alert.getText();
//		System.out.println(text);
//		
//		Thread.sleep(5000);
//		
//		// Enter text in alert box
//		alert.sendKeys("ABC");
//		
//		Thread.sleep(5000);
//		
//		// accept the alert
//		alert.accept();
		alert.dismiss();
		
	}

}
