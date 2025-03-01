package JsonPath;

import io.restassured.path.json.JsonPath;

public class JsonPathForJsonArray {

    public static void main(String[] args) {
        String jsonArray="\n" +
                "[[\n" +
                "  \"10\",\n" +
                "  \"20\",\n" +
                "  \"30\",\n" +
                "  \"40\",\n" +
                "  \"50\",\n" +
                "  \"60\",\n" +
                "  ],\n" +
                "  [\n" +
                "  \"100\",\n" +
                "  \"200\",\n" +
                "  \"300\",\n" +
                "  \"400\",\n" +
                "  \"500\",\n" +
                "  \"600\",\n" +
                "  ]\n" +
                "  \n" +
                "  \n" +
                "  ]";

        JsonPath jp=new JsonPath(jsonArray);
//
//        System.out.println(jp.getString("[5]"));
//        System.out.println(jp.getList("").size());
//        System.out.println(jp.getList(""));

        System.out.println(jp.getString("[1][2]"));
        System.out.println(jp.getList("").size());
        System.out.println(jp.getList("").get(1));


    }
}
