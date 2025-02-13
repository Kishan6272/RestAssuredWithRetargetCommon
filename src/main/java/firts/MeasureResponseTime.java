package firts;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;

import java.util.concurrent.TimeUnit;

public class MeasureResponseTime {
    public static void main(String[] args) {
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .contentType(ContentType.JSON);


        ResponseSpecification responseSpecification = RestAssured.given().expect()
                .statusCode(200)
                .time(Matchers.lessThan(5000L));


      Response response= RestAssured.given().log().all()
               .baseUri("https://restful-booker.herokuapp.com/")
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

                .post();
//                .then().log().all().statusCode(200)
//               .time(Matchers.lessThan(5000L));


       long responsems= response.timeIn(TimeUnit.SECONDS);

       response.then().assertThat().time(Matchers.lessThan(3000L)).time(Matchers.greaterThan(1000L));

        System.out.println("response time in milisecond"+responsems);

        System.out.println(response.getTimeIn(TimeUnit.SECONDS));


    }
}
