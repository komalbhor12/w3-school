package pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.WebDriver;
	
	import testBase.WebTestBase;

	public class LoginPage extends WebTestBase {
		   @FindBy(id ="w3loginbtn")
		     WebElement login;
		
		
			@FindBy(xpath ="//*[@name='email']")
			WebElement mobiles;
			
			
			@FindBy(xpath ="//*[@name='current-password']")
			WebElement passwords;
			 
			@FindBy(xpath = "//div/button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
			WebElement signIn;
			
			public LoginPage() {
		        PageFactory.initElements(driver, this);
		    }
			
			public void loginIns() {
				 login.click();
				// TODO Auto-generated method
			}
			
			public void login(String mobile, String password){
		        mobiles.sendKeys(mobile);
		        passwords.sendKeys(password);	
		        
		 
		       
			}

			public void signIns() {
				 signIn.click();
				// TODO Auto-generated method

	}
	}


