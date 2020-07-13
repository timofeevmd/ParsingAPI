package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessRolesResponse {

    @JsonProperty(value = "lessRoles")
    private LessRoles lessRoles;

    public LessRoles getLessRoles() {
        return lessRoles;
    }
}
