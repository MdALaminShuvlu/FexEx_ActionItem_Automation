package FedEx_Pageobject;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class a_Home_Page extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public a_Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //click on Design & Print
    @FindBy(xpath = "//a[contains(@aria-label,'Open Design')]")
    WebElement Tracking;
    //click on Upload a Print-Ready File
    @FindBy(xpath = "//*[@aria-label= 'Upload a Print-Ready File']")
    WebElement Print_Ready_File;

    //Design & Print method
    public void Design_And_Print() {
        Reusable_Actions_PageObject.clickOnElement(driver, Tracking, logger, "click on tracking");
    }//end of Design & Print method

    //Print-Ready
    public void Print_Ready() {
        Reusable_Actions_PageObject.clickOnElement(driver, Print_Ready_File, logger, "click on Print-Ready");
    } //end of click on Print-Ready


}//end of public class
