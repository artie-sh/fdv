package tests;

import configs.Envs;
import webservices.AuthenticationWS;
import configs.Environment;

/**
 * Created by ashendri on 28.03.2017.
 */
public class GetAuthenticatedUser {



    public static void main(String args[]) {

        Environment demo = new Environment(Envs.DEV);
        AuthenticationWS auth = new AuthenticationWS();
        auth.authenticate(demo);

    }
}
