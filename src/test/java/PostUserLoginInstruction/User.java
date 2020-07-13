package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

    @JsonProperty(value = "login")
    private String login;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "phone")
    private String phone;

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "info")
    private String info;

    @JsonProperty(value = "is_sent_sms")
    private Boolean isSentSms;

    @JsonProperty(value = "device_info")
    private String deviceInfo;

    @JsonProperty(value = "is_deleted")
    private Boolean isDeleted;

    @JsonProperty(value = "is_active")
    private Boolean isActive;

    @JsonProperty(value = "reset_password_session")
    private String resetPasswordSession;

    @JsonProperty(value = "reset_password_create")
    private String resetPasswordCreate;

    @JsonProperty(value = "temporary_session")
    private String temporarySession;

    @JsonProperty(value = "temporary_session_create")
    private String temporarySessionCreate;

    @JsonProperty(value = "external_user_id")
    private String externalUserId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @JsonProperty(value = "created_at")
    private String createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @JsonProperty(value = "updated_at")
    private String updatedAt;

    @JsonProperty(value = "roles")
    private List<Roles> roles;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return info;
    }

    public Boolean getSentSms() {
        return isSentSms;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public Boolean getActive() {
        return isActive;
    }

    public String getResetPasswordSession() {
        return resetPasswordSession;
    }

    public String getResetPasswordCreate() {
        return resetPasswordCreate;
    }

    public String getTemporarySession() {
        return temporarySession;
    }

    public String getTemporarySessionCreate() {
        return temporarySessionCreate;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public List<Roles> getRoles() {
        return roles;
    }
}
