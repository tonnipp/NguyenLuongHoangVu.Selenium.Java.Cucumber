package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends SauceDemoBasePage{
    public ProductDetailPage(WebDriver driver){super(driver);}

    //Locators
    private static final String btnAddToCart = "//*[contains(@class,'btn_inventory')]";

    //Elements
    public WebElement getBtnAddToCart(){return driver.findElement(By.xpath(btnAddToCart));}

    //Action
    public ProductDetailPage addProductToCart(){
        getBtnAddToCart().click();
        return new ProductDetailPage(driver);
    }

}
