package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = true, priority = 2)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickSignInButton();

	}

}