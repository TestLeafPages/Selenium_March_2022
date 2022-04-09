package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrameAndAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//click on Try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//handle the alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hari");
		alert.accept();
		
		//validate the name
		WebElement eleText = driver.findElement(By.id("demo"));
		String text = eleText.getText();
		
		if(text.contains("Hari")) {
			System.out.println("The text contains my name");
		}else {
			System.out.println("Text does not having my name");
		}
		
	}

}
