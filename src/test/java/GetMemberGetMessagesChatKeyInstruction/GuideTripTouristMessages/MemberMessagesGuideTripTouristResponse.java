package GetMemberGetMessagesChatKeyInstruction.GuideTripTouristMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberMessagesGuideTripTouristResponse {
    @JsonProperty(value = "a")
    private MemberMessagesGuideTripTouristResponse a;

    public MemberMessagesGuideTripTouristResponse getA() {
        return a;
    }
}