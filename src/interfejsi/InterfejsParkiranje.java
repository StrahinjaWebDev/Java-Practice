package interfejsi;

public interface InterfejsParkiranje {
        int brojRaspolozivihMesta = 5;

        static void ispisiBrojMesta() {
            System.out.println("broj mesta"+brojRaspolozivihMesta);
        }
    void parkiraj();
        void isparkiraj ();

}