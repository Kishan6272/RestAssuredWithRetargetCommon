package Payloads;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CreateJsonObjectUsingMap {
    public static void main(String[] args) {

        Map<String, Object> jsonObj=new LinkedHashMap<>();

        jsonObj.put("id",1);
        jsonObj.put("firstname","kishan");
        jsonObj.put("LastName","pandey");
        jsonObj.put("married",false);
        jsonObj.put("salary",1000);


        RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .body(jsonObj)
                .get();


    }
}
