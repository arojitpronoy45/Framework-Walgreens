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
	@Test (enabled = true)
	public void use_of_xpath_as_locator_Chat_Now_button() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='nuan-btn-fixed-c2c']")).click();
		Thread.sleep(4000);
}
}