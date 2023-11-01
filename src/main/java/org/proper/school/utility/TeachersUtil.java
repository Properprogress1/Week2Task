package org.proper.school.utility;

import org.proper.school.Entities.Students;
import org.proper.school.Entities.Teachers;
import lombok.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.proper.school.Entities.Teachers.*;

public class TeachersUtil {

    public static List<Teachers> readTeachersInfo(String filename, String sheetName) {

        List<Teachers> listOfTeachers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/mac/Documents/Week1Java/SchoolProject/src/main/java/org/proper/school/watweneed/DatasetforseedingTeachers.csv"))) {

            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] col = line.split(",", -1);
                for (int i = 0; i < col.length; i++) {
                    if (col[i].isBlank()) {
                        col[i] = null;
                    }
                }

                if (col.length == 4) {


                    Teachers teachers = new Teachers();

                    teachers.setStaffID(col[0]);
                    teachers.setEmail(col[1]);
                    teachers.setFirstName(col[2]);
                    teachers.setLastName(col[3]);

                    listOfTeachers.add(teachers);
                    System.out.println("Teacher ID:   " +  teachers.getStaffID() + ", FirstName:    " + teachers.getFirstName() + ",   LastName:   " + teachers.getLastName() +",  Email:    " + teachers.getEmail());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfTeachers;
    }
}