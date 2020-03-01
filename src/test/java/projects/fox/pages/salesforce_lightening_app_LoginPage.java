package projects.fox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseproject.utility.BasePage;

public class salesforce_lightening_app_LoginPage extends BasePage {

	@FindBy(id = "username")
	WebElement salesforce_entertext_username;

	@FindBy(id = "password")
	WebElement salesforce_entertext_password;

	@FindBy(id = "Login")
	WebElement salesforce_clickbutton_login;

	// Constructor
	public salesforce_lightening_app_LoginPage() {
		initPageFactory(this);
	}

	/*
	 * open url
	 */
	public void openLoginPage(String url) {
		openUrl(url);
	}

	/*
	 * Enter Username Enter Password CLick on Login Button
	 */

	public void SalesforceApplicationLogin(String username, String password) {

		enterUsername(username);
		enterPassword(password);
		clickOnLogin();

	}

	private void enterUsername(String optionText) {
		clickOnElement("User Name", salesforce_entertext_username);
		enterText("User Name", salesforce_entertext_username, optionText);
	}

	private void enterPassword(String optionText) {
		clickOnElement("Password", salesforce_entertext_password);
		enterText("Password", salesforce_entertext_password, optionText);
	}

	private void clickOnLogin() {
		clickOnElement("Submit", salesforce_clickbutton_login);
	}

}