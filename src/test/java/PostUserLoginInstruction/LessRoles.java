package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessRoles {

    @JsonProperty(value = "level")
    private int level;

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "name")
    private String name;

    public int getLevel() {
        return level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
