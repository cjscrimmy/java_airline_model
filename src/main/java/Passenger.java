public class Passenger {
    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getNumberOfBags(){
        return this.numberOfBags;
    }

    public void setNumberOfBags(int newNumberOfBags){
        this.numberOfBags = newNumberOfBags;
    }
}
