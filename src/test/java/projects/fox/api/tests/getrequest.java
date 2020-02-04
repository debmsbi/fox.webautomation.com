package projects.fox.api.tests;

import static io.restassured.RestAssured.given;

import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getrequest {

	@Test(enabled = true, priority = 0, description = "getrequest")
	public void test1() throws URISyntaxException {

		/*
		 * Rest Assured coding stanbdard for get put post delete request
		 * 
		 * given() //block 1 Request headers Parameters request cookies
		 * 
		 * when() //block 2 get(resource) post(resource) put(resources)
		 * 
		 * 
		 * then() //block3 assertion to make sure we are getting correct response
		 * 
		 * 
		 * extract() //block 4 to extract response body
		 */

		RestAssured.baseURI = "http://dedmsapi.centralus.cloudapp.azure.com:8084";

		given().param("CountryCode", "95,99").param("Year", "2012,2011,2013,2014,2015,2016,2017,2018,2019").when()
				.get("/country-codes").then().assertThat().statusCode(200);

	}

}
