import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 4);
        person = new Person();
        busStop = new BusStop("Morries");
        busStop.addToQueue(person);
    }

    @Test
    public void canReturnPassenger(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void canRejectPassengerWhenFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void canPickUpPassengersFromBusStop(){
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.numberOfPassengers());
    }

}
