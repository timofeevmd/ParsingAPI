package GetMemberGetMessagesChatKeyInstruction.AllMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberGetMessageChatKeyChatModelResponse {
    @JsonProperty(value = "a")
    public String a;

    @JsonProperty(value = "b")
    public String b;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}
