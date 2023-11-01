package org.proper.school.services;

import org.proper.school.Entities.Principal;
import org.proper.school.Entities.Students;

public interface PrincipalService {

    void Expel (Principal principal, Students students);


    void Admit (Principal principal, Students students);
}
