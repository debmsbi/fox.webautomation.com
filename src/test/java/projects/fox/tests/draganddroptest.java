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



public class draganddroptest extends BaseTest {
      	
	String URL,Company,User,Pass;
	foxLoginPage foxloginPage;
	foxPage foxPage;
    
      
      @BeforeClass
      public void test() throws InterruptedException {
            
    	  //WIth config file
    	  
    	
         
        foxloginPage= new foxLoginPage();
        foxloginPage.openLoginPage(getURL("URL2"));
        
    	  	  
            
      }
  
      @Test(enabled=true,priority=0,dataProvider="ExcelTestData",description = "EPAY_1")
      public void test13(Hashtable<String, String> mainTabs) throws InterruptedException {
            
    	  foxPage=new foxPage();
    	  foxPage.drag_drop();
    	  
    	  
    	  
           
            
      }
      
      @DataProvider(name="ExcelTestData")
      public Object[][] hashdata(Method m) {


            return new Object[][]{  
                  {readTestDataByMethodName(m.getName())}
            };

      } 
      

}

            
      
 
