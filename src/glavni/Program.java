package glavni;
import vozila.Automobil;
import vozila.Kamion;
import tovar.Paket;


public class Program {
    public static void main(String[] args) {
        Automobil a=new Automobil();
        Kamion k = new Kamion();
        Paket p = new Paket();
        a.parkiraj();
        k.isparkiraj();
        k.pripremaPaketaZaUtovar(p);
        k.utovar(p);
    }

}