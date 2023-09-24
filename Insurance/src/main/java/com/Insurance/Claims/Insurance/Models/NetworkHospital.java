package com.Insurance.Claims.Insurance.Models;

import java.sql.Date;

public class NetworkHospital {
    private int hospId;
    private String hospTitle;
    private String hospLocation;
    private String hospAddress;
    private String hospContactNumber;
    private int hospPincode;
    private Date hospLuudate;
    private int hospLuuser;

    // Default constructor
    public NetworkHospital() {
    }

    // Parameterized constructor
    public NetworkHospital(int hospId, String hospTitle, String hospLocation, String hospAddress,
                           String hospContactNumber, int hospPincode, Date hospLuudate, int hospLuuser) {
        this.hospId = hospId;
        this.hospTitle = hospTitle;
        this.hospLocation = hospLocation;
        this.hospAddress = hospAddress;
        this.hospContactNumber = hospContactNumber;
        this.hospPincode = hospPincode;
        this.hospLuudate = hospLuudate;
        this.hospLuuser = hospLuuser;
    }

    // Getter for hospId
    public int getHospId() {
        return hospId;
    }

    // Setter for hospId
    public void setHospId(int hospId) {
        this.hospId = hospId;
    }

    // Getter for hospTitle
    public String getHospTitle() {
        return hospTitle;
    }

    // Setter for hospTitle
    public void setHospTitle(String hospTitle) {
        this.hospTitle = hospTitle;
    }

    // Getter for hospLocation
    public String getHospLocation() {
        return hospLocation;
    }

    // Setter for hospLocation
    public void setHospLocation(String hospLocation) {
        this.hospLocation = hospLocation;
    }

    // Getter for hospAddress
    public String getHospAddress() {
        return hospAddress;
    }

    // Setter for hospAddress
    public void setHospAddress(String hospAddress) {
        this.hospAddress = hospAddress;
    }

    // Getter for hospContactNumber
    public String getHospContactNumber() {
        return hospContactNumber;
    }

    // Setter for hospContactNumber
    public void setHospContactNumber(String hospContactNumber) {
        this.hospContactNumber = hospContactNumber;
    }

    // Getter for hospPincode
    public int getHospPincode() {
        return hospPincode;
    }

    // Setter for hospPincode
    public void setHospPincode(int hospPincode) {
        this.hospPincode = hospPincode;
    }

    // Getter for hospLuudate
    public Date getHospLuudate() {
        return hospLuudate;
    }

    // Setter for hospLuudate
    public void setHospLuudate(Date hospLuudate) {
        this.hospLuudate = hospLuudate;
    }

    // Getter for hospLuuser
    public int getHospLuuser() {
        return hospLuuser;
    }

    // Setter for hospLuuser
    public void setHospLuuser(int hospLuuser) {
        this.hospLuuser = hospLuuser;
    }

    @Override
    public String toString() {
        return "NetworkHospital{" +
               "hospId=" + hospId +
               ", hospTitle='" + hospTitle + '\'' +
               ", hospLocation='" + hospLocation + '\'' +
               ", hospAddress='" + hospAddress + '\'' +
               ", hospContactNumber='" + hospContactNumber + '\'' +
               ", hospPincode=" + hospPincode +
               ", hospLuudate=" + hospLuudate +
               ", hospLuuser=" + hospLuuser +
               '}';
    }
}
