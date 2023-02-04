package serijalizacija;
import java.io.*;
public class PrimerSerijalizacije {
    public static void main(String[] args) {
        String putanjaDoDatoteke = "dokumenti\\direktorijum1\\dat.bin";
        Osoba Pera=new Osoba("Pera",1990,5000.0);
        System.out.println(Pera);
        //otvaranje izlaznog strima i upis serijalizovanog objekta
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new
                    FileOutputStream(putanjaDoDatoteke));
            oos.writeObject(Pera);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //otvaranje ulaznog strima, citanje i deserijalizacija objekta
        try {
            ObjectInputStream ois=new ObjectInputStream(new
                    FileInputStream(putanjaDoDatoteke));
            Osoba PeraP=(Osoba)ois.readObject();
            System.out.println("Ispis objekta nakon deserijalizacije:");
            System.out.println(PeraP);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

