package JsonPath;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonObject {

    public static void main(String[] args) {


        String jsonObject = "{\n" +
                "  \"firstName\": \"John\",\n" +
                "  \"lastName\" : \"doe\",\n" +
                "  \"age\"      : 26,\n" +
                "  \"address\"  :\"benguluru\",\n" +
                "  \"salary\": \"10000000\",\n" +
                "  \"married\":false\n" +
                "}";


        JsonPath jp = new JsonPath(jsonObject);

        System.out.println(jp.getString("firstName"));

        System.out.println(   jp.getInt("age"));

        System.out.println(  jp.getBoolean("married"));
        System.out.println( jp.getInt("salary"));


    }



}
