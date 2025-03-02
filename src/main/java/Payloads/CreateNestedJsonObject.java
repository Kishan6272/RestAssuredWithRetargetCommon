package Payloads;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreateNestedJsonObject {
    public static void main(String[] args) {
        Map<String,Object> payload=new LinkedHashMap<>();

        payload.put("id",1);
        payload.put("firstname","kishan");
        payload.put("LastName","pandey");
        payload.put("married",false);
        payload.put("salary",1000);
        Map<String,Object> mobMap=new LinkedHashMap<>();
        mobMap.put("type","personal");
        mobMap.put("number","1234555");
        payload.put("mob",mobMap);


        RestAssured.given().log().all().contentType(ContentType.JSON)
                .body(payload).get();
    }
}
