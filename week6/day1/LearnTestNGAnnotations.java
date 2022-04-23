package week6.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnTestNGAnnotations extends BaseClass {
	
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("beforemethod1");

	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}
	
	

}
