package Assertion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class InlineAssertion {

    public static void main(String[] args) {

        String JsonResponse=
                RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}")
                .when()
                .post()
                .then()
                        .log().all().extract().asString();


        JsonPath jsonPath=new JsonPath(JsonResponse);

        System.out.println( jsonPath.getString("token"));
        System.out.println( jsonPath.getString("token"));

        Assert.assertNotNull(jsonPath.getString("token"));
    }
}
