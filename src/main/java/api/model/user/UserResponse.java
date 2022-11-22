package api.model.user;

import api.model.Project.CustomField;
import api.model.Project.Membership;

import java.util.List;

public class UserResponse {
    private String id;
    private String email;
    private String name;
    private Membership membership;
    private String profilePicture;
    private String activeWorkspace;
    private String defaultWorkspace;
    private Settings settings;
    private String status;
    private List<CustomField> customFields;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getActiveWorkspace() {
        return activeWorkspace;
    }

    public void setActiveWorkspace(String activeWorkspace) {
        this.activeWorkspace = activeWorkspace;
    }

    public String getDefaultWorkspace() {
        return defaultWorkspace;
    }

    public void setDefaultWorkspace(String defaultWorkspace) {
        this.defaultWorkspace = defaultWorkspace;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }
}
