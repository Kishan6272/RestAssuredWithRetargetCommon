package POJO;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.List;

public class ConvertSimpleJsonArrayResponseToPojo {


    public static void main(String[] args) {


//        Address[] addressList= RestAssured.get("https://run.mocky.io/v3/4e722006-33ea-45cd-8afd-e642e8c4e520").as(Address[].class);
//
//        System.out.println(addressList[0].getHouse());
//        System.out.println(addressList[1].getHouse());

        List<Address> addressList1= RestAssured.get("https://run.mocky.io/v3/4e722006-33ea-45cd-8afd-e642e8c4e520")
                .as(new TypeRef<List<Address>>() {});

        System.out.println(addressList1.get(0).getHouse());
        System.out.println(addressList1.get(1).getHouse());



    }
}
