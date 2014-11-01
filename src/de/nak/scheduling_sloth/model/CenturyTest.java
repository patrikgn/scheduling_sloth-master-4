package de.nak.scheduling_sloth.model;

import org.junit.Test;

/**
 * Created by patrickghahramanian on 01.11.14.
 */

import static org.junit.Assert.assertEquals;

public class CenturyTest {

    //Declaration of the test attributes
    String name = "A";
    String cohort = "11";
    Integer numberOfStudents = 34;
    Integer breakTime = 15;

    @Test
    public void testGetCentury() throws Exception {
        Century century = new Century();
        //Insert the test attributes into the model Century
        century.setName(name);
        century.setCohort(cohort);
        century.setNumberOfStudents(numberOfStudents);
        century.setBreakTime(breakTime);
        //Testing
        assertEquals(century.getName(), name);
        assertEquals(century.getCohort(), cohort);
        assertEquals(century.getNumberOfStudents(), numberOfStudents);
        assertEquals(century.getBreakTime(), breakTime);



}
}