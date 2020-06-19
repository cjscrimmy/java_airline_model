import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private ArrayList<Passenger> passengerList;
    private String flightNumber;
    private String destination;

    public Flight(Plane plane, String flightNumber, String destination){
        this.plane = plane;
        this.passengerList = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public void setPlane(Plane newPlane){
        this.plane = newPlane;
    }

    public int passengerCount(){
        return this.passengerList.size();
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public void setFlightNumber(String newFlightNumber){
        this.flightNumber = newFlightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public void setDestination(String newDestination){
        this.destination = newDestination;
    }
}
