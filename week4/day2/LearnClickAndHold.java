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
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));

		// Create object for Actions class
		Actions builder = new Actions(driver);
		builder
		.clickAndHold(item1)
		.moveToElement(item7)
		.release()
		.perform();

	}
}
