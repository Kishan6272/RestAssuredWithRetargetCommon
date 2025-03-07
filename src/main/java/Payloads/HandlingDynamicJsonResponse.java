package Payloads;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class HandlingDynamicJsonResponse {

    public static void main(String[] args) {
        Response response=
        RestAssured.get("https://run.mocky.io/v3/65cf4d06-0314-4ee9-ad13-71380e8e7834");

      List< Map <String,Object>>responseMp= response.as(List.class);

    //    System.out.println(responseMp.keySet());
        System.out.println(responseMp.get(0).get("first_name"));


//        Response response=RestAssured.get("https://run.mocky.io/v3/6789c359-59ec-4c8c-a5ab-976ee56d151c");
//
//        //System.out.println(response.asString());
//
//       Map responseAsList= response.as(Map.class);
//        System.out.println(responseAsList.get("first_name"));



    }
}
