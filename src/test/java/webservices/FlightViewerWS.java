package webservices;

import configs.Environment;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * Created by ashendri on 29.03.2017.
 */
public class FlightViewerWS {

    public Environment environment;
    public Response response;

    static String serviceBaseURL = "/Optima/Services/FlightViewerService";

    static String GetAuthenticatedUser = "/GetAuthenticatedUser";
    static String GetFlightDataList = "/GetFlightDataList";
    static String FlightDetails = "/FlightDetails";
    static String GetDocument = "/GetDocument";



    public FlightViewerWS(Environment environment) {
        this.environment = environment;
    }


    public void getAuthenticatedUser(String authCookie) {
        /*
        this.response = given()
                        .cookie(".DSSAUTH", authCookie)
                        .get(this.environment.address + this.GetAuthenticatedUser)
                        .then()
                        .extract().response();
                        */

        given()
                .cookie(".DSSAUTH", authCookie)
                .get(this.environment.address + this.serviceBaseURL + this.GetAuthenticatedUser)
                .then()
                .log().all();

        //System.out.print(response.asString());

    }



}
