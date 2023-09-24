package com.Insurance.Claims.Insurance.Models;

public class InsurancePackage {
    private int inspId;
    private String inspTitle;
    private String inspDesc;
    private String inspStatus;
    private double inspRangeStart;
    private double inspRangeEnd;
    private int inspAgeLimitStart;
    private int inspAgeLimitEnd;

    // Default constructor
    public InsurancePackage() {
    }

    // Parameterized constructor
    public InsurancePackage(int inspId, String inspTitle, String inspDesc, String inspStatus,
                            double inspRangeStart, double inspRangeEnd,
                            int inspAgeLimitStart, int inspAgeLimitEnd) {
        this.inspId = inspId;
        this.inspTitle = inspTitle;
        this.inspDesc = inspDesc;
        this.inspStatus = inspStatus;
        this.inspRangeStart = inspRangeStart;
        this.inspRangeEnd = inspRangeEnd;
        this.inspAgeLimitStart = inspAgeLimitStart;
        this.inspAgeLimitEnd = inspAgeLimitEnd;
    }

    // Getter for inspId
    public int getInspId() {
        return inspId;
    }

    // Setter for inspId
    public void setInspId(int inspId) {
        this.inspId = inspId;
    }

    // Getter for inspTitle
    public String getInspTitle() {
        return inspTitle;
    }

    // Setter for inspTitle
    public void setInspTitle(String inspTitle) {
        this.inspTitle = inspTitle;
    }

    // Getter for inspDesc
    public String getInspDesc() {
        return inspDesc;
    }

    // Setter for inspDesc
    public void setInspDesc(String inspDesc) {
        this.inspDesc = inspDesc;
    }

    // Getter for inspStatus
    public String getInspStatus() {
        return inspStatus;
    }

    // Setter for inspStatus
    public void setInspStatus(String inspStatus) {
        this.inspStatus = inspStatus;
    }

    // Getter for inspRangeStart
    public double getInspRangeStart() {
        return inspRangeStart;
    }

    // Setter for inspRangeStart
    public void setInspRangeStart(double inspRangeStart) {
        this.inspRangeStart = inspRangeStart;
    }

    // Getter for inspRangeEnd
    public double getInspRangeEnd() {
        return inspRangeEnd;
    }

    // Setter for inspRangeEnd
    public void setInspRangeEnd(double inspRangeEnd) {
        this.inspRangeEnd = inspRangeEnd;
    }

    // Getter for inspAgeLimitStart
    public int getInspAgeLimitStart() {
        return inspAgeLimitStart;
    }

    // Setter for inspAgeLimitStart
    public void setInspAgeLimitStart(int inspAgeLimitStart) {
        this.inspAgeLimitStart = inspAgeLimitStart;
    }

    // Getter for inspAgeLimitEnd
    public int getInspAgeLimitEnd() {
        return inspAgeLimitEnd;
    }

    // Setter for inspAgeLimitEnd
    public void setInspAgeLimitEnd(int inspAgeLimitEnd) {
        this.inspAgeLimitEnd = inspAgeLimitEnd;
    }

    @Override
    public String toString() {
        return "InsurancePackage{" +
               "inspId=" + inspId +
               ", inspTitle='" + inspTitle + '\'' +
               ", inspDesc='" + inspDesc + '\'' +
               ", inspStatus='" + inspStatus + '\'' +
               ", inspRangeStart=" + inspRangeStart +
               ", inspRangeEnd=" + inspRangeEnd +
               ", inspAgeLimitStart=" + inspAgeLimitStart +
               ", inspAgeLimitEnd=" + inspAgeLimitEnd +
               '}';
    }
}

