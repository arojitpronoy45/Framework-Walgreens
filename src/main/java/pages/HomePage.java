package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "submit_btn")
	WebElement signIn;

	@FindBy(name = "user-d")
	WebElement userIdElement;

	public void clickSignInButton() throws InterruptedException {
		signIn.click();
		Thread.sleep(5000);
	}

	public void clickUserId() {
		
	}
}
