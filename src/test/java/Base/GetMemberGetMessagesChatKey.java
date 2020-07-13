package Base;

import GetMemberGetLocationTripIdInstruction.GetSuccessParticipantInstruction.ReturnSuccessGuideResponse;
import GetMemberGetLocationTripIdInstruction.GetSuccessParticipantInstruction.ReturnSuccessTripTouristResponse;
import GetMemberGetMessagesChatKeyInstruction.AllMessages.MemberGetMessagesChatKeyResponse;
import GetMemberGetMessagesChatKeyInstruction.FailedResponse.MemberFailedAccessTokenAllMessagesResponse;
import GetMemberGetMessagesChatKeyInstruction.FailedResponse.MemberFailedChatKeyAllMessagesResponse;
import GetMemberGetMessagesChatKeyInstruction.GuideTripTouristMessages.MemberGetMessagesChatKeyGuideTripTouristMessagesResponse;
import GetMemberGetMessagesChatKeyInstruction.GuideTripTouristMessages.MemberGetMessagesChatKeyGuideTripTouristResponse;
import GetMemberGetMessagesChatKeyInstruction.TripTourisTripTouristMessages.MemberGetMessagesChatKeyTripTouristTripTouristMessagesResponse;
import GetMemberGetMessagesChatKeyInstruction.TripTourisTripTouristMessages.MemberGetMessagesChatKeyTripTouristTripTouristResponse;

