package configs;

/**
 * Created by ashendri on 28.03.2017.
 */
public class Environment {

    public String name = "";
    public String userName = "";
    public String pass = "";
    public String address = "";


    public Environment(Envs env) {
        if (env.equals(Envs.DEV)) {
            this.name = "DEV";
            this.userName = "dfrdemo3.2@wsi.com";
            this.pass = "wsi";
            this.address = "http://10.66.61.28";
        }
        else if (env.equals(Envs.DEMO)) {
            this.name = "DEMO";
            this.userName = "dfrdemo2.2@wsi.com";
            this.pass = "wsi";
            this.address = "https://10.66.61.204";
        }

    }
}
