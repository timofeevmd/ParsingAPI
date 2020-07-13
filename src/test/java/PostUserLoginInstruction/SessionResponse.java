package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionResponse {

    @JsonProperty(value = "session")
    private Session session;

    public Session getSession() {
        return session;
    }

}
