package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFailedResponse {
    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "code")
    private int code;

    public int getCodeValue() {
        return code;
    }

    public String getMessageValue() {
        return message;
    }

}




