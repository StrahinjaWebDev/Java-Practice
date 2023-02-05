package primer;

public class Program {
    public static void main (String [] args) {
        Prodavnica p = new Prodavnica(15);
        System.out.println(p);

        Kupac prvi = new Kupac(p,1,0);
        Thread prviNit = new Thread(prvi);
        prviNit.setName("Prvi kupac");

        Kupac drugi = new Kupac(p,2,0);
        Thread drugiNit = new Thread(drugi);
        drugiNit.setName("Drugi kupac");

        Kupac treci = new Kupac(p,2,0);
        Thread treciNit = new Thread(treci);
        treciNit.setName("Treci kupac");

        Kupac cetvtri = new Kupac(p,2,0);
        Thread cetvrtiNit = new Thread(cetvtri);
        cetvrtiNit.setName("Cetvrti kupac");

        prviNit.start();
        drugiNit.start();
        treciNit.start();
        cetvrtiNit.start();
    }
}
