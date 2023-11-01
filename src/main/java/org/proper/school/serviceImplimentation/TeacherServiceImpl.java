package org.proper.school.serviceImplimentation;

import org.proper.school.Entities.Students;
import org.proper.school.Entities.Teachers;
import org.proper.school.services.TeacherService;

public class TeacherServiceImpl implements TeacherService {


    @Override
    public String teach(Teachers teachers, Students students) {
        if (students.getStudentScore() == 70){

            return "You made an A";

        } else if (students.getStudentScore() == 60) {
            return "You made a B";
        } else {
            return "work harder";
        }
    }
}
