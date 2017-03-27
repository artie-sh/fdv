package tr;

import com.sun.javaws.jnl.XMLFormat;

/**
 * Created by ashendri on 27.03.2017.
 */
public class Authenticator {

    static String baseUrl = "https://dev.pilotbrief.com/Optima/services/AuthenticationWebService/Authentication.asmx";
    static String envelope = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:dss=\"http://www.wsicorp.com/DSS/\">\n"+
            "   <soap:Header/>\n"+
            "   <soap:Body>\n"+
            "      <dss:AuthenticateUserName>\n"+
            "      <dss:userName>%s</dss:userName><dss:password>%s</dss:password></dss:AuthenticateUserName>\n"+
            "   </soap:Body>\n"+
            "</soap:Envelope>";

    static String username = "dfrdemo3.2@wsi.com";
    static String pass = "wsi";

    static void authenticate() {


    }
}
