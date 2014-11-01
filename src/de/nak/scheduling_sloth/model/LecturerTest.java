package de.nak.scheduling_sloth.model;

import org.junit.Test;

/**
 * Created by patrickghahramanian on 01.11.14.
 */

import static org.junit.Assert.assertEquals;

public class LecturerTest {

    //Declaration of the test attributes
    String name = "Stephan Anft";
    Integer breakTime = 15;

    @Test
    public void testGetLecturer() throws Exception {
        Lecturer lecturer = new Lecturer();
        //Insert the test attributes into the model Lecturer
        lecturer.setName(name);
        lecturer.setBreakTime(breakTime);
        //Testing
        assertEquals(lecturer.getName(), name);
        assertEquals(lecturer.getBreakTime(), breakTime);

    }
}