import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CESNER);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.CESNER, plane.getPlaneType());
    }

    @Test
    public void canGetCapacityOfPlane(){
        assertEquals(4, plane.getCapacity());
    }
}
