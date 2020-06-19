import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private ArrayList<Passenger> passengerList;
    private String flightNumber;

    public Flight(Plane plane, String flightNumber){
        this.plane = plane;
        this.passengerList = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
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
}
