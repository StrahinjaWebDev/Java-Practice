package vozila;
import interfejsi.InterfejsParkiranje;
import interfejsi.InterfejsTovar;
import tovar.Paket;
public class Kamion extends Vozilo implements InterfejsParkiranje, InterfejsTovar {
    /*
    definicija klase Kamion
    */
    @Override
    public void parkiraj() {
        System.out.println("Kamion parkiran");
    }
    @Override
    public void isparkiraj() {
        System.out.println("Kamion isparkiran!");
    }
    @Override
    public boolean utovar(Paket p) {
        System.out.println("Kamion izvrsio utovar!");
        return true;
    }
    @Override
    public void istovar() {
        System.out.println("Kamion izvrsio istovar!");
    }
}