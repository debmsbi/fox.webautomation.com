/*
		 * Rest Assured coding standard for get put post delete request
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

package projects.fox.api.tests;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import java.net.URISyntaxException;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class getrequest {

	@Test(enabled = true, priority = 0, description = "getrequest")
	public void test1() throws URISyntaxException {

		RestAssured.baseURI = "http://dedmsapi.centralus.cloudapp.azure.com:8084";

		//Given block
		Response res=given().
		param("CountryCode", "95,99").
		param("Year", "2012,2011,2013,2014,2015,2016,2017,2018,2019").
		
		//When block
		when()
				.get("/country-codes").
				
		//Then block
				then().assertThat().
				statusCode(200).
				and().contentType(ContentType.JSON).
				and().
				body("resultSet1[0].CountryName",equalTo("India")).
				
		//Extract block		
				extract().response();
		
		//Converting the raw data of response to string and then print the response
		String responsestring=res.asString();
		System.out.println(responsestring);
		
		
				
		
		

	}

}
