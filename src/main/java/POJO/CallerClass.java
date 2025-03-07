package POJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class CallerClass {

    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.setId(1);
        employee.setName("Kishan");
        employee.setMobNo("65757575");
        employee.setGender("kjkkjk");
        employee.setDeptId("kjkjjhjkhkhgjgggh");

         Employee1 employee1=new Employee1();

        Address address=new Address();
        address.setCity("gurugram");
        address.setCountary("India");
        address.setHouse(222);
        address.setStreetName("hkjhhk");
        address.setState("haryana");

        employee1.setId(2);
        employee1.setName("Kishan");
        employee1.setMobNo("79768678");
       employee1.setAddress(address);
        employee1.setGender("jjhgjg");







//       Response response= RestAssured.given().log().all().body(employee1).body(employee)
//                .when().get();

    //    System.out.println((String) response.getBody("name"));






//private int id;
//        private String name;
//        private String mobNo;
//        private String gender;
//        private String deptId;

        EmployeeJsonArrayPractice employeeJsonArrayPractice=new EmployeeJsonArrayPractice();
        employeeJsonArrayPractice.setEmail("766878");
        employeeJsonArrayPractice.setFirst_name("kjklhj");
        employeeJsonArrayPractice.setIp_address("jkhkhg");
        employeeJsonArrayPractice.setLast_name("hjgjg");
        employeeJsonArrayPractice.getGender("male");
        employeeJsonArrayPractice.setId("33");


        List<EmployeeJsonArrayPractice> listJson=new ArrayList<>();
        listJson.add(employeeJsonArrayPractice);

//        RestAssured.given().log().all().body(employee1).contentType(ContentType.JSON).get();



        Employee1 employee2=
        RestAssured.given().contentType(ContentType.JSON).log().all()
                .get("https://run.mocky.io/v3/009f765d-d0d4-419a-916d-4a42008f13d6").as(Employee1.class);

        int id=employee2.getId();
        System.out.println(id);
    }
}
