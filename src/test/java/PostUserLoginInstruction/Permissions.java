package PostUserLoginInstruction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Permissions {

    @JsonProperty(value = "can_view_dashboard")
    private String canViewDashboard;

    @JsonProperty(value = "can_active_trips")
    private String canActiveTrips;

    @JsonProperty(value = "can_soon_trips")
    private String canSoonTrips;

    @JsonProperty(value = "can_accounts_management")
    private String canAccountsManagement;

    @JsonProperty(value = "can_new_trip")
    private String canNewTrip;

    @JsonProperty(value = "can_crud_trip_lists")
    private String canCrudTripLists;

    @JsonProperty(value = "can_trip_members_management")
    private String canTripMembersManagement;

    @JsonProperty(value = "can_user_management")
    private String canUserManagement;

    @JsonProperty(value = "can_group_management")
    private String canGroupManagement;

    @JsonProperty(value = "can_view_account")
    private String canViewAccount;

    @JsonProperty(value = "can_view_branch")
    private String canViewBranch;

    @JsonProperty(value = "can_view_trip")
    private String canViewTrip;

    @JsonProperty(value = "can_view_trip_list")
    private String canViewTripList;

    @JsonProperty(value = "can_view_branch_list")
    private String canViewBranchList;

    @JsonProperty(value = "can_view_account_list")
    private String canViewAccountList;

    @JsonProperty(value = "can_create_branch")
    private String canCreateBranch;

    @JsonProperty(value = "can_create_trip")
    private String canCreateTrip;

    @JsonProperty(value = "can_update_account")
    private String canUpdateAccount;

    @JsonProperty(value = "can_update_branch")
    private String canUpdateBranch;

    @JsonProperty(value = "can_update_trip")
    private String canUpdateTrip;

    @JsonProperty(value = "can_delete_branch")
    private String canDeleteBranch;

    @JsonProperty(value = "can_delete_trip")
    private String canDeleteTrip;

    @JsonProperty(value = "can_get_managers")
    private String canGetManagers;

    @JsonProperty(value = "can_get_user_by_id")
    private String canGetUserById;

    @JsonProperty(value = "can_update_user")
    private String canUpdateUser;

    @JsonProperty(value = "can_create_trip_tourist")
    private String canCreateTripTourist;

    @JsonProperty(value = "create_members_with_import")
    private String createMembersWithImport;

    @JsonProperty(value = "find_members_by_phone")
    private String findMembersByPhone;

    @JsonProperty(value = "exist_phone")
    private String existPhone;

    @JsonProperty(value = "edit_member")
    private String editMember;

    @JsonProperty(value = "get_positions_managers")
    private String getPositionsManagers;

    @JsonProperty(value = "can_get_trip_by_id")
    private String canGetTripById;

    @JsonProperty(value = "can_create_user")
    private String canCreateUser;

    @JsonProperty(value = "can_get_user")
    private String canGetUser;

    @JsonProperty(value = "can_get_users")
    private String canGetUsers;

    @JsonProperty(value = "can_delete_user")
    private String canDeleteUser;

    @JsonProperty(value = "can_manage_chat")
    private String canManageChat;

    @JsonProperty(value = "account_list_new")
    private String accountListNew;

    @JsonProperty(value = "user_list_new")
    private String userListNew;

    public String getCanViewDashboard() {
        return canViewDashboard;
    }

    public String getCanActiveTrips() {
        return canActiveTrips;
    }

    public String getCanSoonTrips() {
        return canSoonTrips;
    }

    public String getCanAccountsManagement() {
        return canAccountsManagement;
    }

    public String getCanNewTrip() {
        return canNewTrip;
    }

    public String getCanCrudTripLists() {
        return canCrudTripLists;
    }

    public String getCanTripMembersManagement() {
        return canTripMembersManagement;
    }

    public String getCanUserManagement() {
        return canUserManagement;
    }

    public String getCanGroupManagement() {
        return canGroupManagement;
    }

    public String getCanViewAccount() {
        return canViewAccount;
    }

    public String getCanViewBranch() {
        return canViewBranch;
    }

    public String getCanViewTrip() {
        return canViewTrip;
    }

    public String getCanViewTripList() {
        return canViewTripList;
    }

    public String getCanViewBranchList() {
        return canViewBranchList;
    }

    public String getCanViewAccountList() {
        return canViewAccountList;
    }

    public String getCanCreateBranch() {
        return canCreateBranch;
    }

    public String getCanCreateTrip() {
        return canCreateTrip;
    }

    public String getCanUpdateAccount() {
        return canUpdateAccount;
    }

    public String getCanUpdateBranch() {
        return canUpdateBranch;
    }

    public String getCanUpdateTrip() {
        return canUpdateTrip;
    }

    public String getCanDeleteBranch() {
        return canDeleteBranch;
    }

    public String getCanDeleteTrip() {
        return canDeleteTrip;
    }

    public String getCanGetManagers() {
        return canGetManagers;
    }

    public String getCanGetUserById() {
        return canGetUserById;
    }

    public String getCanUpdateUser() {
        return canUpdateUser;
    }

    public String getCanCreateTripTourist() {
        return canCreateTripTourist;
    }

    public String getCreateMembersWithImport() {
        return createMembersWithImport;
    }

    public String getFindMembersByPhone() {
        return findMembersByPhone;
    }

    public String getExistPhone() {
        return existPhone;
    }

    public String getEditMember() {
        return editMember;
    }

    public String getGetPositionsManagers() {
        return getPositionsManagers;
    }

    public String getCanGetTripById() {
        return canGetTripById;
    }

    public String getCanCreateUser() {
        return canCreateUser;
    }

    public String getCanGetUser() {
        return canGetUser;
    }

    public String getCanGetUsers() {
        return canGetUsers;
    }

    public String getCanDeleteUser() {
        return canDeleteUser;
    }

    public String getCanManageChat() {
        return canManageChat;
    }

    public String getAccountListNew() {
        return accountListNew;
    }

    public String getUserListNew() {
        return userListNew;
    }
}
