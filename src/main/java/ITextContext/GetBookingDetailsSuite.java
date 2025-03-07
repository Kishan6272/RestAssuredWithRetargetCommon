package ITextContext;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetBookingDetailsSuite {


    @Test
    public void getBooking(ITestContext context)
    {

        Response response=
                RestAssured.given().log().all().when()
                        .get("https://restful-booker.herokuapp.com/booking/"+context.getSuite().getAttribute("bookingid"))
                        .then().log().all().extract().response();

    }
}
