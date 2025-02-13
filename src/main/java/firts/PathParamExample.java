package firts;

import io.restassured.RestAssured;

public class PathParamExample {
    public static void main(String[] args) {


        RestAssured.given().log().all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/3")
                .header("Content-Type", "application/json")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .body("{\n" +
                        "    \"firstname\" : \"James\",\n" +
                        "    \"lastname\" : \"Brown\"\n" +
                        "}")
                .when()
                .patch()
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }


}
