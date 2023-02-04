package vozila;
import interfejsi.InterfejsParkiranje;


public class Automobil extends Vozilo implements InterfejsParkiranje {
    @Override
    public void parkiraj() {
        System.out.println("Automobil parkiran");
    }

    @Override
    public void isparkiraj() {
        System.out.println("Automobil isparkiran");
    }



}