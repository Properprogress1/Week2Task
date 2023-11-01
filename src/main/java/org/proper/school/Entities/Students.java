package org.proper.school.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Students extends User{

    private String ClassOfStudent;

    private int studentScore;

    private Boolean isBadBehaviour;

    private String StudentId;

    private String GuardianEmail1;

    private String GuardianEmail2;

    private String IsArchieved;

    private String IsDeleted;

    private int Gradelevel;


    public Students(String firstname, String lastname, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String teacherid, String classOfStudent, int studentScore, Boolean isBadBehaviour, String studentId, String guardianEmail1, String guardianEmail2, String isArchieved, String isDeleted, int gradelevel) {
        super(firstname, lastname, stateOfOrigin, email, phoneNumber, address, dateOfBirth, teacherid);
        ClassOfStudent = classOfStudent;
        this.studentScore = studentScore;
        this.isBadBehaviour = isBadBehaviour;
        StudentId = studentId;
        GuardianEmail1 = guardianEmail1;
        GuardianEmail2 = guardianEmail2;
        IsArchieved = isArchieved;
        IsDeleted = isDeleted;
        Gradelevel = gradelevel;
    }

    public String getClassOfStudent() {
        return ClassOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        ClassOfStudent = classOfStudent;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

    public Boolean getBadBehaviour() {
        return isBadBehaviour;
    }

    public void setBadBehaviour(Boolean badBehaviour) {
        isBadBehaviour = badBehaviour;
    }

    @Override
    public String toString() {
        return "Students{" +
                "ClassOfStudent='" + ClassOfStudent + '\'' +
                ", studentScore=" + studentScore +
                ", isBadBehaviour=" + isBadBehaviour +
                '}';
    }
}

