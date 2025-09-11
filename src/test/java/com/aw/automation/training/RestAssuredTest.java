package com.aw.automation.training;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Sample Rest Assured test to demonstrate API testing functionality
 */
public class RestAssuredTest {

    @Test
    public void testReqResApiUsers() {
        // Set base URI
        RestAssured.baseURI = "https://reqres.in";
        
        // Make GET request to /api/users?page=2
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/api/users")
                .then()
                .extract().response();
        
        // Assert status code is 200
        Assert.assertEquals(response.getStatusCode(), 200, 
            "Status code should be 200");
        
        // Assert that page number is 2
        int pageNumber = response.jsonPath().getInt("page");
        Assert.assertEquals(pageNumber, 2, 
            "Page number should be 2");
        
        // Print response details
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Total Pages: " + response.jsonPath().getInt("total_pages"));
        System.out.println("Total Users: " + response.jsonPath().getInt("total"));
        System.out.println("Users per Page: " + response.jsonPath().getInt("per_page"));
    }
}
