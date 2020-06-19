public enum PlaneType {
    CESNER(4, 100),
    BOEING747(300, 1000),
    BOEING737(400, 1500),
    AIRBUSA380(250, 1200);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}
