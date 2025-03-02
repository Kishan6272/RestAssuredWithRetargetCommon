package Assertion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;

public class InLineAssertionForArrays {

    public static void main(String[] args) {
        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get()
                .then()
                .log().all()
                .body("bookingid",Matchers.hasItems(10,1,2));


    }
}
