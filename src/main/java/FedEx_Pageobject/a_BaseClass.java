package FedEx_Pageobject;

import ReusableLibrary.Abstract_Class;

public class a_BaseClass extends Abstract_Class {

    //this page class is a static reference for the page object classes
    //so I can use it on my test class


    public static a_Home_Page homePage(){
        a_Home_Page a_HomePage = new a_Home_Page(driver);
        return  a_HomePage;
    }//end of static homePage

    public static b_Product_Page product_page(){
        b_Product_Page b_product_page =new b_Product_Page(driver);
        return  b_product_page;
    }//end of static productPage

    public static D_Upload_Page upload_page(){
        D_Upload_Page d_upload_page=new D_Upload_Page(driver);
        return d_upload_page;
    }//end of static Upload_Page

    public static E_Quantity_Page quantity_page(){
        E_Quantity_Page e_quantity_page=new E_Quantity_Page(driver);
        return e_quantity_page;
    } // end of static quantity page

    public static F_CheckOut_Page checkOut_page(){
        F_CheckOut_Page f_checkOut_page=new F_CheckOut_Page(driver);
        return f_checkOut_page;
    }//end of static checkout page

}//end of public class
