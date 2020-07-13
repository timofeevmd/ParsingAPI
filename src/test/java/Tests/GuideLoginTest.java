package Tests;

import Base.*;
import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GuideLoginTest {
    Connection connection = new Connection();
    PostUserLogin postUserLogin = new PostUserLogin();

    @BeforeTest
    public void initiateTest() {
        connection.apiConnection();
    }

    @BeforeMethod
    public void namePackage(){
        connection.printMessage("GuideLoginTest");
    }

    @AfterMethod
    public void compareTestResults(ITestResult iTestResult){
        connection.writeLogAfterException(iTestResult);
    }

    @Test
    public void successGuideLogin() {
        connection.printMessage("Verify session from /user/login (post) with valid guide login and password - START");
        Map<String, String> loginValues = new HashMap<>();
        loginValues.put("login", postUserLogin.guideLogin);
        loginValues.put("password", postUserLogin.guidePassword);
        Response response = postUserLogin.parametrizePostRequest(loginValues, postUserLogin.postRequest);
        postUserLogin.verifyStatusCode(response, 200);
        postUserLogin.getUserSession(response);
        connection.printMessage("Verify session from /user/login (post) with valid guide login and password - FINISH");

    }

    @Test
    public void failedGuideLogin() {
        connection.printMessage("Verify message and code from /user/login (post) with invalid guide login and password - START");
        Map<String, String> loginValues = new HashMap<>();
        loginValues.put("login", postUserLogin.guideLogin);
        loginValues.put("password", postUserLogin.failedPassword);
        Response response = postUserLogin.parametrizePostRequest(loginValues, postUserLogin.postRequest);
        postUserLogin.verifyStatusCode(response, 200);
        postUserLogin.getUserFailedSessionMessage(response);
        postUserLogin.getUserFailedSessionCode(response);
        connection.printMessage("Verify message and code from /user/login (post) with invalid guide login and password - FINISH");
    }
}