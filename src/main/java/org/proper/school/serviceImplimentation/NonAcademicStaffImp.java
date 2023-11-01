package org.proper.school.serviceImplimentation;

import org.proper.school.Entities.Applicants;
import org.proper.school.Entities.Classez;
import org.proper.school.Entities.NonAcademicStaff;
import org.proper.school.Entities.Principal;

public class NonAcademicStaffImp {

    public String cleanClass (NonAcademicStaff nonAcademicStaff, Classez classez) {

        if (nonAcademicStaff.getGender() == "FEMALE" ){

            return "You will be cleaning the girls hostel";
        } else {

            return "You have been allocated to clean the boys hostel";

        }


    }

}
