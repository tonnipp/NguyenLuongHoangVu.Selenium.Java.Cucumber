package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends SauceDemoBasePage{
    public CartPage(WebDriver driver){super(driver);}

    //Locators
    private static final String btnCheckout = "//*[@id = 'checkout']";
    private static final String cartList = "cart_list";
    private static final String cartItem = "cart_item";

    //Elements
    public WebElement getCartList(){return driver.findElement(By.className(cartList));}
    public List<WebElement> itemList(){return getCartList().findElements(By.className(cartItem));}
    public WebElement getBtnCheckout(){return driver.findElement(By.xpath(btnCheckout));}

    //Actions
    public InformationPage startCheckout(){
        getBtnCheckout().click();
        return new InformationPage(driver);
    }

    public int getItemsCount(){return itemList().size();}

}
