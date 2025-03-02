package MockData;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.checkerframework.checker.units.qual.C;

public class MockyDesign {
    public static void main(String[] args) {

        RestAssured.given().log().all().contentType(ContentType.JSON).
                baseUri("https://run.mocky.io/v3/10a82a2f-0570-4484-878d-60734f7e29de")
                .when().get().then().log().all();
    }
}
