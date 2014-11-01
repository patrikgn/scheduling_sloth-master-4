package de.nak.scheduling_sloth.model;

import org.junit.Test;

/**
 * Created by patrickghahramanian on 01.11.14.
 */

import static org.junit.Assert.assertEquals;

public class CourseTest {

    //Declaration of the test attributes
    String name = "Internet Anwendungsarchitektur";
    Integer changeTime = 15;

    @Test
    public void testCourse() throws Exception {
        Course course = new Course ();
        //Insert the test attributes into the model Course
        course.setName(name);
        course.setChangeTime(changeTime);
        //Testing
        assertEquals(course.getName(), name);
        assertEquals(course.getChangeTime(), changeTime);

    }
}