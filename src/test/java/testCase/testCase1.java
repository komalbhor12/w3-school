package testCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;

import pages.LoginPage;
import pages.myAccountPage;
import testBase.WebTestBase;

public class testCase1 extends WebTestBase {
	LoginPage loginPage;
	myAccountPage myaccountpage;
	public testCase1(){
        super();
    }
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and establishing the connection ,loading the url
	     initialization();
	    
    	 loginPage = new LoginPage(); 
         myaccountpage  = new myAccountPage();
		// TODO Auto-generated method stub
		
	}
	@Test (priority = 1)
 	public void logintest()
 	{
 		SoftAssert softAssert = new SoftAssert();
 		loginPage.loginIns();
 		loginPage.login(prop.getProperty("mobile"),prop.getProperty("password"));
 	    loginPage.signIns();
 		softAssert.assertAll();
 		
 }
     @Test(priority = 2)
     public void scrollUp() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy(0,4000)");
 		js.executeScript("window.scrollBy(0,-800)");
     }
     
     @Test(priority = 3)
     public void scrollDown() {
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy(0,5000)");
 	}
   
 		
   @Test(priority = 4)  
public void myAccount() {
	myaccountpage.menubar();
	myaccountpage.webhtmls();
   }
   
   @Test(priority = 5)
	public static void getCookies(){
      Set<Cookie> cookies = driver.manage().getCookies();
      for (Cookie c : cookies){
          System.out.println(c);
      }
  }
   
   
   @AfterMethod
	 public void afterMethod(){
	     driver.close();
	 }
   
   
}







