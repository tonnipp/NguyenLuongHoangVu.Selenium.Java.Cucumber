package Pages;
import keywords.ActionKeywords;
import org.openqa.selenium.WebDriver;

public class SauceDemoBasePage {
    public WebDriver driver;
    public ActionKeywords keywords;

    public SauceDemoBasePage(WebDriver driver){
        this.driver = driver;
        this.keywords = new ActionKeywords(driver);
    }
}
