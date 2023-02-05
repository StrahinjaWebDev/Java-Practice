package primeri;

public class MojaNit extends Thread {
    private int vreme;
    public MojaNit(String imeN,int vreme) {
        this.vreme = vreme;
        setName(imeN);
    }
    @Override
    public void run() {
        System.out.println(this.getName()+"startovana...");
        try {
            Thread.sleep(vreme*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName()+"zavrsena...");
    }
}
