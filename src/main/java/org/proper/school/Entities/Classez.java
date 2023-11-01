package org.proper.school.Entities;

public class Classez {

    private String className;

    private String FormTeacherName;

    private int numberOfStudentEnrolled;

    private String  academicYear;


    public Classez(String className, String formTeacherName, int numberOfStudentEnrolled, String academicYear) {
        this.className = className;
        FormTeacherName = formTeacherName;
        this.numberOfStudentEnrolled = numberOfStudentEnrolled;
        this.academicYear = academicYear;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFormTeacherName() {
        return FormTeacherName;
    }

    public void setFormTeacherName(String formTeacherName) {
        FormTeacherName = formTeacherName;
    }

    public int getNumberOfStudentEnrolled() {
        return numberOfStudentEnrolled;
    }

    public void setNumberOfStudentEnrolled(int numberOfStudentEnrolled) {
        this.numberOfStudentEnrolled = numberOfStudentEnrolled;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", FormTeacherName='" + FormTeacherName + '\'' +
                ", numberOfStudentEnrolled=" + numberOfStudentEnrolled +
                ", academicYear='" + academicYear + '\'' +
                '}';
    }
}
