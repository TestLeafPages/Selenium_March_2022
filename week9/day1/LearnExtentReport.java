package week9.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// Common for all the test cases
		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Step3: attach the data with physical file
		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription
		ExtentTest test = extent.createTest("LoginAndLogout", "Login test for leaftaps application");
		test.assignCategory("smoke");
		test.assignAuthor("Hari");

		// Step5: Step level status
		test.pass("Enter username"); // if i use pass(), then test will be treated as passed
		test.pass("Enter password"); // if i use fail(), then test will be treated as failed
		test.pass("Click Login button",
				MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/desktop.png").build());

		// step6: Mandatory step
		extent.flush();
	}

}
