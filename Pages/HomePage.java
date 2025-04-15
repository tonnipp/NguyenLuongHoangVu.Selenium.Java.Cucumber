package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends SauceDemoBasePage{
    public HomePage(WebDriver driver){super(driver);}
    //Loactors
    private static final String lstInventory = "//*[@class = 'inventory_list']";
    private static final String lstItem = "//*[@class = 'inventory_item']";
    private static final String lblInventoryName = "//*[@clas = 'inventory_item_name']";

    //Elements
    public WebElement getListInventory(){return driver.findElement(By.xpath(lstInventory));}
    public List<WebElement> productList(){return driver.findElements(By.xpath(lstItem));}

    //ACtions
    public ProductDetailPage clickFirstProduct(){
        keywords.click(productList().get(0).findElement(By.xpath(lblInventoryName)));
        return new ProductDetailPage(driver);
    }

}
