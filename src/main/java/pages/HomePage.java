package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;
 
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "submit_btn")
	WebElement loginButton;

	@FindBy(xpath = "//input[@id='user_name']")
	WebElement userId;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement logo;
	
	@FindBy(id = "goto_resetpass")
	WebElement resetPassword;
	

	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(4000);
	}

	public void clickUserId() {
		userId.click();
	}
	public void clickLogo() throws InterruptedException {
		logo.click(); 
		Thread.sleep(5000);
		
	}
	public void inputTextInUserIdField () {
		userId.sendKeys("August 2023 QA Bootcamp"); // value always inside  " ", even if you use int type
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	public void clickForgotUserId() {
	clickElement(resetPassword);
	}
	
	public boolean logoDisplayed() {
		return logo.isDisplayed();
	}
}
	


