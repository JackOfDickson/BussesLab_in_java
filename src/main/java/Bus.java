import java.util.ArrayList;

public class Bus {

    private ArrayList<Person> passengers;
    private String destination;
    private int capacity;

    public Bus(String destination,int capacity){
        this.passengers = new ArrayList<>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int numberOfPassengers(){
        return this.passengers.size();
    }

}
