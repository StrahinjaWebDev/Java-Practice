import java.util.Random;

class Car extends Thread {
    private int fuelAmountNeeded;
    private GasStation station;

    public Car(GasStation station) {
        this.fuelAmountNeeded = (new Random().nextInt(16) + 10);
        this.station = station;
    }

    @Override
    public void run() {
        System.out.println("Auto " + getId() + " je stigao na pumpu.");
        synchronized (station) {
            while (station.getFuelAmount() < fuelAmountNeeded) {
                try {
                    System.out.println("Auto " + getId() + " ceka da sipa gorivo.");
                    station.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Auto " + getId() + " ocekuje " + fuelAmountNeeded + " litra.");
            station.dispenseFuel(fuelAmountNeeded);
            station.notifyAll();
        }
        System.out.println("Auto " + getId() + " je otisao sa pumpe.");
    }
}