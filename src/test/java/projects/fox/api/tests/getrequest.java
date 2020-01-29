package projects.fox.api.tests;


import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getrequest {

	ValidatableResponse respone;

	@Test(enabled = true, priority = 0, description = "getrequest")
	public void test1() {

		respone = given().
				when().
				get("http://dedmsapi.centralus.cloudapp.azure.com:8084/country-codes?CountryCode=95,99&Year=2012,2011,2013,2014,2015,2016,2017,2018,2019").
				then();
		


		// Assert response code
		respone.statusCode(200);
		
		//respone.body(arguments, responseAwareMatcher)
	}

}
