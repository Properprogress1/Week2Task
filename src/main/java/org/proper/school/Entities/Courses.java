package org.proper.school.Entities;

public class Courses {

    private String courseName;

    private String gradingScore;


    public Courses(String courseName, String gradingScore) {
        this.courseName = courseName;
        this.gradingScore = gradingScore;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGradingScore() {
        return gradingScore;
    }

    public void setGradingScore(String gradingScore) {
        this.gradingScore = gradingScore;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", gradingScore='" + gradingScore + '\'' +
                '}';
    }
}
