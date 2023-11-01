package org.proper.school.serviceImplimentation;

import org.proper.school.Entities.Applicants;

public class ApplicantsServiceImpl {

    public String applicantsTestScore(Applicants applicants) {

        if (applicants.getTestScore() >= 60 ) {

            return "You have passed the exam";
        } else {
            return "Sorry you did not make the cut, try again next year";
        }
    }
}
