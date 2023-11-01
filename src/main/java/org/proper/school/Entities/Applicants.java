package org.proper.school.Entities;

import java.time.LocalDate;

public class Applicants extends User{

    private String applicantId;

    private boolean isApplicantPreviousSchoolReportGood = true;

    private int testScore; //do another constructor

    private String gradeApplyingInto;

    private int age;

    public Applicants(String Firstname, String Lastname, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String teacherid, String applicantId, boolean isApplicantPreviousSchoolReportGood, int testScore, String gradeApplyingInto, int age) {
        super(Firstname, Lastname, stateOfOrigin, email, phoneNumber, address, dateOfBirth, teacherid);
        this.applicantId = applicantId;
        this.isApplicantPreviousSchoolReportGood = isApplicantPreviousSchoolReportGood;
        this.testScore = testScore;
        this.gradeApplyingInto = gradeApplyingInto;
        this.age = age;
    }

//    public Applicants(String applicantId, boolean isApplicantPreviousSchoolReportGood, int testScore, String gradeApplyingInto, int age) {
//        this.applicantId = applicantId;
//        this.isApplicantPreviousSchoolReportGood = isApplicantPreviousSchoolReportGood;
//        this.testScore = testScore;
//        this.gradeApplyingInto = gradeApplyingInto;
//        this.age = age;
//    }




    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public boolean isApplicantPreviousSchoolReportGood() {
        return isApplicantPreviousSchoolReportGood;
    }

    public void setApplicantPreviousSchoolReportGood(boolean applicantPreviousSchoolReportGood) {
        isApplicantPreviousSchoolReportGood = applicantPreviousSchoolReportGood;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public String getGradeApplyingInto() {
        return gradeApplyingInto;
    }

    public void setGradeApplyingInto(String gradeApplyingInto) {
        this.gradeApplyingInto = gradeApplyingInto;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "applicantId='" + applicantId + '\'' +
                ", isApplicantPreviousSchoolReportGood=" + isApplicantPreviousSchoolReportGood +
                ", testScore=" + testScore +
                ", gradeApplyingInto='" + gradeApplyingInto + '\'' +
                ", age=" + age +
                '}';
    }
}
