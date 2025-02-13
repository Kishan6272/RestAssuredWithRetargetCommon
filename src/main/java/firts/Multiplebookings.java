package firts;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiplebookings {


    RequestSpecification requestSpecification;


    @BeforeClass
    public void setUpReqSpec()
    {
        requestSpecification=RestAssured.given();
        requestSpecification.log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .contentType(ContentType.JSON);
    }


    @Test
    public void createBooking1()
    {     RestAssured.given()
                .spec(requestSpecification)
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
                .then().log().all().statusCode(200);//.body("booking.firstname", Matchers.equalTo("J22i1m"));
    }


    @Test
    public void updateBooking()
    {
        RestAssured.given()
                .spec(requestSpecification)
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .basePath("booking/1")
                .body("{\n" +
                        "    \"firstname\" : \"Amod\",\n" +
                        "    \"lastname\" : \"mahajan\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .when()
                .put()
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
