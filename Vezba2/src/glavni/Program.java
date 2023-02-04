package glavni;
import saobracaj.Parking;
import vozila.Automobil;

public class Program {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("Audi a1" , 2005,1993.2);
        Automobil a2 = new Automobil("Golf 2",1976,1392.5);
        Automobil a3 = new Automobil("Yugo Kolal",1994,1223.4);
        Parking p = new Parking("Vojvode Stepe 213",4,4);
        p.parkiraj(2,2,a1);
        p.parkiraj(3,2,a2);
        p.parkiraj(1,2,a3);
        System.out.println("Trenutno stanje na parkinku");
        p.ispisi();
        p.isparkiraj(2,2);
        System.out.println("Azurirano stanje na parkingu");
        p.ispisi();
    }
}
