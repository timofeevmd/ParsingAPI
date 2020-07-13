package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RolesResponse {

    @JsonProperty(value = "roles")
    private Roles roles;

    public Roles getRoles() {
        return roles;
    }

}
