package Tests;

import Base.Connection;
import Base.GetMemberGetMessagesChatKey;
import GetMemberGetMessagesChatKeyInstruction.GetSuccessGuideResponse;
import GetMemberGetMessagesChatKeyInstruction.GetSuccessTripTouristResponse;
import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberGetMessagesChatKeyTest {
    Connection connection = new Connection();
    PostMemberRegistration postMemberRegistration = new PostMemberRegistration();
    GetMemberGetMessagesChatKey getMemberGetMessagesChatKey = new GetMemberGetMessagesChatKey();
    GetSuccessGuideResponse getSuccessGuideResponseHelper = new GetSuccessGuideResponse();
    GetSuccessTripTouristResponse getSuccessTripTouristResponseHelper = new GetSuccessTripTouristResponse();

    @BeforeTest
    public void initiateTest() {
        connection.apiConnection();
    }

    @BeforeMethod
    public void namePackage(){
        connection.printMessage("MemberGetMessagesChatKeyTest");
    }

    @AfterMethod
    public void compareTestResults(ITestResult iTestResult){
        connection.writeLogAfterException(iTestResult);
    }

    public String memberRegistrationToken() {
        Map<String, String> registrationForm = new HashMap<>();
        registrationForm.put("phone", postMemberRegistration.phone);
        registrationForm.put("tripId", postMemberRegistration.tripId.get(2));
        registrationForm.put("first_name", postMemberRegistration.firstName);
        registrationForm.put("last_name", postMemberRegistration.lastName);
        registrationForm.put("device_id", postMemberRegistration.deviceId.toString());
        Response response = postMemberRegistration.parametrizePostRequest(registrationForm, postMemberRegistration.postRequest);
        postMemberRegistration.verifyStatusCode(response, 200);
        return postMemberRegistration.getMemberRegistration(response);
    }


    @Test
    public void successGetAllMessages() {
        connection.printMessage("Verify request /member/getMessages/{chatKey} with valid params - START");
        String accessToken = memberRegistrationToken();
        String getRequest = getMemberGetMessagesChatKey.getRequest;
        for(String keyTripId: postMemberRegistration.tripId) {
            String chatKey = "t" + keyTripId;
            Response response = getMemberGetMessagesChatKey.parametrizeGetRequest(accessToken, getRequest + chatKey);
            getMemberGetMessagesChatKey.verifyStatusCode(response, 200);
            getMemberGetMessagesChatKey.getChatId(response);
        }
        connection.printMessage("Verify request /member/getMessages/{chatKey} with valid params - FINISH");
    }

    @Test
    public void failedAllMessagesAbsentToken(){
        connection.printMessage("Verify request /member/getMessages/{chatKey} with invalid \"accessToken\" params - START");
        String accessToken = "";
        String getRequest = getMemberGetMessagesChatKey.getRequest;
        String chatKey = "t" + postMemberRegistration.tripId.get(2);
        Response response = getMemberGetMessagesChatKey.parametrizeGetRequest(accessToken, getRequest + chatKey);
        getMemberGetMessagesChatKey.verifyStatusCode(response, 200);
        getMemberGetMessagesChatKey.failedTokenMessages(response);
        getMemberGetMessagesChatKey.failedTokenCode(response);
        connection.printMessage("Verify request /member/getMessages/{chatKey} with invalid \"accessToken\" params - FINISH");
    }

    @Test
    public void failedAllMessagesInvalidChatKey(){
        connection.printMessage("Verify request /member/getMessages/{chatKey} with invalid \"chatKey\" params - START");
        String accessToken = memberRegistrationToken();;
        String getRequest = getMemberGetMessagesChatKey.getRequest;
        String chatKey = getMemberGetMessagesChatKey.failedCatKey;
        Response response = getMemberGetMessagesChatKey.parametrizeGetRequest(accessToken, getRequest + chatKey);
        getMemberGetMessagesChatKey.verifyStatusCode(response, 200);
        getMemberGetMessagesChatKey.failedChatKeyMessages(response);
        getMemberGetMessagesChatKey.failedChatKeyCode(response);
        connection.printMessage("Verify request /member/getMessages/{chatKey} with invalid \"chatKey\" params - FINISH");
    }

    @Test
    public void successGetMessagesGuideTripTourist() {
        connection.printMessage("Verify request /member/getMessages/{chatKey} with valid params guide and trip tourist - START");
        Response responseGetSuccessGuide = getSuccessGuideResponseHelper.responseGetSuccessGuide();
        Response responseGetSuccessTripTourist = getSuccessTripTouristResponseHelper.responseGetSuccessTripTourist();
        String accessToken = memberRegistrationToken();
        String getRequest = getMemberGetMessagesChatKey.getRequest;
        for (int i = 0; i < getMemberGetMessagesChatKey.getReturnSuccessGuide(responseGetSuccessGuide).size(); i++) {
            for (int j = 0; j < getMemberGetMessagesChatKey.getReturnSuccessTripTourist(responseGetSuccessTripTourist).size(); j++) {
                List<Object> returnGuide = getMemberGetMessagesChatKey.getReturnSuccessGuide(responseGetSuccessGuide);
                List<Object> returnTripTourist = getMemberGetMessagesChatKey.getReturnSuccessTripTourist(responseGetSuccessTripTourist);
                String chatKey = "m" + returnGuide.get(i) + "guide" + returnTripTourist.get(j) + "trip_tourist";
                Response response = getMemberGetMessagesChatKey.parametrizeGetRequest(accessToken, getRequest + chatKey);
                getMemberGetMessagesChatKey.verifyStatusCode(response, 200);
                getMemberGetMessagesChatKey.getGuideTripTouristChatId(response);
                getMemberGetMessagesChatKey.getGuideTripTouristMessages(response);
            }
        }
        connection.printMessage("Verify request /member/getMessages/{chatKey} with valid params guide and trip tourist - FINISH");
    }

    @Test
    public void successGetMessagesTripTouristTripTourist() {
        connection.printMessage("Verify request /member/getMessages/{chatKey} with trip tourist params guide and trip tourist - START");
        Response responseGetSuccessTripTourist = getSuccessTripTouristResponseHelper.responseGetSuccessTripTourist();
        String accessToken = memberRegistrationToken();
        String getRequest = getMemberGetMessagesChatKey.getRequest;
        for (int i = 0; i < getMemberGetMessagesChatKey.getReturnSuccessTripTourist(responseGetSuccessTripTourist).size(); i++) {
            for (int j = getMemberGetMessagesChatKey.getReturnSuccessTripTourist(responseGetSuccessTripTourist).size() - 1; j > 0; j--) {
                List<Object> returnTripTouristFirstLast = getMemberGetMessagesChatKey.getReturnSuccessTripTourist(responseGetSuccessTripTourist);
                List<Object> returnTripTouristLastFist = getMemberGetMessagesChatKey.getReturnSuccessTripTourist(responseGetSuccessTripTourist);
                if (!returnTripTouristFirstLast.get(i).equals(returnTripTouristLastFist.get(j))) {
                    String chatKey = "m" + returnTripTouristFirstLast.get(i) + "trip_tourist" + returnTripTouristLastFist.get(j) + "trip_tourist";
                    Response response = getMemberGetMessagesChatKey.parametrizeGetRequest(accessToken, getRequest + chatKey);
                    getMemberGetMessagesChatKey.verifyStatusCode(response, 200);
                    getMemberGetMessagesChatKey.getTriTouristTripTouristChatId(response);
                    getMemberGetMessagesChatKey.getTripTouristTripTouristMessages(response);
                }
            }
        }
        connection.printMessage("Verify request /member/getMessages/{chatKey} with trip tourist params guide and trip tourist - FINISH");
    }
}
















