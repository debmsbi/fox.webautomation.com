package projects.fox.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseproject.utility.BasePage;

public class foxPage extends BasePage {
      
      //Locators Webelement
      
      /*@FindBy(partialLinkText = "Manage Offices") WebElement click_Manage_Office_link;
      @FindBy(xpath = "/html/body/div/form/table[2]/tbody/tr/td/div/strong") List<WebElement> list_Manage_Office_section_list;*/

             @FindBy(xpath = "//*[@id='mainNavPTO']/a") WebElement click_Mypto_link;
      
	 
	 //Constructor
            public foxPage() {
                  initPageFactory( this);
            }
      
      
            //Properties 
            
            public void click_Mypto_link() {
                
            	 JavascriptExecutor executor = (JavascriptExecutor)driver;
                 executor.executeScript("arguments[0].click();", click_Mypto_link);
          }
            
/*            public void click_cancel()
            {
                  JavascriptExecutor executor = (JavascriptExecutor)driver;
                  executor.executeScript("arguments[0].click();", click_cancel);
            }
            
            public String gettext_click_cancel()
              {
                    return click_cancel.getAttribute("value");
              }
            public String gettext__ManageOffice_page()
              {
                  return getText("gettext__ManageOffice_page",  gettext__ManageOffice_page);
              }

            public List<String> list_columnname_withoutdata_Users() {
                  
                  return getTextFromAllElements("list_columnname_withoutdata_Users", list_columnname_withoutdata_Users);
            }
            
        public void entertext_addnewoffice(String OptionText){
                  enterText("entertext_addprogramname", entertext_addnewoffice,OptionText );
            }
        
        public void dropdown_type(String OptionText) {
                  
            selectDropDownByValue("list_dropdown_type", dropdown_type,OptionText );
            }*/
        
    
            
        
            //Methods
      
      
}
