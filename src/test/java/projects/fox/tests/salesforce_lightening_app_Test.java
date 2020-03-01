package projects.fox.tests;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseproject.base.BaseTest;

import projects.fox.pages.salesforce_lightening_app_LoginPage;
import projects.fox.pages.salesforce_lightening_app_Page;

public class salesforce_lightening_app_Test extends BaseTest {

	String User, Pass, URL1;
	salesforce_lightening_app_LoginPage salesforce_lightening_app_loginpage;
	salesforce_lightening_app_Page salesforce_lightening_app_page;

	@BeforeClass
	public void setup() throws Exception {

		// WIth config file
		User = getPropertyValue("user1");
		Pass = getPropertyValue("pass1");

		salesforce_lightening_app_loginpage = new salesforce_lightening_app_LoginPage();
		salesforce_lightening_app_loginpage.openLoginPage(getURL("URL1"));
		salesforce_lightening_app_loginpage.SalesforceApplicationLogin(User, Pass);

	}

	@Test(enabled = true, priority = 0, dataProvider = "ExcelTestData", description = "salesforce_lightening_app_Test")
	public void salesforce_lightening_app_Test1(Hashtable<String, String> mainTabs) throws Exception {

		salesforce_lightening_app_page = new salesforce_lightening_app_Page();
		assertEquals(salesforce_lightening_app_page.gettext_calender_date(), mainTabs.get("TestData1"),
				"February 2020");

		salesforce_lightening_app_page.click_3more_calender();
		List<String> ge = salesforce_lightening_app_page.getext_event_feb122020_outlookcalender();
		System.out.println(ge);
		assertEquals(ge.get(0), "Conference", "Conference");
		assertEquals(ge.get(1), "10:30a", "10:30a");
		assertEquals(ge.get(2), "Meeting", "Meeting");
		assertEquals(ge.get(3), "12p", "12p");
		assertEquals(ge.get(4), "Lunch", "Lunch");
		assertEquals(ge.get(5), "2:30p", "2:30p");
		assertEquals(ge.get(6), "Meeting", "Meeting");
		assertEquals(ge.get(7), "5:30p", "5:30p");
		assertEquals(ge.get(8), "Happy Hour", "Happy Hour");
		assertEquals(ge.get(9), "8p", "8p");
		assertEquals(ge.get(10), "Dinner", "Dinner");

		salesforce_lightening_app_page.click_Accounts();

		List<String> gr = salesforce_lightening_app_page.getext_recentlyviewed_Accountstab();
		System.out.println(gr);
		assertEquals(gr.get(0), "GenePoint", "GenePoint");
		assertEquals(gr.get(1), "Silicon", "Silicon");

	}

	@DataProvider(name = "ExcelTestData")
	public Object[][] hashdata(Method m) {

		return new Object[][] { { readTestDataByMethodName(m.getName()) } };

	}

}
