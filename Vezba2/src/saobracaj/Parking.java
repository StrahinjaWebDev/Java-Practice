package saobracaj;
import vozila.Automobil;
public class Parking {
    private String adresa;
    private int broj_redova;
    private int broj_kolona;
    private Automobil automobili[][];
    public Parking(String adresa,int broj_redova,int broj_kolona){
        this.adresa=adresa;
        this.broj_redova=broj_redova;
        this.broj_kolona=broj_kolona;
        automobili=new Automobil[broj_redova][broj_kolona];
    }
    public void parkiraj(int red,int kolona,Automobil a){
        if(red>this.broj_redova || kolona>this.broj_kolona){
            System.out.println("Nepostojece parking mesto!!");

        }
        else {
            if(automobili[red-1][kolona-1]!=null){
                System.out.println("Mesto zauzeto!!");
            }
            else{
                System.out.println("Automobil uparkiran!!");
                automobili[red-1][kolona-1]=a;
            }
        }
    }
    public void isparkiraj(int red,int kolona){
        if (automobili[red-1][kolona-1]==null){
            System.out.println("Nema vozila na trazenom mestu");
        }
        else {
            automobili[red-1][kolona-1]=null;
            System.out.println("Automobil isparkiran!!");
        }
    }
    public void ispisi(){
        for (int i=0;i<this.broj_redova;i++) {
            for (int j=0;j<broj_kolona;j++){
                if (automobili[i][j]!=null){
                    automobili[i][j].ispisi();
                }
            }
        }
    }
}