package testCases.viaCep;

import org.junit.jupiter.api.Test;
import testBases.viaCep.ViaCepTestBase;

import static io.restassured.RestAssured.given;

public class GetViaCepTestCase extends ViaCepTestBase {

    @Test
    public void viaCepTestCase(){
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec);
    }
}
