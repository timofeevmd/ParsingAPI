package GetMemberGetMessagesChatKeyInstruction.AllMessages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberGetMessagesChatKeyMessagesResponse {
    @JsonProperty(value = "a")
    public String a;

    @JsonProperty(value = "b")
    public String b;

    @JsonProperty(value = "c")
    public String c;

    @JsonProperty(value = "d")
    public int d;

    @JsonProperty(value = "e")
    public int e;

    @JsonProperty(value = "f")
    public String f;

    @JsonProperty(value = "i")
    public String i;

    @JsonProperty(value = "j")
    public String j;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
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

    public String getI() {
        return i;
    }

    public String getJ() {
        return j;
    }
}
