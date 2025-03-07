package JsonToPojo;

import POJO.Address;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToPojoAddress {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper=new ObjectMapper();

        Address address1=
        objectMapper.readValue(new File("D:\\KishanProject2025\\RestAssuredWithRetargetCommon\\src\\main\\java\\MSE_Jackson_Tutorial\\firstJackson\\address.json")
                ,Address.class);

        System.out.println(address1.getCountary());
        address1.setCity("Delhi");
        System.out.println(address1.getCity());

       String updateJson1= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address1);
        System.out.println(updateJson1);

    }
}
