package exps; /**
 * Created by ashendri on 27.03.2017.
 */

import static io.restassured.RestAssured.given;

public class Trial {

    public static void main(String args[]) {

        given().post(DevEnv.AUTH_WS).then().statusCode(401).log().all();

    }

}
