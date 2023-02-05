package primer;

public class Kupac  implements Runnable{
    private int kolicina;
    private Prodavnica p;
    private int vreme;

    public Kupac (Prodavnica p, int kolicina, int vreme) {
        this.p = p;
        this.kolicina=kolicina;
        this.vreme=vreme;
    }
    @Override

    public void run() {
        try {
            Thread.sleep(vreme*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.p.prodaj(kolicina);
    }
}
