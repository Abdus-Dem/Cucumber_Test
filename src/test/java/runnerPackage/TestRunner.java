package runnerPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features= {"features"},glue = {"stepDefinationPackage"})
public class TestRunner extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		System.out.println("Set up script runnig");
		
		System.out.println("my first cucumber test");
		
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
}
