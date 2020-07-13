package GetMemberGetMessagesChatKeyInstruction.AllMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberGetMessagesChatKeyResponse {
    @JsonProperty(value = "a")
    public Integer a;

    @JsonProperty(value = "b")
    public List<MemberGetMessagesChatKeyMessagesResponse> messages;

    @JsonProperty(value = "c")
    public MemberGetMessageChatKeyChatModelResponse chatModel;

    public Integer getA() {
        return a;
    }

    public List<MemberGetMessagesChatKeyMessagesResponse> getMessages() {
        return messages;
    }

    public MemberGetMessageChatKeyChatModelResponse getChatModel() {
        return chatModel;
    }
}
