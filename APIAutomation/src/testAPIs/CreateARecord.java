package testAPIs;

import org.json.simple.JSONObject;
import org.openqa.selenium.remote.server.handler.html5.GetAppCacheStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateARecord {
	@Test
	public void test1() {

		SoftAssert asser = new SoftAssert();

		// Step 1 Create new Record
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";

		// Request Body
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "mohan1 terrekhan");
		requestParams.put("salary", "3244353");
		requestParams.put("age", "2456");

		// header
		request.header("Content-Type", "application/json");

		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());
		// Click send
		Response response = request.request(Method.POST);

		System.out.println(response.getStatusCode());

		System.out.println(response.asString());

		System.out.println("************************************************************************");

		JsonPath jsonPathEvaluator = response.jsonPath();
		String id = jsonPathEvaluator.get("id");
		System.out.println(id);

		// Step 3: Update the record
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/" + id;
		request = RestAssured.given();
		requestParams = new JSONObject();
		requestParams.put("name", "salman khan11");
		requestParams.put("salary", "325433");
		requestParams.put("age", "25");
		request.header("Content-Type", "application/json");
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());
		// Post the request and check the response
		response = request.request(Method.PUT);
		System.out.println(response.asString());

		System.out.println("************************************************************************");

		// Step 4: Verify
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/" + id;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.request(Method.GET);
		System.out.println(response.asString());

		System.out.println("************************************************************************");

	}

}
