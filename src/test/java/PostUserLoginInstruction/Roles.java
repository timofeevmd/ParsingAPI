package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Roles {

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "account_id")
    private int accountId;

    @JsonProperty(value = "branch_id")
    private String branchId;

    @JsonProperty(value = "trip_id")
    private String tripId;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "level")
    private int level;

    @JsonProperty(value = "lessRoles")
    private List<LessRoles> lessRoles;

    @JsonProperty(value = "permissions")
    private List<String> permissions;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getTripId() {
        return tripId;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public List<LessRoles> getLessRoles() {
        return lessRoles;
    }

    public List<String> getPermissions() {
        return permissions;
    }
}
