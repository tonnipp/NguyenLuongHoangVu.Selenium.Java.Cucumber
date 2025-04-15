package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage extends SauceDemoBasePage{
    public InformationPage(WebDriver driver){super(driver);}

    //Locators
    private static final String txtFirstName = "//*[@class = 'first-name]";
    private static final String txtLastName = "//*[@class = 'last-name']";
    private static final String txtPostCode = "//*[@class = 'post-cde']";
    private static final String btnContinue = "//*[@id = 'continue']";

    //Elements
    public WebElement getTxtFirstName(){return driver.findElement(By.xpath(txtFirstName));}
    public WebElement getTxtLastName(){return driver.findElement(By.xpath(txtLastName));}
    public WebElement getTxtPostCode(){return driver.findElement(By.xpath(txtPostCode));}
    public WebElement getBtnContinue(){return driver.findElement(By.xpath(btnContinue));}

    //Actions
    public InformationPage inputCheckoutInformantion(){
        keywords.setText(getTxtFirstName(),"First Name");
        keywords.setText(getTxtLastName(), "Last Name");
        keywords.setText(getTxtPostCode(), "700000");
        return new InformationPage(driver);
    }

    public InformationPage continueOrder(){
        getBtnContinue().click();
        return new InformationPage(driver);
    }
    public OverviewPage checkInputInformation(){
        inputCheckoutInformantion();
        continueOrder();
        return new OverviewPage(driver);
    }

    public boolean isDisplayFullElements(){
        if (getTxtFirstName().isDisplayed() && getTxtLastName().isDisplayed() && getTxtPostCode().isDisplayed() && getBtnContinue().isDisplayed()){
            return true;
        }
        else return false;
    }

}
