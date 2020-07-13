package Base;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import static io.restassured.RestAssured.given;

public class APIBase {
    public Logger logger = LoggerFactory.getLogger(APIBase.class);
    FileInputStream fileInputStream;

    public Properties parsingPropertyFile() {
        Properties property = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/config.properties");
            property.load(fileInputStream);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            System.out.println("Error: config.properties not found.");
        }
        return property;
    }

    public Integer convertStringPropertyToInt(String intProperty) {
        return Integer.parseInt(intProperty);
    }

    public Response parametrizePostRequestAccessToken(String accessToken, Map<String, String> postValues, String postRequest) {
        return given().auth().oauth2(accessToken).contentType(ContentType.JSON).body(postValues).when().post(postRequest);
    }

    public Response parametrizeGetRequest(String accessToken, String getRequest) {
        return given().auth().oauth2(accessToken).when().get(getRequest);
    }

    public Response parametrizePostRequest(Map<String, String> postValues, String postRequest) {
        return given().accept(ContentType.JSON).contentType(ContentType.JSON).body(postValues).when().post(postRequest);
    }

    public void verifyStatusCode(Response response, int expectedStatusCode) {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, expectedStatusCode, "Returns status code: " + statusCode + " instead of: " + expectedStatusCode);
    }

    public void printMessage(String message) {
        logger.trace(message);
        System.out.println(message);
    }

    public void writeLogAfterException(ITestResult iTestResult) {
        if(iTestResult.getStatus() == ITestResult.SUCCESS){
            printMessage("SUCCESS API Test: " + iTestResult.getMethod().getMethodName());
        } else if(iTestResult.getStatus() == ITestResult.FAILURE ){
            printMessage("ERROR API Test: " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getThrowable());
        } else if (iTestResult.getStatus() == ITestResult.SKIP){
            printMessage("SKIP API Test: " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getThrowable());
        } else if (iTestResult.getStatus() == ITestResult.SUCCESS_PERCENTAGE_FAILURE) {
            printMessage("SUCCESS_PERCENTAGE_FAILURE API Test: " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getThrowable());
        }
    }

    public void nullResponseVerification(Object obj, String nameMethod) {
        Assert.assertNotNull(obj, " JSON request have unexpected format. Details: Failed Class - " + getClass().getCanonicalName() + "." + nameMethod);
    }
}