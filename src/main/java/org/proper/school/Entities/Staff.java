package org.proper.school.Entities;

import java.time.LocalDate;

public class Staff extends User {

    private String StaffID;

    private String qualification;

    private String daysOnDuty;

    private String accountNumber;

    private String gender;

    public Staff(){
    }

    public Staff(String firstname, String lastname, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String teacherid, String staffID, String qualification, String daysOnDuty, String accountNumber) {
        super(firstname, lastname, stateOfOrigin, email, phoneNumber, address, dateOfBirth, teacherid);
        StaffID = staffID;
        this.qualification = qualification;
        this.daysOnDuty = daysOnDuty;
        this.accountNumber = accountNumber;
        this.gender = gender;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String staffID) {
        StaffID = staffID;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDaysOnDuty() {
        return daysOnDuty;
    }

    public void setDaysOnDuty(String daysOnDuty) {
        this.daysOnDuty = daysOnDuty;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "StaffID='" + StaffID + '\'' +
                ", qualification='" + qualification + '\'' +
                ", daysOnDuty='" + daysOnDuty + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
