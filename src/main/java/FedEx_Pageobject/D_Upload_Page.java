package FedEx_Pageobject;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class D_Upload_Page extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public D_Upload_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //click on use your file
    @FindBy(xpath = "//a[text()= 'Use Your File']")
    WebElement useYourFile;
    //click on continue
    @FindBy(xpath = "//a[text()= 'CONTINUE WITH EXISTING']")
    WebElement continueWithoutExisting;

    //click on use your file
    public void ClickOnUseYourFile(){
        Reusable_Actions_PageObject.clickOnElement(driver,useYourFile,logger,"click on use your file");

    }//end of click on use your file method

    /*Upload your file
    public void ImgUpload(String path) throws InterruptedException {
        Reusable_Actions_PageObject.uploadFile(path);
        Thread.sleep(5000);
    } */

    public static void ImgUpload(String fileLocation) {
        try {
            //Setting clipboard with file location
            StringSelection stringSelection = new StringSelection(fileLocation);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }//end of uploadFile method


    //continueWithoutExisting
    public void ContinueWithoutExisting(){
        Reusable_Actions_PageObject.clickOnElement(driver,continueWithoutExisting,logger,"continueWithoutExisting");
    }//end of continue method

}//end of public class
