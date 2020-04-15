package projects.fox.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseproject.utility.BasePage;

public class draganddropPage extends BasePage {

	// Locators Webelement
	
	@FindBy(xpath = "//*[@id='credit2']/a")  WebElement drag_bank;
	@FindBy(xpath = "//*[@id='bank']/li") WebElement drop_under_Account;
	

	// Constructor
	public draganddropPage() {
		initPageFactory(this);
	}

	// Properties
	
	public void drag_drop() {
		
		DragandDropelement("Drag Bank and drop under Account", drag_bank,drop_under_Account);
	}
	
}
