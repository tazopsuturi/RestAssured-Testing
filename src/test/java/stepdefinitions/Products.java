package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import io.restassured.specification.RequestSpecification;

public class Products {
	public int statusCode;
	
	public RequestSpecification request;
	public Response response;
	public int ResponseCode;
	
	
	@Given("I hit the url of get products api endpoint")
	public void i_hit_the_url_of_get_products_api_endpoint() {
		RestAssured.baseURI = "https://fakestoreapi.com/";
	}
	
	@When("I pass the url in the request")
	public void i_pass_the_url_in_the_request() {
		request = RestAssured.given();
		response = request.get("products");
	}
	
	@Then("I receive the response code as {int}")
	public void i_receive_the_response_code_as(Integer int1) {
		ResponseCode = response.getStatusCode();
		Assert.assertEquals(ResponseCode, 200);
	}
}
