package glavni;
import paketPrvi.Osoba;
public class Program {
 public static void main(String[] args) {
 Osoba pera=new Osoba("Pera",1994);//instaciranje objekta
 Osoba milan=new Osoba("Milan");//instaciaranje objekta
 System.out.println("Ime prve osobe je"+pera.getIme());
 System.out.println("Ime druge osobe je"+milan.getIme());
 }
}