import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GetMemberGetMessagesChatKey extends APIBase {

    Properties property = parsingPropertyFile();

    public String getRequest = property.getProperty("getRequestMemberGetMessagesChatKeyConfig");
    public String failedCatKey = property.getProperty("failedCatKeyMemberGetMessagesChatKeyConfig");
    public String absentTokenMessage = property.getProperty("absentTokenMessageGetMessagesChatKeyConfig");
    public int absentTokenCode = convertStringPropertyToInt(property.getProperty("absentTokenMessageGetCodeChatKeyConfig"));
    public String failedCatKeyMessage = property.getProperty("failedCatKeyMessageMemberGetMessagesChatKeyConfig");
    public int failedCatKeyCode = convertStringPropertyToInt(property.getProperty("failedCatKeyCodeMemberGetMessagesChatKeyConfig"));
    public String nameMethod;

    public Integer failedChatKeyCode(Response response) {
        nameMethod = "failedChatKeyCode";
        MemberFailedChatKeyAllMessagesResponse memberFailedChatKeyAllMessagesResponse = response.getBody().as(MemberFailedChatKeyAllMessagesResponse.class);
        nullResponseVerification(memberFailedChatKeyAllMessagesResponse.getB(), nameMethod);
        Assert.assertTrue(memberFailedChatKeyAllMessagesResponse.getB()== failedCatKeyCode, "session detected");
        return memberFailedChatKeyAllMessagesResponse.getB();
    }

    public String failedChatKeyMessages(Response response) {
        nameMethod = "failedChatKeyMessages";
        MemberFailedChatKeyAllMessagesResponse memberFailedChatKeyAllMessagesResponse = response.getBody().as(MemberFailedChatKeyAllMessagesResponse.class);
        nullResponseVerification(memberFailedChatKeyAllMessagesResponse.getA(), nameMethod);
        Assert.assertTrue(memberFailedChatKeyAllMessagesResponse.getA().equals(failedCatKeyMessage), "session detected");
        return memberFailedChatKeyAllMessagesResponse.getA();
    }

    public Integer failedTokenCode(Response response) {
        nameMethod = "failedTokenCode";
        MemberFailedAccessTokenAllMessagesResponse failedAccessTokenAllMessagesResponse = response.getBody().as(MemberFailedAccessTokenAllMessagesResponse.class);
        nullResponseVerification(failedAccessTokenAllMessagesResponse.getB(), nameMethod);
        Assert.assertTrue(failedAccessTokenAllMessagesResponse.getB()== absentTokenCode, "session detected");
        return failedAccessTokenAllMessagesResponse.getB();
    }

    public String failedTokenMessages(Response response) {
        nameMethod = "failedTokenMessages";
        MemberFailedAccessTokenAllMessagesResponse failedAccessTokenAllMessagesResponse = response.getBody().as(MemberFailedAccessTokenAllMessagesResponse.class);
        nullResponseVerification(failedAccessTokenAllMessagesResponse.getA(), nameMethod);
        Assert.assertTrue(failedAccessTokenAllMessagesResponse.getA().equals(absentTokenMessage), "Session detected");
        return failedAccessTokenAllMessagesResponse.getA();
    }

    public Object getTripTouristTripTouristMessages(Response response) {
        nameMethod = "getTripTouristTripTouristMessages";
        MemberGetMessagesChatKeyTripTouristTripTouristResponse memberGetMessagesChatKeyTripTouristTripTouristResponse = response.getBody().as(MemberGetMessagesChatKeyTripTouristTripTouristResponse.class);
        List<Object> listMessagesTripTourist = new ArrayList<>();
        for (MemberGetMessagesChatKeyTripTouristTripTouristMessagesResponse messages: memberGetMessagesChatKeyTripTouristTripTouristResponse.getB()) {
            listMessagesTripTourist.clear();
            String message = messages.getA();
            String action = messages.getB();
            nullResponseVerification(listMessagesTripTourist.get(1), nameMethod);
            if (action != null) {
                listMessagesTripTourist.add(message);
                listMessagesTripTourist.add(action);
                Assert.assertTrue(listMessagesTripTourist.get(1) != null, "messages is not detected");
            }
        }
        return listMessagesTripTourist;
    }

    public Integer getTriTouristTripTouristChatId(Response response){
        nameMethod = "getTriTouristTripTouristChatId";
        MemberGetMessagesChatKeyTripTouristTripTouristResponse memberGetMessagesChatKeyTripTouristTripTouristResponse = response.getBody().as(MemberGetMessagesChatKeyTripTouristTripTouristResponse.class);
        nullResponseVerification(memberGetMessagesChatKeyTripTouristTripTouristResponse.getA(), nameMethod);
        Assert.assertTrue(memberGetMessagesChatKeyTripTouristTripTouristResponse.getA() != null, "chat id is not available");
        return memberGetMessagesChatKeyTripTouristTripTouristResponse.getA();
    }

    public Object getGuideTripTouristMessages(Response response){
        nameMethod = "getGuideTripTouristMessages";
        MemberGetMessagesChatKeyGuideTripTouristResponse memberGetMessagesChatKeyGuideTripTouristResponse = response.getBody().as(MemberGetMessagesChatKeyGuideTripTouristResponse.class);
        List<Object> listMessages = new ArrayList<>();
        for(MemberGetMessagesChatKeyGuideTripTouristMessagesResponse messages: memberGetMessagesChatKeyGuideTripTouristResponse.getB()){
            listMessages.clear();
            String message = messages.getA();
            String action = messages.getB();
            nullResponseVerification(action, nameMethod);
            if(action != null){
                listMessages.add(message);
                listMessages.add(action);
                Assert.assertTrue(listMessages.get(1) != null, "messages is not detected");
            }
        }
        return listMessages;
    }

    public Integer getGuideTripTouristChatId(Response response) {
        nameMethod = "getGuideTripTouristChatId";
        MemberGetMessagesChatKeyGuideTripTouristResponse memberGetMessagesChatKeyGuideTripTouristResponse = response.getBody().as(MemberGetMessagesChatKeyGuideTripTouristResponse.class);
        nullResponseVerification(memberGetMessagesChatKeyGuideTripTouristResponse.getA(), nameMethod);
        Assert.assertTrue(memberGetMessagesChatKeyGuideTripTouristResponse.getA() != null, "chat is not available");
        return memberGetMessagesChatKeyGuideTripTouristResponse.getA();
    }

    public List<Object> getReturnSuccessGuide(Response response){
        ReturnSuccessGuideResponse[] returnSuccessGuideResponses = response.getBody().as(ReturnSuccessGuideResponse[].class);
        List<Object> returnSuccessGuide = new ArrayList<>();
        for(ReturnSuccessGuideResponse successTypeGuide: returnSuccessGuideResponses){
            Integer userId = successTypeGuide.getA();
            if(successTypeGuide.getD() != null){
                if(successTypeGuide.getE().equals("guide")) {
                    returnSuccessGuide.add(userId);
                }
            }
        }
        return returnSuccessGuide;
    }

    public List<Object> getReturnSuccessTripTourist(Response response){
        ReturnSuccessTripTouristResponse[] returnSuccessTripTouristResponses = response.getBody().as(ReturnSuccessTripTouristResponse[].class);
        List<Object> returnSuccessTripTourist = new ArrayList<>();
        for(ReturnSuccessTripTouristResponse successTypeTripTourist: returnSuccessTripTouristResponses){
            Integer userId = successTypeTripTourist.getA();
            if(successTypeTripTourist.getD() != null){
                if(successTypeTripTourist.getE().equals("trip_tourist")) {
                    returnSuccessTripTourist.add(userId);
                }
            }
        }
        return returnSuccessTripTourist;
    }

    public Integer getChatId(Response response){
        nameMethod = "getChatId";
        MemberGetMessagesChatKeyResponse memberGetMessagesChatKeyResponse = response.getBody().as(MemberGetMessagesChatKeyResponse.class);
        nullResponseVerification(memberGetMessagesChatKeyResponse.getA(), nameMethod);
        Assert.assertTrue(memberGetMessagesChatKeyResponse.getA() != null, "chat is not available");
        return memberGetMessagesChatKeyResponse.getA();
    }
}