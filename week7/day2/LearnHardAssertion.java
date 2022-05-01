package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHardAssertion {

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

		//first Assertion
	    Assert.assertEquals(actTitle, expTitle);
	    System.out.println("First assertion completed");
	    
	    boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	    
	    //second assertion
	    Assert.assertTrue(displayed); //pass if the value is true else fail
	    System.out.println("second assertion completed");
	    
	   // Assert.assertFalse(displayed); // pass if the value is false else fail
	    
	    /*
			 * if (expTitle.equals(actTitle)) {
			 * System.out.println("Title value is matching"); } else {
			 * System.out.println("Title value is not matching"); }
			 */

	}

}
