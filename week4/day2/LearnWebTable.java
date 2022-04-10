package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// get size of rows
		List<WebElement> tableRows = driver.findElements(By.xpath("//table//tr"));
		int rowSize = tableRows.size();
		System.out.println(rowSize);
		
		// iterate through the rows
		for(int i=2; i<=rowSize; i++) {
			// get size of cells
			List<WebElement> tableCols = driver.findElements(By.xpath("//table//tr["+i+"]/td"));
			int colSize = tableCols.size();
			System.out.println(colSize);
			// iterate through cells of each row
			for (int j = 1; j <= colSize; j++) {
				String text2 = driver.findElement(By.xpath("//table//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text2);
			}
			
		}
		
		
	}
}
