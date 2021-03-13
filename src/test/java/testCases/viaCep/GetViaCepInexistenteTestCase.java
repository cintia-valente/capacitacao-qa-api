package testCases.viaCep;

import org.junit.jupiter.api.Test;
import testBases.viaCep.ViaCepInexistenteTestBase;

import static io.restassured.RestAssured.given;

public class GetViaCepInexistenteTestCase extends ViaCepInexistenteTestBase {

    @Test
    public void viaCepInexistenteTestCase(){
        given()
                .spec(requestSpec)
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec);
    }
}
