package GetMemberGetMessagesChatKeyInstruction.FailedResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberFailedChatKeyAllMessagesResponse {
    @JsonProperty(value = "a")
    private String a;

    @JsonProperty(value = "b")
    private Integer b;

    public String getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }
}
