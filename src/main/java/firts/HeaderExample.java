package firts;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HeaderExample {

    @Test
    public void passHeader()
    {

        HashMap<String,String> hm=new HashMap<>();
        hm.put("header2","valu3");
        hm.put("header3","valu3");
        hm.put("header4","valu4");



//       // Header header=new Header();
//        RestAssured.given()
//                .log().all()
//                .header(hm)
//                .when().get();
    }
}
