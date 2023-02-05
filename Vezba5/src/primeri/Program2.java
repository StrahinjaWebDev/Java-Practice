package primeri;

public class Program2 {
    public static void main(String[] args) {
        MojaNit2 mn2 = new MojaNit2(5);
        Thread nitMN2 = new Thread(mn2);
        nitMN2.setName("Prva nit");
        System.out.println("Broj aktivnih niti: " + Thread.activeCount());
        System.out.println("ID trenutne niiti: " + Thread.currentThread().getId());
        System.out.println("Da li je" + nitMN2.getName() + "aktivna" + nitMN2.isAlive());
        System.out.println("Da li je " + nitMN2.getName() + "demonska" + nitMN2.isDaemon());
        System.out.println("ID niti :" + nitMN2.getName() + ":" + nitMN2.getId());
        System.out.println("Da li je "+ nitMN2.getName()+" aktivna:" +
                nitMN2.isAlive());
        System.out.println("Broj aktivnih niti:" + Thread.activeCount());
    }
}