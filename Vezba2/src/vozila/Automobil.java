package vozila;

public class Automobil {
    private String registracioni_broj;
    private String model;
    private int godiste;
    private double zapremina_motora;
    private static int brojac = 0;
    public Automobil(String model,int godiste , double zapremina_motora){
        brojac++;
        this.registracioni_broj = "SR" + brojac;
        this.model = model;
        this.godiste = godiste;
        this.zapremina_motora = zapremina_motora;

    }
    public Automobil(String model, int godiste){
        brojac++;
        this.registracioni_broj = "SR" + brojac;
        this.model = model;
        this.godiste = godiste;
        this.zapremina_motora = -1;
    }
    public void ispisi() {
        System.out.println("A{"+this.registracioni_broj+","+this.model+","+this.godiste+","+this.zapremina_motora+"}");
    }

}
