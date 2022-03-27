package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // static

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url (get)
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// Maximize the browser
		driver.manage().window().maximize();
		
		// Step1: Find the dropdown element (select tag)
		WebElement eleDropdown = driver.findElement(By.id("dropdown1"));
		
		// Step2: Convert that Select class (Dropdown)
		Select dd = new Select(eleDropdown);
		
		// Step3: Choose the value from dropdown
		
		// 1. Select by visible text
	//	dd.selectByVisibleText("Selenium");
		
		// 2. Select by value
	//	dd.selectByValue("1");
		
		// 3. Select by index
	//	dd.selectByIndex(1);
		
		// How to get options
		List<WebElement> options = dd.getOptions();
		int size = dd.getOptions().size();
		
		for(int i=0; i< size; i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}
		
		// datatype varName : GroupOfItems
		for (WebElement eachOption : options) {
			String text = eachOption.getText();
			System.out.println(text);
		}
		
		
		dd.selectByIndex(size-2);
		
		WebElement selected = dd.getFirstSelectedOption();
		System.out.println(selected.getText());
	}

}
