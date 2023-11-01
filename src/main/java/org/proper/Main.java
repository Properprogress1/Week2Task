package org.proper;

import org.proper.school.Entities.*;
import org.proper.school.serviceImplimentation.PrincipalServiceImp;
import org.proper.school.utility.StudentsUtil;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.proper.school.utility.StudentsUtil.readStudentInfo;
import static org.proper.school.utility.TeachersUtil.readTeachersInfo;

public class Main {
    public static void main(String[] args) throws IOException {


        LocalDate principalDob = LocalDate.of(1996, 8, 15);
        LocalDate nonAcademicStaffDOB = LocalDate.of(1990, 9, 8);


       Applicants applicant2 = new Applicants("Abdul","Kareem","Edo","abdul@gmail.com",
               965433126L, "no 54 aguiyi street maitama", LocalDate.of(1995, 7, 8),
               "ret123", "ty245Rd", true,
               76, "6", 18);




       Principal principal = new Principal("Latief", "Ejyke",
               "Kwara","jyk@gmail.com", 70895543L, "no 6 ezimo street lagos",
               LocalDate.of(1985, 6, 18),"342Ds", "Bsc,Msc","5",
               "565544890", "Male");



       NonAcademicStaff ns = new NonAcademicStaff("Salimi","Frances", "Bayelsa",
               "sfrances@gmail.com", 80433567L, "no 45 flat 5 ajaku lokoja",
               LocalDate.of(1989, 9, 21), "Az23i", "WAEC", "7",
               "667548931", "Female", "Cleaner","Mr Bawa Eju");



        Teachers teachers = new Teachers("Adebayo", "Chima", "Oyo",
                "adebayo@gmail.com",90554356773L,
                "no 6 ebiyi street",LocalDate.of(1989, 9, 21),
                "454WEQ", "QER4390", "Msc, Bsc",
                "5", "889971098", "Physics and Maths",
                "RTQ87923", "Adebayo", "Chima",
                "adechima@gmail.com",3, "Deba");



        PrincipalServiceImp principalServiceImp = new PrincipalServiceImp();

        System.out.println(principalServiceImp.admitStudent(principal,applicant2));

/*

        NonAcademicStaff Sweep = new NonAcademicStaff("Asanatu Golo",
                "Jigawa", "asanagolo@gmail.com",
                +23496501994L, "shaki street close to etu bank, back of alitu hospital Lagos",
                LocalDate.of(1995, 7, 8), "sdAz23",
                "WAEC", "6", "567665",
                "FEMALE", "Cleaner", "Mrs Agatu Cula");
*/



        Classez newClass = new Classez("Physics Department", "Mr Wick",
                56, "2021/2022");
        System.out.println("----------------------------------------TEACHERS DATA-------------------------");
List<Teachers>listOfTeachers =readTeachersInfo("/Users/mac/Documents/Week1Java/SchoolProject/src/main/java/org/proper/school/watweneed/DatasetforseedingTeachers.csv","Teachers");
        List<Students>listOfStudents = readStudentInfo("/Users/mac/Documents/Week1Java/SchoolProject/src/main/java/org/proper/school/watweneed/Dataset2.csv");

        System.out.println("     ");

    }



    }

