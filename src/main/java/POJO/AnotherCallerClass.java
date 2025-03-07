package POJO;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AnotherCallerClass {

    public static void main(String[] args) {


        Address employee1=RestAssured.get("https://run.mocky.io/v3/009f765d-d0d4-419a-916d-4a42008f13d6")
                .jsonPath()
                .getObject("Address", Address.class);

      //  System.out.println( employee1.getInt("Id"));

        System.out.println(employee1.getHouse());
    }
}
