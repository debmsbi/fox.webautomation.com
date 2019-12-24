package projects.fox.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseproject.utility.BasePage;

public class foxPage extends BasePage {
      
      //Locators Webelement
      @FindBy(xpath = "//*[@id='mainNavPTO']/a") WebElement click_Mypto_link;
      @FindBy(id = "nav-one") WebElement click_PTORequest_Tab;
      @FindBy(id="btnPTORequest") WebElement click_AddPTORequest_button;
      @FindBy(id="dtFromToDate") WebElement entertext_PTORequest_Dates;
      @FindBy(xpath = "//div[2]/div[3]/div/button[1]") WebElement click_Apply_button;
      @FindBy(xpath = "//ul[@id='select2-results-22']//span")  WebElement list_ptorequesttype_dropdownvalues;
    
      
	 
	 //Constructor
            public foxPage() {
                  initPageFactory( this);
            }
      
      
            //Properties 
            
            public void click_Mypto_link() {
                
            	 JavascriptExecutor executor = (JavascriptExecutor)driver;
                 executor.executeScript("arguments[0].click();", click_Mypto_link);
          }
            
            public void click_PTORequest_Tab() {
                
            	 JavascriptExecutor executor = (JavascriptExecutor)driver;
                 executor.executeScript("arguments[0].click();", click_PTORequest_Tab);
          }
            
            public void click_AddPTORequest_button () {
                
           	 JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", click_AddPTORequest_button);
         }
            
            public void entertext_PTORequest_Dates(String text) {
                
            	enterText("entertext_PTORequest_Dates", entertext_PTORequest_Dates, text);
         }
            
            public void  click_Apply_button() {
                
           	 JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", click_Apply_button);
         }
            
            
            public List<String> list_ptorequesttype_dropdownvalues() {
                
                 return getAllOptionsFromDropDown("list_ptorequesttype_dropdownvalues", list_ptorequesttype_dropdownvalues);
          }
            

        
    
            
        
            //Methods
      
      
}
