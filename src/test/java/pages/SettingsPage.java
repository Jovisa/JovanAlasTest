
package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SettingsPage extends PageObject{
    
    @FindBy(tagName = "button")
    private WebElement start_button;
    
    public SettingsPage(WebDriver driver) {
        super(driver);
    }
    
    public void start() {
        start_button.click();
    }
    
}
