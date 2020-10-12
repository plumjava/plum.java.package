
import java.io.BufferedReader;
import plum.http.StaticHttp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thbogusz
 */
public class HelloStaticHttp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String line;
        try {
            BufferedReader s = StaticHttp.openURL("http://plum.boonum.fr/doku.php");
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
