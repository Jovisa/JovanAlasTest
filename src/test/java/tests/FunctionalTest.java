
// copied from https://github.com/kschiller/page-object-pattern-tutorial/blob/Initial/FunctionalTest.java
// code is refactored for jUnit5
package tests;



import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * <strong>FunctionalTest</strong> handles setup and teardown of WebDriver.
 * @author Kim Schiller
 */
public class FunctionalTest {

	protected static WebDriver driver;

	
	@BeforeAll
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterEach 
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterAll 
	public static void tearDown(){
		driver.close();
	}	
}
