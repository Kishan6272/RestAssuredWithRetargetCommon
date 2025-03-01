package JsonPath;

import io.restassured.path.json.JsonPath;

public class NewJson {

    public static void main(String[] args) {
        String s="[{\n" +
                "  \"firstnam\": \"Kishan\",\n" +
                "  \"LastName\": \"Pandey\",\n" +
                "  \"Designation\": \"Director of QA\",\n" +
                "  \"address\": [\n" +
                "    {\n" +
                "      \"city\": \"bhopal\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"city\": \"indore\"\n" +
                "    }\n" +
                "  ]\n" +
                "},\n" +
                "{\n" +
                "  \"firstnam\": \"Kisha112n\",\n" +
                "  \"LastName\": \"Pand22ey\",\n" +
                "  \"Designation\": \"Director of QA1\",\n" +
                "  \"address\": [\n" +
                "    {\n" +
                "      \"city\": \"bhopal\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"city\": \"indore\"\n" +
                "    }\n" +
                "  ]\n" +
                "}\n" +
                "]\n" +
                "\n";
        JsonPath jsonPath=new JsonPath(s);

        System.out.println(jsonPath.getString("[1].address"));

        System.out.println(jsonPath.getString("[0].address[0].city"));

        System.out.println(jsonPath.getList("[0].address.city"));
    }
}
