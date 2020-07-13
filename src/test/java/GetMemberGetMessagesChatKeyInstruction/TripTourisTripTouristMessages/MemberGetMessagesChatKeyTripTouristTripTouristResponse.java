package GetMemberGetMessagesChatKeyInstruction.TripTourisTripTouristMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberGetMessagesChatKeyTripTouristTripTouristResponse {
    @JsonProperty(value = "a")
    public Integer a;

    @JsonProperty(value = "b")
    public List<MemberGetMessagesChatKeyTripTouristTripTouristMessagesResponse> b;

    @JsonProperty(value = "c")
    public MemberGetMessagesChatKeyTripTouristTripTouristChatModelResponse c;

    public Integer getA() {
        return a;
    }

    public List<MemberGetMessagesChatKeyTripTouristTripTouristMessagesResponse> getB() {
        return b;
    }

    public MemberGetMessagesChatKeyTripTouristTripTouristChatModelResponse getC() {
        return c;
    }
}
