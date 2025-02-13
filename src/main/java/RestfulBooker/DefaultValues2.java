package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class DefaultValues2 {


    @Test
    public void createBooking1()
    {
        RestAssured.given().log().all()
                //.baseUri("https://restful-booker.herokuapp.com/")
                //.basePath("booking")
                .contentType(ContentType.JSON)
                .basePath("auth")
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}")

                .post().then().log().all().statusCode(200);
    }

    @Test(enabled = false)
    public void createBooking11()
    {
        RestAssured.given().log().all()
                // .baseUri("https://restful-booker.herokuapp.com/")
                //.basePath("booking")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"firstname\" : \"J2rrff222i1m\",\n" +
                        "    \"lastname\" : \"Br222own\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")

                .post().then().log().all().statusCode(200);
    }
}
