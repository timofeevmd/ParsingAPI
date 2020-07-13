package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Session {

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "user_id")
    private int userId;

    @JsonProperty(value = "session")
    private String sessionValue;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @JsonProperty(value = "updated_at")
    private String updatedAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @JsonProperty(value = "created_at")
    private String createdAt;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getSessionValue() {
        return sessionValue;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
