package de.nak.scheduling_sloth.model;

import org.junit.Test;

/**
 * Created by patrickghahramanian on 01.11.14.
 */

import static org.junit.Assert.assertEquals;

public class RoomTest {

    //Declaration of the test attributes
    String name = "A100";
    Integer avaiableSeats = 35;
    Integer changeTime = 15;

    @Test
    public void testGetRoom() throws Exception {
        Room room = new Room();
        //Insert the test attributes into the model Lecturer
        room.setName(name);
        room.setAvailableSeats(avaiableSeats);
        room.setChangeTime(changeTime);
        //Testing
        assertEquals(room.getName(), name);
        assertEquals(room.getAvailableSeats(), avaiableSeats);
        assertEquals(room.getChangeTime(), changeTime);

    }
}