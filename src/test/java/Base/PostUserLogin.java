package Base;

import PostUserLoginInstruction.*;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.Properties;

public class PostUserLogin extends APIBase {
    Properties property = parsingPropertyFile();
    public String postRequest = property.getProperty("postUserRequestConfig");
    public String guideLogin = property.getProperty("guideLoginConfig");
    public String guidePassword = property.getProperty("guidePasswordConfig");
    public String failedPassword = property.getProperty("failedPasswordConfig");
    public String returnFailedCode = property.getProperty("returnFailedCodeLoginConfig");
    public String failedMessage = property.getProperty("failedMessageConfig");
    public String nameMethod;

    public PermissionsResponse getPermissions(Response response) {
        PermissionsResponse permissions = response.getBody().as(PermissionsResponse.class);
        Assert.assertTrue(Boolean.parseBoolean(permissions.getPermissions().getAccountListNew()));
        return permissions;
    }

    public LessRolesResponse getLessRoles(Response response) {
        LessRolesResponse lessRoles = response.getBody().as(LessRolesResponse.class);
        Assert.assertTrue(Boolean.parseBoolean(lessRoles.getLessRoles().getName()));
        return lessRoles;
    }

    public RolesResponse getRole(Response response) {
        RolesResponse rolesResponse = response.getBody().as(RolesResponse.class);
        Assert.assertTrue(Boolean.parseBoolean(rolesResponse.getRoles().getName()));
        return rolesResponse;
    }

    public LoginResponse getUser(Response response) {
        LoginResponse loginResponse = response.getBody().as(LoginResponse.class);
        Assert.assertTrue(Boolean.parseBoolean(loginResponse.getUser().getLogin()));
        return loginResponse;
    }

    public int getUserFailedSessionCode(Response response){
        nameMethod = "getUserFailedSessionCode";
        SessionFailedResponse sessionFailedResponse = response.getBody().as(SessionFailedResponse.class);
        nullResponseVerification(sessionFailedResponse.getCodeValue(), nameMethod);
        Assert.assertTrue(sessionFailedResponse.getCodeValue() == convertStringPropertyToInt(returnFailedCode), "CodeValue is invaled");
        return sessionFailedResponse.getCodeValue();
    }

    public String getUserFailedSessionMessage(Response response){
        nameMethod = "getUserFailedSessionMessage";
        SessionFailedResponse sessionFailedResponse = response.getBody().as(SessionFailedResponse.class);
        nullResponseVerification(sessionFailedResponse.getMessageValue(), nameMethod);
        Assert.assertTrue(sessionFailedResponse.getMessageValue().equals(failedMessage),"Invalid message after login from incorrect login or password");
        return sessionFailedResponse.getMessageValue();
    }

    public String getUserSession(Response response) {
        nameMethod = "getUserSession";
        SessionResponse sessionResponse = response.getBody().as(SessionResponse.class);
        nullResponseVerification(sessionResponse.getSession().getSessionValue(), nameMethod);
        Assert.assertFalse(sessionResponse.getSession().getSessionValue().isEmpty(), "User login session is empty");
        return sessionResponse.getSession().getSessionValue();
    }
}

