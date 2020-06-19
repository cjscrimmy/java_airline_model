import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Flight flight;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CESNER);
        passenger1 = new Passenger("Juan", 1);
        passenger2 = new Passenger("Liz", 1);
        passenger3 = new Passenger("Brian", 2);
        passenger4 = new Passenger("Sarah", 2);
        passenger5 = new Passenger("Sergio", 2);
        flight = new Flight(plane, "I25");
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightStartsWithNoPassengers(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("I25", flight.getFlightNumber());
    }

}
