package firts;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import org.testng.annotations.Test;

public class DefaultHeaderBehaviours {

    @Test
    public void defaultHeaderBeha()
    {
        RestAssured
                .given()
                .header("header1","value1 ","value2")
               // .header("header1","value1 ")
                .log().all()
                .when()
                .get();

    }


    @Test
    public void overWriteHeaderValues()
    {

        RestAssured
                .given()
                .config(RestAssuredConfig.config()
                        .headerConfig(HeaderConfig
                                .headerConfig()
                                .overwriteHeadersWithName("header1","header2")))
               // .header("header1","value1 ")
                .header("header1","value1 ","value2")
                .header("header2","Value2")
                .header("header2","Value2")
                .header("header3","Value3")
                .header("header3","Value3")
                .log().all()
                .when()
                .get();


    }

}
