package org.proper.school.serviceImplimentation;

import org.proper.school.Entities.Applicants;
import org.proper.school.Entities.Principal;
import org.proper.school.Entities.Students;
import org.proper.school.Entities.Teachers;

public class StudentServiceImp {


    public String address (Teachers teachers, Students students) {

        if (students.getAddress() == "Kano" )
        {
            return "You will be a boarding student";

        } else { return "You will be a day student";


        }
    }

}
