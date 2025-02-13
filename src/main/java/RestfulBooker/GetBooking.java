package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class GetBooking {

    public static void main(String[] args) {
        RestAssured.given().log().all().contentType(ContentType.JSON)
                .baseUri("https://restful-booker.herokuapp.com/").basePath("booking/{ID}").pathParam("ID",5)
                .when().get().then().log().all().statusCode(200);//.body("bookingid", Matchers.notNullValue());


//        RequestSpecification requestSpecification=RestAssured.given().log().all();
//        requestSpecification.baseUri("https://restful-booker.herokuapp.com/").basePath("booking/{ID}");
//        requestSpecification.pathParam("ID",4);
//
//        Response response=requestSpecification.get();
//
//        response.then().log().all().statusCode(200);





    }
}
