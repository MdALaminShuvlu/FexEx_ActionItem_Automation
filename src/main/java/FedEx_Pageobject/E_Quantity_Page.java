package FedEx_Pageobject;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_Quantity_Page extends Abstract_Class {

    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public E_Quantity_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //quantity
    @FindBy(xpath = "//*[@class= 'quantity-field']")
    WebElement quantity;
    //AddToCart
    @FindBy(xpath = "//*[text()= 'Add to cart']")
    WebElement AddToCart;

    //checkOUt
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement CHeckOut;

    //proceedAsAGuest
    @FindBy(xpath = "//*[text()= 'Proceed as guest']")
    WebElement proceedAsAGuest;

    //quantity
    public void quantity(String UserValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,quantity,UserValue,logger,"quantity");
    }//end of quantity method

    //add to cart
    public void AddToCart(){
        Reusable_Actions_PageObject.clickOnElement(driver,AddToCart,logger,"AddToCart");
    }//end of add to cart method

    //Click on checkout
    public void CHeckOut(){
        Reusable_Actions_PageObject.clickOnElement(driver,CHeckOut,logger,"CHeckOut");
    }//end of CHeckOut method

    //Proceed as guest
    public void proceedAsAGuest(){
        Reusable_Actions_PageObject.clickOnElement(driver,proceedAsAGuest,logger,"proceedAsAGuest");
    }//end of proceedAsAGuest method


}//end of public class
