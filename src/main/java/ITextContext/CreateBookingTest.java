package ITextContext;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CreateBookingTest {


    @Test
    public void createBooking(ITestContext context)
    {
       int id=
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .contentType(ContentType.JSON)
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
                .then().log().all().statusCode(200)
                .extract().jsonPath().getInt("bookingid");


       context.setAttribute("bookingid",id);

        System.out.println( context.getAttribute("bookingid"));

    }
}
