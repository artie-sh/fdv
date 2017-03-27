package webservices;

import bn.Environment;
import tr.Authenticator;

import static io.restassured.RestAssured.given;

/**
 * Created by ashendri on 27.03.2017.
 */
public class AuthenticationWS {

    public String baseURL = "";
    static String xmlBody =  "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dss=\"http://www.wsicorp.com/DSS/\">\n"+
            "   <soap:Header/>\n"+
            "   <soap:Body>\n"+
            "      <dss:AuthenticateUserName>\n"+
            "      <dss:userName>%s</dss:userName><dss:password>%s</dss:password></dss:AuthenticateUserName>\n"+
            "   </soap:Body>\n"+
            "</soap:Envelope>";

    public void authenticate(Environment environment) {
        given().contentType("application/soap+xml;").body(String.format(AuthenticationWS.xmlBody, environment.userName, environment.pass)).post(this.baseURL).then().log().all();

    }
}
