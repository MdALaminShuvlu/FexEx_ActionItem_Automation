package FedEx_Pageobject;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_CheckOut_Page extends Abstract_Class {

    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public F_CheckOut_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //mile
    @FindBy(xpath = "//*[@id= 'radiusSelect']")
    WebElement mile;
    //zip
    @FindBy(xpath = "//*[@id= 'loc_seacrh_text']")
    WebElement zip;
    //click on continue
    @FindBy(xpath = "//*[@id= 'saveNContBtn']")
    WebElement Continue;


    //mile
    public void mile(String UserValue){
        Reusable_Actions_PageObject.dropdownByText(driver,mile,UserValue,logger,"mile");

    }//end of mile method

    //zip
    public void Zip(String UserValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,zip,UserValue,logger,"Zip");
    }//end of zip method

    //click on continue
    public void Continue(){
        Reusable_Actions_PageObject.clickOnElement(driver,Continue,logger,"continue");
    }//end of continue method


}//end of public class
