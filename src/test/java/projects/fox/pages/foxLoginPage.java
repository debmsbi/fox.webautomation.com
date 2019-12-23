package projects.fox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseproject.utility.BasePage;

public class foxLoginPage extends BasePage{
      
	  @FindBy(id = "txtCorpID") WebElement legacycompany;
      @FindBy(id = "txtLoginID") WebElement legacyUsername;
      @FindBy(name = "txtPassword") WebElement legacyPassword;
      @FindBy(name = "btnLogin") WebElement legacyLogin;
     
      
      
      public foxLoginPage() {
            initPageFactory( this);
      }
      
      /*
     * open url
     */
     public void openLoginPage(String url) {
                       openUrl(url);
     }
    
     /*
      * Enter Company
      * Enter Username
      * Enter Password
      * CLick on Login Button
      */
      
     public void LoginfoxApplication(String company,String username,String password){
         
	     enterLegacyCompany(company);
         enterLegacyUsername(username);
         enterLegacyPassword(password);
         clickOnLegacyLogin();
         
   }
     
     private void enterLegacyCompany(String optionText) {
         System.out.println("i am inside");
         enterText("Company", legacycompany, optionText);
   }
      
      private void enterLegacyUsername(String optionText) {
            System.out.println("i am inside");
            enterText("User Name", legacyUsername, optionText);
      }
      
      
      private void enterLegacyPassword(String optionText) {
    	  System.out.println("i am inside");
            enterText("Password", legacyPassword, optionText);
      }
      
      
      private void clickOnLegacyLogin() {
            clickOnElement("Submit", legacyLogin);
      }
      
      
      
     
      
}
