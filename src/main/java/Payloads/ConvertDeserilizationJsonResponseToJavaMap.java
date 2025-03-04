package Payloads;

import io.restassured.RestAssured;

import java.util.Map;

public class ConvertDeserilizationJsonResponseToJavaMap {
    public static void main(String[] args) {
        //"https://run.mocky.io/v3/10a82a2f-0570-4484-878d-60734f7e29de"

       Map jsonResponseAsMap= RestAssured.get("https://run.mocky.io/v3/10a82a2f-0570-4484-878d-60734f7e29de")
               .as(Map.class);

        System.out.println(jsonResponseAsMap.get("first_name"));

        jsonResponseAsMap.keySet().forEach(k-> System.out.println(k));

    }
}
