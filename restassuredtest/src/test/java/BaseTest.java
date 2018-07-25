import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by BDSM on 25.07.2018.
 */
public class BaseTest {

    @BeforeClass
    public static void initBaseUrl(){
        RestAssured.baseURI= "https://kinoafisha.ua/";
    }

}
