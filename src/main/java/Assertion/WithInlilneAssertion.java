package Assertion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;

public class WithInlilneAssertion {

    public static void main(String[] args) {


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
                        .log().all()
                        .body("token", Matchers.notNullValue())
                        .body("token.length()",Matchers.is(15))
                        .body("token.length()",Matchers.equalTo(15))
                        .body("token", Matchers.matchesRegex("^[a-z0-9]+$"));

//
//        JsonPath jsonPath=new JsonPath(JsonResponse);
//
//        System.out.println( jsonPath.getString("token"));
//        System.out.println( jsonPath.getString("token"));
//
//        Assert.assertNotNull(jsonPath.getString("token"));
    }
}
