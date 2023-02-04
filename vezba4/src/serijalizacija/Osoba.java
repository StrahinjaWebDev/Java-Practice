package serijalizacija;
import java.io.Serializable;
public class Osoba implements Serializable {
    private String ime;
    private int godiste;
    transient private double plata;

    public Osoba (String ime, int godiste, double plata) {
        this.ime = ime;
        this.godiste = godiste;
        this.plata = plata;
    }
    @Override
    public String toString() {
        return"Osoba{"+
                "ime='" + ime + '\'' +
                ", godiste =" +godiste+
                ", plata=" + plata +
                '}';
    }

}
