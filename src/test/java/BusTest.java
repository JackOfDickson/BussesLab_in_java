import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 10);
        person = new Person();
    }

    @Test
    public void canReturnPassenger(){
        assertEquals(0, bus.numberOfPassengers());
    }

}
