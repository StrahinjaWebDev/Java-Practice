package primeri;

public class Program {
    public static void main(String[] args) {
        MojaNit mn1 = new MojaNit("Prva nit",5);
        System.out.println("Broj aktivnih niti"+Thread.activeCount());
        System.out.println("Id trenutne niti"+Thread.currentThread().getId());
        System.out.println("Da li je"+mn1.getName()+"Aktivna"+mn1.isAlive());
        System.out.println("Da li je"+mn1.getName()+"Demonska:"+mn1.isDaemon());
        System.out.println("Id niti"+mn1.getName()+":"+mn1.getId());
        mn1.start();


 try {
     mn1.join();
 } catch (InterruptedException e) {
 e.printStackTrace();
 }

        System.out.println("Da li je "+mn1.getName()+" aktivna:"+mn1.isAlive());
        System.out.println("Broj aktivnih niti:"+Thread.activeCount());
    }
}
