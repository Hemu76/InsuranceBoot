package com.Insurance.Claims.Insurance.Models;

import java.sql.Date;

public class InsurancePolicySchedule {
    private int iplcId;
    private short iplcSIndex;
    private Date iplcDate;
    private double iplcPremium;
    private Date iplcPaidDate;

    // Default constructor
    public InsurancePolicySchedule() {
    }

    // Parameterized constructor
    public InsurancePolicySchedule(int iplcId, short iplcSIndex, Date iplcDate,
                                   double iplcPremium, Date iplcPaidDate) {
        this.iplcId = iplcId;
        this.iplcSIndex = iplcSIndex;
        this.iplcDate = iplcDate;
        this.iplcPremium = iplcPremium;
        this.iplcPaidDate = iplcPaidDate;
    }

    // Getter for iplcId
    public int getIplcId() {
        return iplcId;
    }

    // Setter for iplcId
    public void setIplcId(int iplcId) {
        this.iplcId = iplcId;
    }

    // Getter for iplcSIndex
    public short getIplcSIndex() {
        return iplcSIndex;
    }

    // Setter for iplcSIndex
    public void setIplcSIndex(short iplcSIndex) {
        this.iplcSIndex = iplcSIndex;
    }

    // Getter for iplcDate
    public Date getIplcDate() {
        return iplcDate;
    }

    // Setter for iplcDate
    public void setIplcDate(Date iplcDate) {
        this.iplcDate = iplcDate;
    }

    // Getter for iplcPremium
    public double getIplcPremium() {
        return iplcPremium;
    }

    // Setter for iplcPremium
    public void setIplcPremium(double iplcPremium) {
        this.iplcPremium = iplcPremium;
    }

    // Getter for iplcPaidDate
    public Date getIplcPaidDate() {
        return iplcPaidDate;
    }

    // Setter for iplcPaidDate
    public void setIplcPaidDate(Date iplcPaidDate) {
        this.iplcPaidDate = iplcPaidDate;
    }

    @Override
    public String toString() {
        return "InsurancePolicySchedule{" +
               "iplcId=" + iplcId +
               ", iplcSIndex=" + iplcSIndex +
               ", iplcDate=" + iplcDate +
               ", iplcPremium=" + iplcPremium +
               ", iplcPaidDate=" + iplcPaidDate +
               '}';
    }
}

