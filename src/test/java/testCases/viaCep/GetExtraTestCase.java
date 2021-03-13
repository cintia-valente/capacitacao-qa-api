package testCases.viaCep;

import org.junit.jupiter.api.Test;
import testBases.viaCep.ExtraTestBase;

import static io.restassured.RestAssured.given;

public class GetExtraTestCase extends ExtraTestBase {

    @Test
    public void extraTestCase(){
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec);
    }
}
