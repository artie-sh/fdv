package webservices;

import configs.Environment;
import io.restassured.response.Response;

/**
 * Created by ashendri on 29.03.2017.
 */
public class WebService {

    static String baseURL = "/Optima/Services/FlightViewerService";
    public Environment environment;
    public Response response;


    public WebService() {
        }

    public WebService(Environment environment) {
        this.environment = environment;
    }
}
