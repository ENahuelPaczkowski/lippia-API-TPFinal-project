package api.model.timeEntry;

import java.util.List;

public class TimeEntryResponse {
    private String id;
    private String description;
    private String tagIds;
    private String userId;
    private boolean billable;
    private String taskId;
    private String projectId;
    private TimeInternal timeInternal;
    private String workspaceId;
    private boolean idLocked;
    private List<CustomFieldValues> customFieldValues;
    private String type;
    private String kioskId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TimeInternal getTimeInternal() {
        return timeInternal;
    }

    public void setTimeInternal(TimeInternal timeInternal) {
        this.timeInternal = timeInternal;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public boolean isIdLocked() {
        return idLocked;
    }

    public void setIdLocked(boolean idLocked) {
        this.idLocked = idLocked;
    }

    public List<CustomFieldValues> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<CustomFieldValues> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKioskId() {
        return kioskId;
    }

    public void setKioskId(String kioskId) {
        this.kioskId = kioskId;
    }
}
