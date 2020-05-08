package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


class MobileBankApiTestV1 {
    @Test
    void shouldPostMan() {
      // Given - When - Then
      // Предусловия
      given()
          .baseUri("https://postman-echo.com")
          .body("balance")
      // Выполняемые действия
      .when()
           .post("/post")
      // Проверки
      .then()
          .statusCode(200)
          .body("balance"='0')
        ;
    }
}
