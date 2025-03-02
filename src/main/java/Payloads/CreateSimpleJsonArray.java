package Payloads;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateSimpleJsonArray {

    public static void main(String[] args) {


        Map<String,Object> empDetails=new HashMap<>();
        Map<String,Object> empDetails1=new HashMap<>();

        empDetails.put("id","1");
        empDetails.put("first_name","Albertina");
        empDetails.put("last_name","Levet");
        empDetails.put("email","alevet0@ocn.ne.jp");
        empDetails.put("gender","Female");
        empDetails.put("ip_address","98.96.218.220");

        empDetails1.put("id","2");
        empDetails1.put("first_name","Alber33tina");
        empDetails1.put("last_name","L33evet");
        empDetails1.put("email","aleve33t0@ocn.ne.jp");
        empDetails1.put("gender","Fe2male");
        empDetails1.put("ip_add22ress","98.96.218.220");

        List<Map<String,Object>> empList=new ArrayList<>();

        empList.add(empDetails);
        empList.add(empDetails1);

        RestAssured.given().log().all().contentType(ContentType.JSON).body(empList).when().get();

    }
}
