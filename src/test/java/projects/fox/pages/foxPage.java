package projects.fox.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseproject.utility.BasePage;

public class foxPage extends BasePage {

	// Locators Webelement
	@FindBy(xpath = "//*[@id='mainNavPTO']/a")
	WebElement click_Mypto_link;
	@FindBy(id = "nav-one")
	WebElement click_PTORequest_Tab;
	@FindBy(id = "btnPTORequest")
	WebElement click_AddPTORequest_button;
	@FindBy(id = "dtFromToDate")
	WebElement entertext_PTORequest_Dates;
	@FindBy(xpath = "//*[contains(text(),'Apply')]")
	WebElement click_Apply_button;
	@FindBy(xpath = "//*[@id='s2id_dropPTOType']/a/span[2]/b")
	WebElement click_dropdown_ptorequesttype;
	@FindBy(id = "s2id_autogen4_search")
	WebElement entertext_ptorequesttype;
	@FindBy(xpath = "//*[@id='select2-results-4']/li/div/span")
	WebElement click_dropdown_ptorequesttype_sick;
	@FindBy(xpath = "//input[@id='txtHours']")
	WebElement entertext_Totalhours;
	@FindBy(id = "btnSubmit")
	WebElement click_submit_button;
	@FindBy(xpath = "//*[@id='TableMyPTO']//tr[1]/td")
	List<WebElement> List_ptohistort_records;
	@FindBy(xpath = "//i[@class='fa fa-list-alt']")
	WebElement click_punches_button;
	@FindBy(partialLinkText = "Add/Edit Punches")
	WebElement click_Add_Edit_Punches_button;
	@FindBy(xpath = " //input[@id='PunchDate-1']")
	WebElement click_Add_Edit_Punches_textbox;
	@FindBy(xpath = "//table[@class=' table-condensed']/tbody/tr[5]/td[3]")
	WebElement click_Add_Edit_Punches_textbox_datepicker;
	
	@FindBy(xpath = "//*[@id='credit2']/a")
	WebElement drag_bank;
	
	@FindBy(xpath = "//*[@id='bank']/li")
	WebElement drop_bank;
	

	// Constructor
	public foxPage() {
		initPageFactory(this);
	}

	// Properties
	
	public void drag_drop() {
		
		DragandDropelement("Drag and drop", drag_bank,drop_bank);
	}
	

	public void click_Add_Edit_Punches_textbox_datepicker() {

		clickOnElement("click_Add_Edit_Punches_textbox_datepicker", click_Add_Edit_Punches_textbox_datepicker);

	}

	public void click_Add_Edit_Punches_textbox() {

		clickOnElement("click_Add_Edit_Punches_textbox", click_Add_Edit_Punches_textbox);

	}

	public void click_Add_Edit_Punches_button() {

		clickOnElement("click_Add_Edit_Punches_button", click_Add_Edit_Punches_button);

	}

	public void click_punches_button() {

		clickOnElement("click_punches_button", click_punches_button);

	}

	public void click_Mypto_link() {

		clickOnElement("click_Apply_button", click_Mypto_link);

	}

	public void click_PTORequest_Tab() {

		clickOnElement("click_Apply_button", click_PTORequest_Tab);
	}

	public void click_AddPTORequest_button() {

		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", click_AddPTORequest_button);
		 */
		clickOnElement("click_Apply_button", click_AddPTORequest_button);
	}

	public void entertext_Totalhours(String text) {

		enterText("entertext_Totalhours", entertext_Totalhours, text);
	}

	public void entertext_PTORequest_Dates(String text) {

		enterText("entertext_PTORequest_Dates", entertext_PTORequest_Dates, text);
	}

	public void click_Apply_button() {

		clickOnElement("click_Apply_button", click_Apply_button);

	}

	public void click_dropdown_ptorequesttype() {

		clickOnElement("click_dropdown_ptorequesttype", click_dropdown_ptorequesttype);
	}

	public void entertext_ptorequesttype(String text) {

		enterText("entertext_ptorequesttype", entertext_ptorequesttype, text);
	}

	public void click_dropdown_ptorequesttype_sick() {

		clickOnElement("click_dropdown_ptorequesttype_sick", click_dropdown_ptorequesttype_sick);
	}

	public void click_submit_button() {

		clickOnElement("click_submit_button", click_submit_button);
	}

	public List<String> List_ptohistort_records() {

		return getTextFromAllElements("List_ptohistort_records", List_ptohistort_records);
	}

	// Methods

	public void action()
         {
        	 click_punches_button();
        	 click_Add_Edit_Punches_button() ;
        	 click_Add_Edit_Punches_textbox() ;
        	 click_Add_Edit_Punches_textbox_datepicker() ;
            
            
             
         }

}
