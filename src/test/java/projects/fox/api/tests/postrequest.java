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

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import java.net.URISyntaxException;


public class postrequest {

	@Test(enabled = true, priority = 0, description = "postrequest")
	public void test1() throws URISyntaxException {

		 
		{

			RestAssured.baseURI="http://216.10.245.166";

			//Given Block
			Response res=given().
			queryParam("key","qaclick123").
			body("{"+
			  "\"location\": {"+
			    "\"lat\": -33.8669710,"+
			    "\"lng\": 151.1958750"+
			  "},"+
			  "\"accuracy\": 50,"+
			  "\"name\": \"Google Shoes!\","+
			  "\"phone_number\": \"(02) 9374 4000\","+
			  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
			  "\"types\": [\"shoe_store\"],"+
			  "\"website\": \"http://www.google.com.au/\","+
			  "\"language\": \"en-AU\""+
			"}").

			// WHen Block
			when().
			post("/maps/api/place/add/json").

			//Then Block
			then().assertThat().
			statusCode(200).
			and().
			contentType(ContentType.JSON).
			and().
			body("status",equalTo("OK")).
			
			//Extract Block
			extract().response();
			
			
			// Task 2 : Grab the place ID from response
			//Converting the raw data of response to string and then print the response
			String responsestring=res.asString();
			System.out.println(responsestring);
			
			//Converting the string into JSON
			JsonPath js=new JsonPath(responsestring);
			String placeid=js.get("place_id");
			System.out.println(placeid);
			
			




			}

			}
	}
