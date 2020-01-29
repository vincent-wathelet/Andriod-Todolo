package com.example.todelo.Data.Models;

public class PasswordReset {

    private String UUID;

    private User AcountId;

    private String RequestUUID;

    public PasswordReset() {
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public User getAcountId() {
        return AcountId;
    }

    public void setAcountId(User acountId) {
        AcountId = acountId;
    }

    public String getRequestUUID() {
        return RequestUUID;
    }

    public void setRequestUUID(String requestUUID) {
        RequestUUID = requestUUID;
    }
}
