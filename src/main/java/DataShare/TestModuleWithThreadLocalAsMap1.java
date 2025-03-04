package DataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TestModuleWithThreadLocalAsMap1 {

    int bookingId;

    @Test(priority = 1)
    public void createBooking()
    {
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .contentType(ContentType.JSON);


        ResponseSpecification responseSpecification = RestAssured.given().expect()
                .statusCode(200)
                .time(Matchers.lessThan(5000L));

        bookingId=
                RestAssured.given().spec(requestSpecification)
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


        System.out.println(bookingId);
        ThreadLocalDataStoreAsMap.setValue(Constants.BOOKING_ID,bookingId);

        System.out.println("ThreadId is"+ Thread.currentThread().getId()+"   "+ThreadLocalDataStoreAsMap.getValue(Constants.BOOKING_ID));


    }

    @Test(priority = 2)
    public void getBookingById() throws InterruptedException {  Thread.sleep(2000);
        System.out.println("ThreadId is"+ Thread.currentThread().getId()+"   "+ThreadLocalDataStoreAsMap.getValue(Constants.BOOKING_ID));
        Response response= RestAssured.given().log().all().when()
                .get("https://restful-booker.herokuapp.com/booking/"+bookingId)
                .then().log().all().extract().response();
    }
}
