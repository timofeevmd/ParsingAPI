package Base;

import io.restassured.RestAssured;

import java.util.Properties;

public class Connection extends APIBase{
    Properties property = parsingPropertyFile();
    public String baseURL = property.getProperty("apiUrl");
    public String apiPort = property.getProperty("apiPort");

    public void apiConnection() {
        RestAssured.baseURI = baseURL;
        RestAssured.port = convertStringPropertyToInt(apiPort);
    }
}
