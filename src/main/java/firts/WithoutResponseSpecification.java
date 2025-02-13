package firts;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class WithoutResponseSpecification {





    @Test
    public void createBooking()
    {
        ResponseSpecification responseSpecification=RestAssured.expect()
                                               .statusCode(200)
                .time(Matchers.lessThan(5000L));


        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking").contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"firstname\" : \"J22i1m\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")

                .post()
                .then()
                .log().all()
                .spec(responseSpecification);
    }
}
