
import plum.file.LocalFile;

public class HelloLocalFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LocalFile file = LocalFile.open("hello.txt");

        file.put("Hello world");
        file.write();

        file.read();
        String info = file.get();
        System.out.println("info :" + info);

    }
}
