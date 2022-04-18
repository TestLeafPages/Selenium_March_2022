package qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//cntrl+shift+O

public class LearnNestedFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.switchTo().frame(1); // move the control to the 2nd frame in the page
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		
		driver.switchTo().frame(frame2); // move the control inside the nested frame
		
		driver.findElement(By.id("Click1")).click();
		
		
		
		
		
		
		
		
		
		
				

	}

}
