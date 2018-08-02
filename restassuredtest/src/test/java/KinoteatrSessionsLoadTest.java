import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class KinoteatrSessionsLoadTest extends BaseTest {
    private static final String CINEMAS_PATH = RestAssured.baseURI+"ajax/kinoteatr_sessions_load";

    @Test
    public void checkKinoteatrSessionsTest() {
       // long testDate = System.currentTimeMillis();
        //int testTheatrId = 256;
       Map<String, Object> parameters = new HashMap<String, Object>();
       parameters.put("date", 1533168000);
       parameters.put("kinoteatr", 256);
        RestAssured.given()//.params(parameters)
               // .queryParam("date", "1533168000")
                //.queryParam("kinoteatr", "256")
                .contentType(ContentType.JSON)
                //.cookies(parameters)
                .body(parameters)
                .when()
                //.post(CINEMAS_PATH+"?date=1533168000&kinoteatr=256")
                .post(CINEMAS_PATH)
                .then().statusCode(200)
                .and().extract().response().print();
    }
}

  /*  function load_sessions(date, kinoteatr) {
        $.ajax({
                type: "POST",
                url: '/ajax/kinoteatr_sessions_load',
                data: {
            'date' : date,
                    'kinoteatr' : kinoteatr
        },
        success: function(data) {
            if (data.error === undefined) {
                clear_sessions();
                put_sessions(data);
            } else { console.log('Ошибка сервера'); }
        }
	});
    }*/