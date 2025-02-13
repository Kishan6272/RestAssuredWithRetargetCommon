package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DefaultValues1 {



    @BeforeTest
    public void setUp()
    {
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        RestAssured.basePath="booking";

        RestAssured.requestSpecification=RestAssured.given().log().all();
        RestAssured.responseSpecification=RestAssured.expect().statusCode(200);
    }

    @Test
    public void createBooking1()
    {
        RestAssured.given()//.log().all()
                //.baseUri("https://restful-booker.herokuapp.com/")
                //.basePath("booking")
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

                .post().then().log().all();//.statusCode(200);
    }

    @Test
    public void createBooking11()
    {
        RestAssured.given()//.log().all()
               // .baseUri("https://restful-booker.herokuapp.com/")
                //.basePath("booking")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"firstname\" : \"J2222i1m\",\n" +
                        "    \"lastname\" : \"Br222own\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")

                .post().then().log().all();//.statusCode(200);
    }
}
