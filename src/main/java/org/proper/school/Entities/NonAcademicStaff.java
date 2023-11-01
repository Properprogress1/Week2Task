package org.proper.school.Entities;

import java.time.LocalDate;

public class NonAcademicStaff extends Staff{

    private String jobRole;

    private String guarantorName;

    public NonAcademicStaff(String firstName,String lastName, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String staffID, String qualification, String daysOnDuty, String accountNumber, String gender, String jobRole, String guarantorName) {
        super(firstName,lastName, stateOfOrigin, email, phoneNumber, address, dateOfBirth, staffID, qualification, daysOnDuty, accountNumber, gender);
        this.jobRole = jobRole;
        this.guarantorName = guarantorName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName;
    }


    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "jobRole='" + jobRole + '\'' +
                ", guarantorName='" + guarantorName + '\'' +
                '}';
    }
}
