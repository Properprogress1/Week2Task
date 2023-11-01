package org.proper.school.services;

import org.proper.school.Entities.NonAcademicStaff;

import java.util.List;

public interface NonAcademicStaffService {

    void Cook(NonAcademicStaff nonAcademicStaff);

    void SecurityMan(NonAcademicStaff nonAcademicStaff);


    default List<NonAcademicStaff> ViewAllNonAcademicStaff() {
        List<NonAcademicStaff> List = null;

        return List;
    }

}

