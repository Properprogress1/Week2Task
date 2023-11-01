package org.proper.school.services;

import org.proper.school.Entities.NonAcademicStaff;
import org.proper.school.Entities.Principal;
import org.proper.school.Entities.Students;
import org.proper.school.Entities.Teachers;

public interface SchoolService {
    void Admit(Principal principal, Students students);

    void Expel(Principal principal, Students students);

    void Teach(Teachers teachers, Students students);

    void Cook(NonAcademicStaff nonAcademicStaff);


    //void Sweep (NonAcademicStaff nonAcademicStaff);

}
