package pagesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = false) // Click method
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();

	}
	@Test (enabled = false) // Click method
	public void clickUserId() throws InterruptedException {
		homePage.clickUserId();
	}
	@Test(enabled = false) // Click method
	public void clickLogo() throws InterruptedException {
		homePage.clickLogo();
		
}
	@Test(enabled = false) //send keys method
	public void inputTextInUserIdFieldTest() {
		homePage.inputTextInUserIdField();
	}
	@Test(enabled = false) //click method
	public void clickForgotUserIdTest() {
		homePage.clickForgotUserId();
	}

//--------------------------------------------------------------------------------------------------------

	@Test(enabled = false) // link text 
	public void use_of_linkText_as_locator_in_FAQs_hyperlink() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("FAQs")).click();
		Thread.sleep(4000);
	}
	
	@Test(enabled = false) // partial text
	public void use_of_partialLinkText_as_locator_in_Notice_of_Practices_hyperlink() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Notice of Privacy")).click();
		Thread.sleep(4000);
	}
	@Test (enabled = false)
	public void use_of_xpath_as_locator_Chat_Now_button() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='nuan-btn-fixed-c2c']")).click();
		Thread.sleep(4000);
}
	// -------------------------------------------------------------------------------------------------
	
	@Test(enabled = false)
	public void use_cssSelector_as_locator_in_logo () {
		driver.findElement(By.className("img-responsive")).click();
	}
	@Test(enabled = false)
	public void cssSelector_as_locator_in_sign_In_button () {
		driver.findElement(By.cssSelector("button#submit_btn")).click();
	}
	@Test(enabled = false)
	public void use_of_isDisplayed_in_FAQS_() {
		boolean elementDisplayed = driver.findElement(By.cssSelector("a.mb20")).isDisplayed();
		System.out.println("Is the FAQS displayed? Ans: " + elementDisplayed);
	}
	@Test(enabled = false)
	public void use_of_isEnabled_in_sign_button() {
		boolean loginButtonEnabled = driver.findElement(By.id("submit_btn")).isEnabled();
		System.out.println("Is the sign in Button Enabled? Ans: " + loginButtonEnabled);
	}
	@Test (enabled = true)
	public void use_of_isSelected_in_check_box () throws InterruptedException {
		boolean checkBoxSelected = driver.findElement(By.xpath("//input[@id='ShowCharacter']")).isSelected();
		System.out.println("Is the CheckBox selected? Ans: " + checkBoxSelected);
		driver.findElement(By.xpath("//input[@id='ShowCharacter']")).click();
		Thread.sleep(5000);
	}
}