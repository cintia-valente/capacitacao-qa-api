package testCases.viaCep;

import org.junit.jupiter.api.Test;
import testBases.viaCep.ViaCepFormatoInvalidoTestBase;

import static io.restassured.RestAssured.given;

public class GetViaCepFormatoInvalidoTestCase extends ViaCepFormatoInvalidoTestBase {

    @Test
    public void viaCepFormatoInvalidoTestCase(){
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec);
    }
}
