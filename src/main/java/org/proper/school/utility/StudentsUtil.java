package org.proper.school.utility;


import org.proper.school.Entities.Students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsUtil{
    public static List<Students> readStudentInfo(String filepath) {
        List<Students> listOfStudents = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] col = line.split(",");
                for (int i = 0; i < col.length; i++) {
                    if (col[i].isBlank()) {
                        col[i] = null;
                    }
                }
                if (col.length == 7) {
                    Students students = new Students();
                    students.setStudentId(col[0].trim());
                    students.setFirstname(col[1].trim());
                    students.setLastname(col[2].trim());
                    students.setGradelevel(Integer.parseInt(col[3].trim()));
                    students.setEmail(col[4].trim());
                    students.setGuardianEmail1(col[5].trim());
                    students.setGuardianEmail2(col[6].trim());

                    listOfStudents.add(students);
                    System.out.println("STUDENT ID:     "+ students.getStudentId() + ",   FirstName:     " + students.getFirstname() +",     LastName:      " + students.getLastname() + ",         GradeLevel:    " + students.getGradelevel() + ",      Email:           " + students.getEmail() + ",      GuardianEmail1:         " + students.getGuardianEmail1() + ",      GuardianEmail2:        " + students.getGuardianEmail2());

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStudents;
    }
}
