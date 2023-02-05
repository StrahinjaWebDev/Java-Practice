import java.util.Random;

class GasStation {
    private int capacity;
    private int fuelAmount;

    public GasStation(int capacity) {
        this.capacity = capacity;
        this.fuelAmount = capacity;
    }

    public int getFuelAmount(){
        return fuelAmount;
    }
    public void refill(int amount) {
        this.fuelAmount += amount;
        if(this.fuelAmount > this.capacity) {
            this.fuelAmount = this.capacity;
        }
    }
    public void dispenseFuel(int amount) {
        this.fuelAmount -= amount;
    }
}