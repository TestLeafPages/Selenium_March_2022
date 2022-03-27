package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // static

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url (get)
		driver.get("http://www.leafground.com/pages/Edit.html");

		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("input"));
		
		WebElement eleEmail = driver.findElement(By.id("email"));
		eleEmail.sendKeys("haja@testleaf.com", Keys.TAB);
		
		boolean displayed = eleEmail.isDisplayed();
		boolean selected = eleEmail.isSelected();
		if(selected) {
			eleEmail.click();
		}
		boolean enabled = eleEmail.isEnabled();
		System.out.println(displayed);
		
		String text = eleEmail.getText();
		System.out.println(text);
		
//		eleEmail.clear();
//		
//		eleEmail.sendKeys("Haja");
//		
//		String attribute = eleEmail.getAttribute("value");
//		System.out.println(attribute);
	}

}
