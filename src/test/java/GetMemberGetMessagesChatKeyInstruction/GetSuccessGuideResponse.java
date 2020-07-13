package GetMemberGetMessagesChatKeyInstruction;

import Base.GetMemberGetMessagesChatKey;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class GetSuccessGuideResponse {
    GetMemberGetLocationTripId getMemberGetLocationTripId = new GetMemberGetLocationTripId();
    GetMemberGetMessagesChatKey getMemberGetMessagesChatKey = new GetMemberGetMessagesChatKey();
    PostMemberRegistration postMemberRegistration = new PostMemberRegistration();


    public String memberRegistrationToken(){
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

    public Response responseGetSuccessGuide(){
        String accessToken = memberRegistrationToken();
        String getRequest = getMemberGetLocationTripId.getRequest;
        int tripId = getMemberGetLocationTripId.getTripId;
        Response responseGuide = getMemberGetMessagesChatKey.parametrizeGetRequest(accessToken, getRequest + tripId);
        return responseGuide;
    }

}
