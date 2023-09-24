package com.Insurance.Claims.Insurance.Models;

public class Disease {
    private int discId;
    private String discName;
    private String discIcdCode;
    private String discDesc;
    private String discStatus;

    // Default constructor
    public Disease() {
    }

    // Parameterized constructor
    public Disease(int discId, String discName, String discIcdCode, String discDesc, String discStatus) {
        this.discId = discId;
        this.discName = discName;
        this.discIcdCode = discIcdCode;
        this.discDesc = discDesc;
        this.discStatus = discStatus;
    }

    // Getter for discId
    public int getDiscId() {
        return discId;
    }

    // Setter for discId
    public void setDiscId(int discId) {
        this.discId = discId;
    }

    // Getter for discName
    public String getDiscName() {
        return discName;
    }

    // Setter for discName
    public void setDiscName(String discName) {
        this.discName = discName;
    }

    // Getter for discIcdCode
    public String getDiscIcdCode() {
        return discIcdCode;
    }

    // Setter for discIcdCode
    public void setDiscIcdCode(String discIcdCode) {
        this.discIcdCode = discIcdCode;
    }

    // Getter for discDesc
    public String getDiscDesc() {
        return discDesc;
    }

    // Setter for discDesc
    public void setDiscDesc(String discDesc) {
        this.discDesc = discDesc;
    }

    // Getter for discStatus
    public String getDiscStatus() {
        return discStatus;
    }

    // Setter for discStatus
    public void setDiscStatus(String discStatus) {
        this.discStatus = discStatus;
    }

    @Override
    public String toString() {
        return "Disease{" +
               "discId=" + discId +
               ", discName='" + discName + '\'' +
               ", discIcdCode='" + discIcdCode + '\'' +
               ", discDesc='" + discDesc + '\'' +
               ", discStatus='" + discStatus + '\'' +
               '}';
    }
}

