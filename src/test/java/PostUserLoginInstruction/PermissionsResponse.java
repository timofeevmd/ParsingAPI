package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PermissionsResponse {

    @JsonProperty(value = "permissions")
    private Permissions permissions;

    public Permissions getPermissions() {
        return permissions;
    }

}
