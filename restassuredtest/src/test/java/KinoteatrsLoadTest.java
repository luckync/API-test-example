import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by BDSM on 25.07.2018.
 */
public class KinoteatrsLoadTest extends BaseTest {

    private static final String CINEMAS_PATH = "ajax/kinoteatrs_load";

    @Test
    public void checkResponseIsOk() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(CINEMAS_PATH)
                .then()
                .statusCode(200);
    }

    @Test
    public void checkMultiplexLavinaMallInTheList() {
        //check that json from CINEMAS_PATH has cinema with name "Multiplex Lavina Mall"
    }
}