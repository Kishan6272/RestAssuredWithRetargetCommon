package JsonIgnoreExample;

import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class ResponseAssertion {

    public static void main(String[] args) {
        RestAssured.get("https://run.mocky.io/v3/70721ca2-5031-4a5b-b7dd-581e8dea4b33")
                .then().body("", Matchers.instanceOf(Map.class));
    }
}
