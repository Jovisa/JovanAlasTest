
package pages;

// copied from https://github.com/kschiller/page-object-pattern-tutorial/blob/Initial/PageObject.java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// Page Object parrent class
public class PageObject {
	protected WebDriver driver;
	
	public PageObject(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
