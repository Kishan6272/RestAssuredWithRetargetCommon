package Payloads;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class HandlingDynamicResponseUsingInstanseOf {
    public static void main(String[] args) {

        Response response=
        RestAssured .get("https://run.mocky.io/v3/6789c359-59ec-4c8c-a5ab-976ee56d151c");

    Object responseAsObject=
        response.as(Object.class);

        if(responseAsObject instanceof List)
        {
           List resAsList=(List) responseAsObject;
            System.out.println(resAsList.size());
        }
        else if(responseAsObject instanceof Map)
        {
            Map resAsMap=(Map) responseAsObject;
            System.out.println(((Map<?, ?>) responseAsObject).keySet());
        }
    }
}
