package firts;

import io.restassured.RestAssured;

public class PutRequestDemo {

    public static void main(String[] args) {
        //201 created   200 sucess  204

        //https://restful-booker.herokuapp.com/booking/id


        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/1")
                .header("Content-Type", "application/json")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
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
