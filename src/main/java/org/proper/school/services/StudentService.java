package org.proper.school.services;

import org.proper.school.Entities.Principal;
import org.proper.school.Entities.Students;

public interface StudentService {

    void AttendClasses (Students students);

    void writeExams (Students students);
}
