package JsonPath;

import io.restassured.path.json.JsonPath;

public class NestedJsonObject {

    public static void main(String[] args) {

        String jsonObj="{\n" +
                "  \"firstName\": \"John\",\n" +
                "  \"lastName\" : \"doe\",\n" +
                "  \"age\"      : 26,\n" +
                "  \"address\"  : {\n" +
                "    \"streetAddress\": \"naist street\",\n" +
                "    \"city\"         : \"Nara\",\n" +
                "    \"postalCode\"   : \"630-0192\"\n" +
                "  },\n" +
                "  \"phoneNumbers\": [\n" +
                "    {\n" +
                "      \"type\"  : \"iPhone\",\n" +
                "      \"number\": \"0123-4567-8888\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\"  : \"home\",\n" +
                "      \"number\": \"0123-4567-8910\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";


        JsonPath jp=new JsonPath(jsonObj);

        System.out.println(jp.getString("address"));
    }
}
