package org.proper.school.serviceImplimentation;

import org.proper.school.Entities.Applicants;
import org.proper.school.Entities.Principal;

public class PrincipalServiceImp {

    public String admitStudent(Principal principal, Applicants applicants) {

        boolean previousSchoolRecord = applicants.isApplicantPreviousSchoolReportGood();


        if (applicants.getAge() >= 14 && applicants.getAge() <= 20 && previousSchoolRecord && applicants.getTestScore() >= 60) {

            //return "Congratulations you are eligible to apply";

            return " Congratulations you have been admitted!";

        } else {
            return "Applicants with the name : " + applicants.getFirstname() + "  You are not eligible for admission";


        }

    }

}











