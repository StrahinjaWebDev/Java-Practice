package interfejsi;

import tovar.Paket;

public interface InterfejsTovar {
    private void  upakuj(Paket p) {
        System.out.println("Paket upakovan");
    }
    default Paket pripremaPaketaZaUtovar (Paket p) {
        upakuj (p);
        System.out.println("Paket spreman za utovar");
        return p;
    }
    boolean utovar(Paket p);
    void istovar();
}
