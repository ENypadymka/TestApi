import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200) // Status check 200
                .body("title", notNullValue()); // Title check
    }

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String jsonBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

        given()
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201); // Status check 201
    }
}
