package de.nak.scheduling_sloth.model;

import org.junit.Test;

/**
 * Created by patrickghahramanian on 01.11.14.
 */

import static org.junit.Assert.assertEquals;

public class CohortTest {

    //Declaration of the test attributes
    String name = "11";
    String major = "Wirtschaftsinformatik";
    Integer year = 11;


    @Test
    public void testGetCohort() throws Exception {
        Cohort cohort = new Cohort();
        //Insert the test attributes into the model Cohort
        cohort.setName(name);
        cohort.setMajor(major);
        cohort.setYear(year);
        //Testing
        assertEquals(cohort.getName(), name);
        assertEquals(cohort.getMajor(), major);
        assertEquals(cohort.getYear(), year);

    }


}