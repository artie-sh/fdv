package tr;

import static io.restassured.RestAssured.given;

/**
 * Created by ashendri on 27.03.2017.
 */
public class TestAuth {

    public static void main(String args[]) {
        //String formattedEnvelope = String.format(Authenticator.envelope, Authenticator.username, Authenticator.pass);
        given().contentType("application/soap+xml;").body(String.format(Authenticator.envelope, Authenticator.username, Authenticator.pass)).post(Authenticator.baseUrl).then().log().all();

    }
}
