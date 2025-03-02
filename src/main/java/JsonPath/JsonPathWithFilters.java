package JsonPath;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.List;

public class JsonPathWithFilters {

    public static void main(String[] args) {

        String fileJson= "D:\\KishanProject2025\\RestAssuredWithRetargetCommon\\src\\main\\java\\JsonPath\\People.json";
        File jsonArrayFile= new File(fileJson);


        JsonPath jsonPath=new JsonPath(jsonArrayFile);

//        System.out.println(jsonPath.getString("[0].firstnam"));
//
//         List<String> liFirstname= jsonPath.getList("firstnam");
//        System.out.println(liFirstname);

        List<String> allFeName=jsonPath.getList("findAll{it.gender=='female'}.firstnam");


        System.out.println(  jsonPath.getList("findAll{it.gender=='female'}.firstnam"));

        System.out.println(   jsonPath.getString("find{it.firstnam=='Kishan' & it.LastName=='Pandey'}.Designation"));

        System.out.println( jsonPath.getList("findAll{it.firstnam=='Kishan' | it.LastName=='Pandey'}.Designation"));

        System.out.println(jsonPath.getList("findAll{it.id>=5}.firstnam"));

        System.out.println(jsonPath.getInt("size()"));
    }
}
