package com.Insurance.Claims.Insurance.Models;

import java.sql.Date;

public class InsurancePolicy {
    private int iplcId;
    private int iplcCustId;
    private Date iplcCDate;
    private double iplcSumAssured;
    private Date iplcApplicableDate;
    private int iplcInspId;
    private double iplcYrlyPremAmount;
    private Date iplcExpDate;
    private int iplcAgntId;

    // Default constructor
    public InsurancePolicy() {
    }

    // Parameterized constructor
    public InsurancePolicy(int iplcId, int iplcCustId, Date iplcCDate, double iplcSumAssured,
                           Date iplcApplicableDate, int iplcInspId, double iplcYrlyPremAmount,
                           Date iplcExpDate, int iplcAgntId) {
        this.iplcId = iplcId;
        this.iplcCustId = iplcCustId;
        this.iplcCDate = iplcCDate;
        this.iplcSumAssured = iplcSumAssured;
        this.iplcApplicableDate = iplcApplicableDate;
        this.iplcInspId = iplcInspId;
        this.iplcYrlyPremAmount = iplcYrlyPremAmount;
        this.iplcExpDate = iplcExpDate;
        this.iplcAgntId = iplcAgntId;
    }

    // Getter for iplcId
    public int getIplcId() {
        return iplcId;
    }

    // Setter for iplcId
    public void setIplcId(int iplcId) {
        this.iplcId = iplcId;
    }

    // Getter for iplcCustId
    public int getIplcCustId() {
        return iplcCustId;
    }

    // Setter for iplcCustId
    public void setIplcCustId(int iplcCustId) {
        this.iplcCustId = iplcCustId;
    }

    // Getter for iplcCDate
    public Date getIplcCDate() {
        return iplcCDate;
    }

    // Setter for iplcCDate
    public void setIplcCDate(Date iplcCDate) {
        this.iplcCDate = iplcCDate;
    }

    // Getter for iplcSumAssured
    public double getIplcSumAssured() {
        return iplcSumAssured;
    }

    // Setter for iplcSumAssured
    public void setIplcSumAssured(double iplcSumAssured) {
        this.iplcSumAssured = iplcSumAssured;
    }

    // Getter for iplcApplicableDate
    public Date getIplcApplicableDate() {
        return iplcApplicableDate;
    }

    // Setter for iplcApplicableDate
    public void setIplcApplicableDate(Date iplcApplicableDate) {
        this.iplcApplicableDate = iplcApplicableDate;
    }

    // Getter for iplcInspId
    public int getIplcInspId() {
        return iplcInspId;
    }

    // Setter for iplcInspId
    public void setIplcInspId(int iplcInspId) {
        this.iplcInspId = iplcInspId;
    }

    // Getter for iplcYrlyPremAmount
    public double getIplcYrlyPremAmount() {
        return iplcYrlyPremAmount;
    }

    // Setter for iplcYrlyPremAmount
    public void setIplcYrlyPremAmount(double iplcYrlyPremAmount) {
        this.iplcYrlyPremAmount = iplcYrlyPremAmount;
    }

    // Getter for iplcExpDate
    public Date getIplcExpDate() {
        return iplcExpDate;
    }

    // Setter for iplcExpDate
    public void setIplcExpDate(Date iplcExpDate) {
        this.iplcExpDate = iplcExpDate;
    }

    // Getter for iplcAgntId
    public int getIplcAgntId() {
        return iplcAgntId;
    }

    // Setter for iplcAgntId
    public void setIplcAgntId(int iplcAgntId) {
        this.iplcAgntId = iplcAgntId;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
               "iplcId=" + iplcId +
               ", iplcCustId=" + iplcCustId +
               ", iplcCDate=" + iplcCDate +
               ", iplcSumAssured=" + iplcSumAssured +
               ", iplcApplicableDate=" + iplcApplicableDate +
               ", iplcInspId=" + iplcInspId +
               ", iplcYrlyPremAmount=" + iplcYrlyPremAmount +
               ", iplcExpDate=" + iplcExpDate +
               ", iplcAgntId=" + iplcAgntId +
               '}';
    }
}

