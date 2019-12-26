package projects.fox.tests;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseproject.base.BaseTest;

import projects.fox.pages.foxPage;
import projects.fox.pages.foxLoginPage;



public class foxtest extends BaseTest {
      	
	String URL,Company,User,Pass;
	foxLoginPage foxloginPage;
	foxPage foxPage;
    
      
      @BeforeClass
      public void test() throws InterruptedException {
            
    	  //WIth config file
    	  
    	Company= getPropertyValue("company");
        User = getPropertyValue("user");
        Pass = getPropertyValue("pass");
         
        foxloginPage= new foxLoginPage();
        foxloginPage.openLoginPage(getURL("URL"));
        foxloginPage.LoginfoxApplication(Company,User, Pass);
    	  	  
            
      }
  
      @Test(enabled=true,priority=0,dataProvider="ExcelTestData",description = "Demaut_1")
      public void test1(Hashtable<String, String> mainTabs) throws InterruptedException {
            
    	  foxPage=new foxPage();
    	  foxPage.click_Mypto_link();
    	  foxPage.click_PTORequest_Tab();
    	  foxPage.click_AddPTORequest_button ();
    	  foxPage.entertext_PTORequest_Dates(mainTabs.get("TestData1"));
    	  foxPage.click_Apply_button();
    	  foxPage.click_dropdown_ptorequesttype();
    	  foxPage.entertext_ptorequesttype(mainTabs.get("TestData2"));
    	  foxPage.click_dropdown_ptorequesttype_sick();
    	  foxPage.click_submit_button();
    	  
           
            
      }
      
      @DataProvider(name="ExcelTestData")
      public Object[][] hashdata(Method m) {


            return new Object[][]{  
                  {readTestDataByMethodName(m.getName())}
            };

      } 
      

}

            
      
 
