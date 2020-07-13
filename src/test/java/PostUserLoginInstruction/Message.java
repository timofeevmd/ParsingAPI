package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "code")
    private int code;

    public String getMessageValue() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCodeValue() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
