package Payloads;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.*;

public class CreateComplexJsonPayloadUsingMapList {
    public static void main(String[] args) {

        //parent json array
        List<Map<String,Object>> liComplexPayload=new ArrayList<>();

        Map<String,Object> firstJsonObject=new LinkedHashMap<>();
        Map<String,Object> firstInnerJsonObject=new LinkedHashMap<>();
       // firstInnerJsonObject.put("","");

//        {
//            "id": 1,
//                "first_name": "Albertina",
//                "last_name": "Levet",
//                "email": "alevet0@ocn.ne.jp",
//                "gender": "Female",
//                "mobile":["123456",
//                "5464564646"],
//            "skills":{
//            "name":"testing",
//                    "proficiency":"medium"
//        }
//        }

        firstJsonObject.put("id","1");
        firstJsonObject.put("first_name","Albertina");
        firstJsonObject.put("last_name","Levet");
        firstJsonObject.put("email","alevet0@ocn.ne.jp");
        firstJsonObject.put("gender","female");

        List<String> mobNum=new ArrayList<>();
        mobNum.add("123456");
        mobNum.add("5464564646");




        firstInnerJsonObject.put("name","testing");
        firstInnerJsonObject.put("proficiency","medium");

        firstJsonObject.put("mobile",mobNum);
        firstJsonObject.put("skills",firstInnerJsonObject);




        Map<String,Object> secondJsonObject=new LinkedHashMap<>();

        List<Map<String,Object>> ComplexPayload=new ArrayList<>();

        Map<String,Object> secondInnerPayLoad=new LinkedHashMap<>();
        Map<String,Object> secondInnerPayLoad1=new LinkedHashMap<>();


        secondInnerPayLoad.put("name","testing");
        secondInnerPayLoad.put("proficiency","medium");

        List<String> innerelem=new ArrayList<>();
        innerelem.add("OCJP 11");
        innerelem.add("OCJP 12");

        secondInnerPayLoad1.put("name","java");
        secondInnerPayLoad1.put("proficiency","medium");
        secondInnerPayLoad1.put("certification",innerelem);

        ComplexPayload.add(secondInnerPayLoad);
        ComplexPayload.add(secondInnerPayLoad1);


        secondJsonObject.put("id","2");
        secondJsonObject.put("first_name","Alberti22na");
        secondJsonObject.put("last_name","Le22vet");
        secondJsonObject.put("email","alev22et0@ocn.ne.jp");
        secondJsonObject.put("gender","fe22male");
        secondJsonObject.put("skills",ComplexPayload);


        RestAssured.given().log().all().contentType(ContentType.JSON).body(firstJsonObject)
                .body(secondJsonObject).when().get();







    }
}
