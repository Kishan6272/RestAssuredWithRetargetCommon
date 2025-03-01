package JsonPath;


import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class jsonIntro {

    @Test
    public void jsonPathFinder()
    {
        String json="{\n" +
                "    \"firstname\": \"Sally\",\n" +
                "    \"lastname\": \"Brown\"," +
                "}";


         //get json path instance of given json doc
        JsonPath jsonObj=new JsonPath(json);
       String s= jsonObj.getString("firstname");

      // Object fname=jsonObj.get("firstname");

        //System.out.println(fname);


     //  String Firstname= jsonPath.getPath("firstname");

        int  i=jsonObj.get("firstname");

       // System.out.println(Firstname);


    }
}
