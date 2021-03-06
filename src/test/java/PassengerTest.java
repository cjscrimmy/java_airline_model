import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Sally", 3);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Sally", passenger.getName());
    }

    @Test
    public void canSetPassengerName(){
        passenger.setName("Anna");
        assertEquals("Anna", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }

    @Test
    public void canSetNumberOfBags(){
        passenger.setNumberOfBags(1);
        assertEquals(1, passenger.getNumberOfBags());
    }

}
