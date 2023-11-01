package org.proper.school.serviceImplimentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.proper.school.Entities.Applicants;
import org.proper.school.Entities.Principal;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalServiceImpTest {

         PrincipalServiceImp principalServiceImp = new PrincipalServiceImp();

        @Test
        public void testAdmitStudentEligible() {
            Principal principal = new Principal("Adebisi", "Dayo",
                    "Kwara","adey@gmail.com",90657689L, "no 23 ninth mile Enugu",
                    LocalDate.of(1989, 9, 21), "4567Da",
                    "Msc", "4","76654887","Male");


            Applicants eligibleApplicants1 = new Applicants("Festus ",
                    "Uzoma","Abia", "feystus@gmail.com",
                    806756456L, "no 34 ekelebe street",LocalDate.of(1989, 9, 21),
                    "453QWr","234", true, 78,
                    "6", 14);



//            Applicants eligibleApplicant = new Applicants();
//            String result = principalServiceImp.admitStudent(principal, eligibleApplicants1);
//            assertEquals(" Congratulations you have been admitted!", result);
        }


}