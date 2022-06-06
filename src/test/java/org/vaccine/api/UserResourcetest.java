package org.vaccine.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class UserResourcetest {

    @Test
    public void get_all_users() {
        given()
                .when().get("/users")
                .then()
                .statusCode(200);
//                .body(is("Hello from RESTEasy Reactive"));
    }

}