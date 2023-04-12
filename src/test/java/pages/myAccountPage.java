package pages;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;


public class myAccountPage extends WebTestBase {
	@FindBy(id = "navbtn_references")
	WebElement menu;
	
	@FindBy(xpath ="//*[@class='w3-button tut-button']")
	WebElement webhtml;
	 
	//@FindBy(xpath = "//div/button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	//WebElement signIn;
	
	public myAccountPage() {
		PageFactory.initElements(driver, this);
    }
	
		public void menubar() {
		 menu.click();
		// TODO Auto-generated method stub
		
	}

	public void webhtmls()
	{
	 webhtml.click();
		// TODO Auto-generated method stub
		
	}

}



