package org.proper.school.Entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.*;

public class Teachers extends Staff{

    private String subjectsTaken;
    private String TeacherId;

    private String firstName;

    private String lastName;

    private String email;

    private int numberOfClassesTeaching;

    private String name;
    public Teachers(){

    }

    public Teachers(String firstname, String lastname, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String teacherid, String staffID, String qualification, String daysOnDuty, String accountNumber, String subjectsTaken, String teacherId, String firstName, String lastName, String email1, int numberOfClassesTeaching, String name) {
        super(firstname, lastname, stateOfOrigin, email, phoneNumber, address, dateOfBirth, teacherid, staffID, qualification, daysOnDuty, accountNumber);
        this.subjectsTaken = subjectsTaken;
        TeacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email1;
        this.numberOfClassesTeaching = numberOfClassesTeaching;
        this.name = name;
    }

    public String getSubjectsTaken() {
        return subjectsTaken;
    }

    public void setSubjectsTaken(String subjectsTaken) {
        this.subjectsTaken = subjectsTaken;
    }

    public String getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(String teacherId) {
        TeacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfClassesTeaching() {
        return numberOfClassesTeaching;
    }

    public void setNumberOfClassesTeaching(int numberOfClassesTeaching) {
        this.numberOfClassesTeaching = numberOfClassesTeaching;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "subjectsTaken='" + subjectsTaken + '\'' +
                ", TeacherId='" + TeacherId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", numberOfClassesTeaching=" + numberOfClassesTeaching +
                ", name='" + name + '\'' +
                '}';
    }
}




