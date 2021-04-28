package FedEx_Pageobject;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b_Product_Page extends Abstract_Class {

    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public b_Product_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class


    //click on CopyPrint
    @FindBy(xpath = "//*[@title='Get Started - Copies & Custom Projects']")
    WebElement clickOnCopiesAndPrintingMethod;
    //document printing
    @FindBy(xpath = "//*[text()='Document Printing']")
    WebElement DocumentPrinting;


    //document printing
    public void DocumentPrinting(){
        Reusable_Actions_PageObject.clickOnElement(driver,DocumentPrinting,logger,"document printing");
    } //end of document printing method


    //click on copies and custom project
    public void ClickOnCopiesAndPrintingMethod(){
        Reusable_Actions_PageObject.clickOnElement(driver,clickOnCopiesAndPrintingMethod,logger,"click on copy custom project");
    }//end of click on copy custom method


}//end of public class
