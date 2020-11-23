
import plum.console.Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thbogusz
 */
public class HelloMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] smenu = {"Initialiser precip",
            "Total des précipitation",
            "Minimum et maximum des précipitations",
            "Nombre de précipitations > moyenne"};

        int menu = Menu.show("ForPrecipitations", smenu);

        System.out.println(menu);
    }

}
