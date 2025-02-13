package firts;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class accessingclass {

    //https://restful-booker.herokuapp.com/booking

    public static void main(String[] args) {

//
//        RequestSpecification requestSpecification=RestAssured.given();
//        requestSpecification=  requestSpecification.log().all();
//       requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
//       requestSpecification.basePath("booking");
//
//       requestSpecification.body("{\n" +
//               "    \"firstname\" : \"Jim\",\n" +
//               "    \"lastname\" : \"Brown\",\n" +
//               "    \"totalprice\" : 111,\n" +
//               "    \"depositpaid\" : true,\n" +
//               "    \"bookingdates\" : {\n" +
//               "        \"checkin\" : \"2018-01-01\",\n" +
//               "        \"checkout\" : \"2019-01-01\"\n" +
//               "    },\n" +
//               "    \"additionalneeds\" : \"Breakfast\"\n" +
//               "}");
//
//
//       requestSpecification.contentType(ContentType.JSON);
//
//       Response response=requestSpecification.post();
//
//       //response.then().statusCode(200);
//
//        ValidatableResponse validatableResponse=response.then();
//        validatableResponse.log().all();
//        validatableResponse.statusCode(200);
//       // validatableResponse.
//



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
              .then().log().all().statusCode(200).body("booking.firstname", Matchers.equalTo("J22i1m"));
    }
}
