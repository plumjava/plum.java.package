
import plum.file.LocalFile;

public class HelloLocalFileInfos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalFile file = LocalFile.open("infos.txt");

        // écrire
        int id = 10;
        double tarif = 34.23;
        file.put(Integer.toString(id));
        file.put("Souris");
        file.put(Double.toString(tarif));
        file.write();

        file.put("20");
        file.put("Clé USB");
        file.put("18.87");
        file.write();

        // lire
        double total = 0;
        while (file.read() == true) {
            System.out.println("id :" + file.getInt());
            System.out.println("article :" + file.get());
            tarif = file.getDouble();
            System.out.println("tarif :" + tarif);

            total = total + tarif;
        }

        System.out.println("Total = " + total);
        
    }

}
