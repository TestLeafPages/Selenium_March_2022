package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Switch to frame
//		driver.switchTo().frame(0);
////		WebElement frame = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
////		driver.switchTo().frame(frame);
////		driver.findElement(By.id("Click")).click();
//		
//		driver.switchTo().defaultContent();
//		
//		String text = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text);
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().parentFrame();
	}

}
