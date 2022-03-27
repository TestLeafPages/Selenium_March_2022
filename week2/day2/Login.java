package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	// Launches new browser for every execution
	public static void main(String[] args) throws InterruptedException {
		
		// Setup the driver
		WebDriverManager.chromedriver().setup(); // static
	//	WebDriverManager.firefoxdriver().setup();
		
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
		
		// Load the url (get)
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Identify username field and enter the username
		driver.findElement(By.xpath("//input[@id='usernam']")).sendKeys("DemoSalesManager");
		
		// Identify password field and enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		// Click on Login
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Click on CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Haja");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
		
		// Select source
//		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		
//		Select dd = new Select(eleSource);
//		
//		dd.selectByVisibleText("Employee");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(text);
		// Get the title of application
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(5000);
		
	//	driver.close();
	}

}
