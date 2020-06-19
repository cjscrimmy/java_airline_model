import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private ArrayList<Passenger> passengerList;

    public Flight(Plane plane){
        this.plane = plane;
        this.passengerList = new ArrayList<Passenger>();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int passengerCount(){
        return this.passengerList.size();
    }
}
