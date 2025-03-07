package JsonToPojo;

import POJO.Address;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class UpdateJsonWithoutPojo {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();

        Map<String,Object> address1=
                objectMapper.readValue(
                        new File("D:\\KishanProject2025\\RestAssuredWithRetargetCommon\\src\\main\\java\\MSE_Jackson_Tutorial\\firstJackson\\address.json")
                        , new TypeReference<Map<String,Object>>() {});



        System.out.println(address1.get("city"));
       // address1.setCity("Delhi");
        address1.put("city","kishan");
        address1.put("Pin",122001);
        address1.remove("house");

        String  updated=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address1);

        System.out.println(updated);
    }
}
