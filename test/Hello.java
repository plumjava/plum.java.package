
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import plum.console.Clavier;

public class Hello {
    
   enum Vent{
        FORT,
        FAIBLE
      
    } 
public static void main(String[] args) {
    System.out.println("d:" + Double.toString(43.23));
    String s = "Hello World2! ";
    byte data[] = s.getBytes();
    Path p = Paths.get("LOcalFile/logfile2.txt");

    try (OutputStream out = new BufferedOutputStream(
            Files.newOutputStream(p, CREATE, APPEND))) {
        out.write(data, 0, data.length);

    } catch (IOException x) {
        System.err.println(x);
    }

    String vv = "FORT";
    Vent v = Vent.FAIBLE;

    System.out.println(v);

    if (Vent.valueOf(vv) == Vent.FORT) {
        System.out.println("yes");
    }

//String s = "z2zz1xxxzaaaa";
    System.out.println(s.hashCode());

}
}
