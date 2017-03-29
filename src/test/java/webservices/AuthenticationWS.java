package webservices;

import configs.Environment;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;


/**
 * Created by ashendri on 27.03.2017.
 */
public class AuthenticationWS {

    public Environment environment;
    public Response response;

    static String baseURL = "/Optima/services/AuthenticationWebService/Authentication.asmx";

    static String xmlBody =     "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dss=\"http://www.wsicorp.com/DSS/\">\n"+
                                "   <soap:Header/>\n"+
                                "   <soap:Body>\n"+
                                "       <dss:AuthenticateUserName>\n"+
                                "           <dss:userName>%s</dss:userName>\n" +
                                "           <dss:password>%s</dss:password>\n" +
                                "       </dss:AuthenticateUserName>\n"+
                                "   </soap:Body>\n"+
                                "</soap:Envelope>";


    public AuthenticationWS(Environment environment) {
        this.environment = environment;
    }


    public Response authenticate() {
        this.response = given()
                        .contentType("application/soap+xml;")
                        .body(String.format(AuthenticationWS.xmlBody, this.environment.userName, this.environment.pass))
                        .when()
                        .post(this.environment.address + this.baseURL)
                        .then()
                        .extract().response();

        Assert.assertEquals(this.response.getStatusCode(), 200);
        return this.response;
    }
}
