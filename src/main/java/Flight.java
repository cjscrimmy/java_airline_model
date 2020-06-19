import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private ArrayList<Passenger> passengerList;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.plane = plane;
        this.passengerList = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
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

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public void setDepartureAirport(String newDepartureAirport){
        this.departureAirport = newDepartureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public void setDepartureTime(String newDepartureTime){
        this.departureTime = newDepartureTime;
    }

    public int seatsAvailable(){
        int numberOfSeatAvailable = plane.getCapacity() - passengerCount();
        return numberOfSeatAvailable;
    }

    public void addPassenger(Passenger passenger){
        if(seatsAvailable() > 0) {
            this.passengerList.add(passenger);
        }

    }
}
