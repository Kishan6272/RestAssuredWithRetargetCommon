package JsonPath;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonPathNonExistance {


    @Test
    public void test1()
    {

        String jsonObject = " {\n" +
                "        \"firstName\":\"John\",\n" +
                "            \"lastName\" :\"doe\",\n" +
                "            \"age\"      :26\n" +
                "    }";


        JsonPath jp =new JsonPath(jsonObject);

//        String n=jp.get("firstName1");
//        System.out.println(n);

        System.out.println(jp.getString("$"));
        System.out.println((Object) jp.get());
        System.out.println(jp.getString(""));
    }
}
