import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Plane plane;
    private Plane plane2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Flight flight;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CESNER);
        plane2 = new Plane(PlaneType.AIRBUSA380);
        passenger1 = new Passenger("Juan", 1);
        passenger2 = new Passenger("Liz", 1);
        passenger3 = new Passenger("Brian", 2);
        passenger4 = new Passenger("Sarah", 2);
        passenger5 = new Passenger("Sergio", 2);
        flight = new Flight(plane, "I25", "Turin", "EDI", "12pm");
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canSetPlane(){
        flight.setPlane(plane2);
        assertEquals(plane2, flight.getPlane());
    }

    @Test
    public void flightStartsWithNoPassengers(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("I25", flight.getFlightNumber());
    }

    @Test
    public void canSetFlightNumber(){
        flight.setFlightNumber("BE17");
        assertEquals("BE17", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Turin", flight.getDestination());
    }

    @Test
    public void canSetDestination(){
        flight.setDestination("Madrid");
        assertEquals("Madrid", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canSetDepartureAirport(){
        flight.setDepartureAirport("GLA");
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("12pm", flight.getDepartureTime());
    }

    @Test
    public void canSetDepartureTime(){
        flight.setDepartureTime("7pm");
        assertEquals("7pm", flight.getDepartureTime());
    }

    @Test
    public void allSeatsAvailable(){
        assertEquals(4, flight.seatsAvailable());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1,flight.passengerCount());
    }
}
