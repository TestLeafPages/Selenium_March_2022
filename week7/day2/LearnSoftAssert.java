package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSoftAssert {

	@Test
	public void createLead() {
		// Leaftaps - TestLeaf Automation Platform
		String expTitle = "TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		String actTitle = driver.getTitle();

		// first Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actTitle, expTitle);
		System.out.println("First Assertion Completed");

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

		// second assertion
		sa.assertTrue(displayed); // pass if the value is true else fail
		System.out.println("second assertion completed");
		
		sa.assertAll(); // to consolidate the result
	}

}
