package GetMemberGetMessagesChatKeyInstruction.GuideTripTouristMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberGetMessagesChatKeyGuideTripTouristResponse {
    @JsonProperty(value = "a")
    public Integer a;

    @JsonProperty(value = "b")
    public List<MemberGetMessagesChatKeyGuideTripTouristMessagesResponse> b;

    @JsonProperty(value = "c")
    public MemberGetMessagesChatKeyGuideTripTouristChatModelResponse c;

    public Integer getA() {
        return a;
    }

    public List<MemberGetMessagesChatKeyGuideTripTouristMessagesResponse> getB() {
        return b;
    }

    public MemberGetMessagesChatKeyGuideTripTouristChatModelResponse getC() {
        return c;
    }
}
