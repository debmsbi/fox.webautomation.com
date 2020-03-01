package projects.fox.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseproject.utility.BasePage;

public class salesforce_lightening_app_Page extends BasePage {

	// Page Factory - Object Repository

	@FindBy(xpath = "//div[@class='fc-toolbar fc-header-toolbar']/div[2]/h2")
	WebElement gettext_calender_date;

	@FindBy(xpath = "//div[@class='fc-event-container']/a//span")
	List<WebElement> getext_event_feb122020_outlookcalender;

	@FindBy(xpath = "//table[contains(@class, 'slds-table')]/tbody//th//a")
	List<WebElement> getext_recentlyviewed_Accountstab;

	@FindBy(xpath = "//a[@class='fc-more']")
	WebElement click_3more_calender;

	@FindBy(xpath = "//one-app-nav-bar-item-root[3]/a/span")
	WebElement click_Accounts;

	// Constructor
	public salesforce_lightening_app_Page() {
		initPageFactory(this);
	}

	// Actions or Methods

	public void click_Accounts() {
		waitForElementToBePresent(" click_Accounts", click_Accounts);
		// clickOnElement(" click_Accounts", click_Accounts);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0]. click();", click_Accounts);
	}

	public void click_3more_calender() {
		clickOnElement(" click_3more_calender", click_3more_calender);
	}

	public String gettext_calender_date() {

		waitForElementToBePresent("gettext_calender_date", gettext_calender_date);
		return getText("gettext_calender_date", gettext_calender_date);
	}

	public List<String> getext_event_feb122020_outlookcalender() {

		// waitForElementToBePresent("getext_event_feb122020_outlookcalender",getext_event_feb122020_outlookcalender);
		return getTextFromAllElements("getext_event_feb122020_outlookcalender", getext_event_feb122020_outlookcalender);
	}

	public List<String> getext_recentlyviewed_Accountstab() {

		return getTextFromAllElements("getext_recentlyviewed_Accountstab", getext_recentlyviewed_Accountstab);
	}

}
