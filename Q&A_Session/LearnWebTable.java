package qa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//cntrl+shift+O

public class LearnWebTable {

	public static void main(String[] args) {
		
		String input = "Market Share";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//font[contains(text(),'80%')]/following::input")).click();
		
		
		/*
		 * driver.get("https://html.com/tags/table/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * List<WebElement> allYoungerSiblings =
		 * driver.findElements(By.xpath("//td[text()='"+input+"']/following-sibling::td"
		 * ));
		 * 
		 * 
		 * for (WebElement eachEle : allYoungerSiblings) { String text =
		 * eachEle.getText(); System.out.println(text);
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
				

	}

}
