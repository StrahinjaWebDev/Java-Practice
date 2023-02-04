package glavni.Primer;
import izuzeci.MojIzuzetak;
import vozila.Automobil;
public class Primer {
    public static void main(String[] args) {
        try {
            if (provera()) { //pre drugog pokretanja promeniti povratnu vrednost
                metode provera
                throw new MojIzuzetak("Greska pri proveri!!");
            }
            double a = 5 / 0; // pre treceg pokretanja zakomentarisati ovu liniju
            Automobil a1 = null;
            a1.isparkiraj();
        } catch (MojIzuzetak mi) {
            System.out.println("Dogodila se korisnicka greska:" +
                    mi.metodaIzuzetka());
        } catch (ArithmeticException e) {
            System.out.println("Dogodila se aritmeticka greska:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Dogodila se greska!!");
            e.printStackTrace();
        } finally {
            System.out.println("Poruka koja se svakako prikazuje!!");
        }
        try {
            primerMetode();
        } catch (MojIzuzetak mojIzuzetak) {
            System.out.println( mojIzuzetak.getMessage());
        }
    }
    private static boolean provera() {
 /*
 telo metode provera
 */
        return true;
    }
    private static void primerMetode() throws MojIzuzetak{
 /*
 telo metode primerMetode
 */
        throw new MojIzuzetak("Greska u metodi 'primerMetode'");
    }
}