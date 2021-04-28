import FedEx_Pageobject.a_BaseClass;
import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class FedEx_ResultClass extends Abstract_Class {

@Test
    public void FedEX() throws InterruptedException {

    driver.navigate().to("https://www.fedex.com/en-us/home.html");

    //a
    a_BaseClass.homePage().Design_And_Print();
    a_BaseClass.homePage().Print_Ready();
    //b
    Thread.sleep(2000);
    a_BaseClass.product_page().DocumentPrinting();
    Thread.sleep(2000);
    a_BaseClass.product_page().ClickOnCopiesAndPrintingMethod();

    //d
    Thread.sleep(3000);
    a_BaseClass.upload_page().ClickOnUseYourFile();
    Thread.sleep(3000);
    a_BaseClass.upload_page().ImgUpload("C:\\Users\\hossa\\OneDrive\\Pictures\\Screenshots\\Logo");
    Thread.sleep(3000);
    a_BaseClass.upload_page().ContinueWithoutExisting();
    //e
    a_BaseClass.quantity_page().quantity("2");
    a_BaseClass.quantity_page().AddToCart();
    Thread.sleep(3000);
    a_BaseClass.quantity_page().CHeckOut();
    a_BaseClass.quantity_page().proceedAsAGuest();
    //f
    Thread.sleep(2000);
    a_BaseClass.checkOut_page().mile("5 Miles");
    a_BaseClass.checkOut_page().Zip("11208");
    a_BaseClass.checkOut_page().Continue();



    //capture text
    String captureText = Reusable_Actions_PageObject.captureText(driver, "(//*[@id='centersListRows'])", 0, logger,"capture text");
    logger.log(LogStatus.INFO,"my captured text is" + captureText);

    }//end of test

}//end of public class
