package org.proper.school.Entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal extends Staff{



    private  String yearsOfExperience;



    public Principal(String firstName,String lastName, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String staffID, String qualification, String daysOnDuty, String accountNumber, String gender) {
        super(firstName,lastName, stateOfOrigin, email, phoneNumber, address, dateOfBirth, staffID, qualification, daysOnDuty, accountNumber, gender);
    }



    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "yearsOfExperience='" + yearsOfExperience + '\'' +
                '}';
    }
}
