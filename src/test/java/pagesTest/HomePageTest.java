package pagesTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.tethering.Tethering;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = false) // Click method
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();

	}

	@Test(enabled = false) // Click method
	public void clickUserId() throws InterruptedException {
		homePage.clickUserId();
	}

	@Test(enabled = false) // Click method
	public void clickLogo() throws InterruptedException {
		homePage.clickLogo();

	}

	@Test(enabled = false) // send keys method
	public void inputTextInUserIdFieldTest() {
		homePage.inputTextInUserIdField();
	}

	@Test(enabled = false) // click method
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

	@Test(enabled = false)
	public void use_of_xpath_as_locator_Chat_Now_button() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='nuan-btn-fixed-c2c']")).click();
		Thread.sleep(4000);
	}
	// -------------------------------------------------------------------------------------------------

	@Test(enabled = false)
	public void use_cssSelector_as_locator_in_logo() {
		driver.findElement(By.className("img-responsive")).click();
	}

	@Test(enabled = false)
	public void cssSelector_as_locator_in_sign_In_button() {
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

	@Test(enabled = false)
	public void use_of_isSelected_in_check_box() throws InterruptedException {
		boolean checkBoxSelected = driver.findElement(By.xpath("//input[@id='ShowCharacter']")).isSelected();
		System.out.println("Is the CheckBox selected? Ans: " + checkBoxSelected);
		driver.findElement(By.xpath("//input[@id='ShowCharacter']")).click();
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void getCurrentMethod() {
		WebElement value1 = driver.findElement(By.xpath("//button[text()='Create a new account']"));
		System.out.println("The value of the id is: " + value1);
	}

	@Test(enabled = false)
	public void use_of_getCurrentURL_method() throws InterruptedException {
		driver.findElement(By.id("create_btn")).click();
		Thread.sleep(4000);
		System.out.println("The current URL is: " + driver.getCurrentUrl());
		System.out.println("The Title of the page is: " + driver.getTitle());
	}

	@Test(enabled = false)
	public void clearMethod() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user_name']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("AROJITPRONOY");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_name']")).clear();
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void gettext() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='user_name']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("AROJITPRONOY");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_name']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("AROJITPRONOY");
		Thread.sleep(4000);
		WebElement loginButton = driver.findElement(By.id("submit_btn"));
		System.out.println("The text for the WebElement is: " + loginButton.getText());
		driver.findElement(By.id("submit_btn")).click();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_sendKeys_method() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user_name']")).click();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("AROJITPRONOY");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("enthrall_12", Keys.ENTER);
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_returnKey() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='user_name']")).click();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("AROJITPRONOY");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("enthrall_12", Keys.RETURN);
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.walgreens.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void logoDisplayedTest02() {
		homePage.logoDisplayed();
		Assert.assertTrue(true, "Application Logo is Displayed, but expected result is not to dispaly ..... ..... ");

	}

}
