package projects.fox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseproject.utility.BasePage;

public class foxLoginPage extends BasePage {

	@FindBy(id = "txtCorpID")
	WebElement company;
	@FindBy(id = "txtLoginID")
	WebElement Username;
	@FindBy(name = "txtPassword")
	WebElement Password;
	@FindBy(name = "btnLogin")
	WebElement Login;

	// Constructor
	public foxLoginPage() {
		initPageFactory(this);
	}

	/*
	 * open url
	 */
	public void openLoginPage(String url) {
		openUrl(url);
	}

	/*
	 * Enter Company Enter Username Enter Password CLick on Login Button
	 */

	public void LoginfoxApplication(String company, String username, String password) {

		enterCompany(company);
		enterUsername(username);
		enterPassword(password);
		clickOnLogin();

	}

	private void enterCompany(String optionText) {
		clickOnElement("Company", company);
		enterText("Company", company, optionText);
	}

	private void enterUsername(String optionText) {
		clickOnElement("User Name", Username);
		enterText("User Name", Username, optionText);
	}

	private void enterPassword(String optionText) {
		clickOnElement("Password", Password);
		enterText("Password", Password, optionText);
	}

	private void clickOnLogin() {
		clickOnElement("Submit", Login);
	}

}
