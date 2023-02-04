package glavni;
import java.io.*;
import java.util.ArrayList;
public class ProgramZaUpisICitanje {
    public static void main(String[] args) {
        String putanjaDoDatoteke = "dokumenti\\direktorijum1\\sadrzaj.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream(putanjaDoDatoteke, false), "UTF-8"));
            bw.write("Прва линија текста");
            bw.newLine();
            bw.write("Друга линија текста");
            bw.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Dogodila se greska prilikom enkodovanja izlaznog strima!");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Dogodila se greska prilikom otvaranja izlaznog strima!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Dogodila se greska priliko upisa!");
            e.printStackTrace();
        }
       try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new
                    FileInputStream(putanjaDoDatoteke), "UTF-8"));
            ArrayList<String> sadrzaj = new ArrayList<String>();
            String linija = br.readLine();//
            while (linija != null) {
                sadrzaj.add(linija);
                linija = br.readLine();
            }
            System.out.println("Sadrzaj datoteke:");
            for (String l : sadrzaj) {
                System.out.println(l);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dogodila se greska prilikom otvaranja ulaznog strima!");
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Dogodila se greska prilikom enkodovanja ulaznog strima!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Dogodila se greska prilikom citanja sadrzaja!");
            e.printStackTrace();
        }
    }
}
