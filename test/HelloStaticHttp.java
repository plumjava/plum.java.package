
import java.io.BufferedReader;
import plum.http.StaticHttp;

public class HelloStaticHttp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String line;
        try {
            BufferedReader s = StaticHttp.openURL("http://plum.boonum.fr/doku.php?id=personnel:accueil");
            line = s.readLine();
            while (line != null) {
                System.out.println(line);
                line = s.readLine();
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
