package com.Insurance.Claims.Insurance.Models;

public class InsurancePolicyPayment {
    private int inppId;
    private int inppIplcId;
    private String inppTransId;
    private double inppAmount;
    private String inppPaymode;

    // Default constructor
    public InsurancePolicyPayment() {
    }

    // Parameterized constructor
    public InsurancePolicyPayment(int inppId, int inppIplcId, String inppTransId,
                                  double inppAmount, String inppPaymode) {
        this.inppId = inppId;
        this.inppIplcId = inppIplcId;
        this.inppTransId = inppTransId;
        this.inppAmount = inppAmount;
        this.inppPaymode = inppPaymode;
    }

    // Getter for inppId
    public int getInppId() {
        return inppId;
    }

    // Setter for inppId
    public void setInppId(int inppId) {
        this.inppId = inppId;
    }

    // Getter for inppIplcId
    public int getInppIplcId() {
        return inppIplcId;
    }

    // Setter for inppIplcId
    public void setInppIplcId(int inppIplcId) {
        this.inppIplcId = inppIplcId;
    }

    // Getter for inppTransId
    public String getInppTransId() {
        return inppTransId;
    }

    // Setter for inppTransId
    public void setInppTransId(String inppTransId) {
        this.inppTransId = inppTransId;
    }

    // Getter for inppAmount
    public double getInppAmount() {
        return inppAmount;
    }

    // Setter for inppAmount
    public void setInppAmount(double inppAmount) {
        this.inppAmount = inppAmount;
    }

    // Getter for inppPaymode
    public String getInppPaymode() {
        return inppPaymode;
    }

    // Setter for inppPaymode
    public void setInppPaymode(String inppPaymode) {
        this.inppPaymode = inppPaymode;
    }

    @Override
    public String toString() {
        return "InsurancePolicyPayment{" +
               "inppId=" + inppId +
               ", inppIplcId=" + inppIplcId +
               ", inppTransId='" + inppTransId + '\'' +
               ", inppAmount=" + inppAmount +
               ", inppPaymode='" + inppPaymode + '\'' +
               '}';
    }
}

