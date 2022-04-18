package qa;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//cntrl+shift+O

public class LearnDropDown {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate the parent element for the DropDown
		WebElement dd = driver.findElement(By.id("dropdown1"));
		Select dropDown = new Select(dd);
		
		//dropDown.selectByVisibleText("Appium");
		//dropDown.selectByIndex(1);
		dropDown.selectByValue("3");
		
		File source = dd.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./snaps/dd.png");
		
		FileUtils.copyFile(source, target);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
