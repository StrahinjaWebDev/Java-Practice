import java.util.Random;

public class GasStationSimulation {
    public static void main(String[] args) {
        GasStation station = new GasStation(80);
        Car[] cars = new Car[15];
        for (int i = 0; i < 15; i++) {
            cars[i] = new Car(station);
            cars[i].start();
            try {
                Thread.sleep((new Random().nextInt(2) + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            synchronized (station) {
                station.refill(10);
                System.out.println("Napunjeno je 10 litara goriva na pumpi.");
                station.notifyAll();
            }
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}