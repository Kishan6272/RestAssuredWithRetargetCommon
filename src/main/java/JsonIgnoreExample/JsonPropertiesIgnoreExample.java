package JsonIgnoreExample;

import POJO.Address;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertiesIgnoreExample {

    public static void main(String[] args) throws JsonProcessingException {


        String json = "{\n" +
                "      \"house\":33,\n" +
                "      \"streetName\":\"sec 40\",\n" +
                "      \"city\":\"gurugram\",\n" +
                "      \"state\":\"Haryana\",\n" +
                "      \"countary\":\"india\",\n" +
                "    \"Skills\":\"AllTesting\"\n" +
                "      \n" +
                "    }";

        ObjectMapper objectMapper=new ObjectMapper();

        Address address=objectMapper.readValue(json, Address.class);

        System.out.println(address.getCity());
        System.out.println(address.getHouse());
        System.out.println(address.getStreetName());
        System.out.println(address.getState());
        System.out.println(address.getCountary());
    }
}
