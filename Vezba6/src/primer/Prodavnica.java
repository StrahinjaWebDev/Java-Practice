package primer;

public class Prodavnica {
    private int brojnoStranje;
    public Prodavnica(int brojnoStanje)

    {
        this.brojnoStranje = brojnoStranje;
    }
    public synchronized void prodaj (int n) {
        System.out.println(Thread.currentThread().getName() + "zahteva kupovinu"+ n +"proizvoda..");
        
        if(brojnoStranje - n >= 0) {
            brojnoStranje -= n;
            System.out.println(Thread.currentThread().getName() + "Izvrsio kupovinu novo brojno stanje:" + this.brojnoStranje);
        }
    }
    @Override
    public String toString() {
        return "Prodavnica{" + "brojno stanje=" + brojnoStranje+"}";
    }
}
