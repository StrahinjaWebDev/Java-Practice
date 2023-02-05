package primeri;

public class MojaNit2 implements Runnable {
    private int vreme;

    public MojaNit2(int vreme) {
        this.vreme = vreme;
    }
    @Override

    public void run() {
        System.out.println(Thread.currentThread().getName()+"startovana..");

        try {
            Thread.sleep(vreme*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"zavrsena..");
    }
}
