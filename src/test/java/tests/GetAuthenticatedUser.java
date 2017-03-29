package tests;

import configs.Envs;
import webservices.AuthenticationWS;
import configs.Environment;
import io.restassured.response.Response;
import webservices.FlightViewerWS;

/**
 * Created by ashendri on 28.03.2017.
 */
public class GetAuthenticatedUser {



    public static void main(String args[]) {

        Environment env = new Environment(Envs.DEV);

        AuthenticationWS authWS = new AuthenticationWS(env);
        Response response = authWS.authenticate();

        FlightViewerWS flightViewerWS = new FlightViewerWS(env);

        flightViewerWS.getAuthenticatedUser(response.getCookies().get(".DSSAUTH"));

    }
}
