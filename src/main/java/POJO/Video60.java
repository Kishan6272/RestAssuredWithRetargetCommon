package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;

public class Video60 {
    public static void main(String[] args) throws JsonProcessingException {
        Employee employee=new Employee();

        employee.setId(1);
        employee.setName("Kishan");
        employee.setMobNo("65757575");
        employee.setGender("kjkkjk");
       // employee.setDeptId("kjkjjhjkhkhgjgggh");

        employee.setSkills("kkkkkk");
        employee.setFamilyMembers(new HashMap<String,String>());

        ObjectMapper objectMapper=new ObjectMapper();
        String emp1JsonFormat=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        System.out.println(emp1JsonFormat);
    }
}
