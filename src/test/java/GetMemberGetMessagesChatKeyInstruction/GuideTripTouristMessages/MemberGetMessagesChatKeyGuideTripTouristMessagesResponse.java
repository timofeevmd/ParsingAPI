package GetMemberGetMessagesChatKeyInstruction.GuideTripTouristMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberGetMessagesChatKeyGuideTripTouristMessagesResponse {
    @JsonProperty(value = "a")
    public String a;

    @JsonProperty(value = "b")
    public String b;

    @JsonProperty(value = "c")
    public Integer c;

    @JsonProperty(value = "d")
    public int d;

    @JsonProperty(value = "e")
    public int e;

    @JsonProperty(value = "f")
    public String f;

    @JsonProperty(value = "g")
    public String g;

    @JsonProperty(value = "h")
    public String h;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public String getF() {
        return f;
    }

    public String getG() {
        return g;
    }

    public String getH() {
        return h;
    }
}
