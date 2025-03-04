package Payloads;

import io.restassured.RestAssured;

import java.util.Map;

public class ConvertNestedJsonObjToJavaMap {
    public static void main(String[] args) {
       // https://run.mocky.io/v3/04e46067-183e-4e94-b19c-c08b10251322

        Map jsonResponseAsMap= RestAssured.get("https://run.mocky.io/v3/04e46067-183e-4e94-b19c-c08b10251322")
                .as(Map.class);

 Map<String,String> jsonMap=( Map<String,String>) jsonResponseAsMap.get("skills");

        System.out.println(jsonMap.get("name"));
        System.out.println(jsonMap.get("proficiency"));
    }
}
