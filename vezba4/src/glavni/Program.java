package glavni;
import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String putanjaDoDirektorijuma = "dokumenti\\direktorijum1";
        File fDirektorijum = new File(putanjaDoDirektorijuma);

        if(!fDirektorijum.exists()) {
            fDirektorijum.mkdirs();
        }


            File fDatoteka = new File(putanjaDoDirektorijuma + "\\sadrzaj.txt");

        if(!fDatoteka.exists()) {
            try {
                fDatoteka.createNewFile();

            } catch (IOException e) {
                System.out.println("Desila se greska prilikom kreiranja");
                e.printStackTrace();
            }
        }
        for(File f : fDirektorijum.listFiles()) {
            System.out.println(f);
        }
    }
}
