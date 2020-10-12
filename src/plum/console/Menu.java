/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plum.console;

import plum.console.Clavier;

/**
 *
 * @author thbogusz
 */
public class Menu {

    public static int show(String leTitre, String[] menu) {
        String espace;
        int rep;
         int i;
        do {
            String titre = "MESSAGERIE -> " + leTitre;
            titre = Color.RED_BACKGROUND + " "
                    + Color.RED_BACKGROUND + Color.WHITE
                    + titre
                    + new String(new char[40 - titre.length()]).replace("\0", " ")
                    + Color.RED_BACKGROUND + " ";
            System.out.println(titre);

            
            for (i = 0; i < menu.length; i++) {
                String item = " " + (i + 1) + " - " + menu[i];
                espace = new String(new char[40 - item.length()]).replace("\0", " ");
                item += espace;
                System.out.println(Color.RED_BACKGROUND + " "
                        + Color.WHITE_BACKGROUND + Color.BLUE + item
                        + Color.RED_BACKGROUND + " ");
            }
            
            String fermetureMenu = Color.RED_BACKGROUND + " "
                    + Color.GREEN + Color.RED_BACKGROUND
                    + new String(new char[40]).replace("\0", " ")
                    + Color.RED_BACKGROUND + " ";
            System.out.println(fermetureMenu);

            rep = Clavier.lireInt(Color.YELLOW_BACKGROUND + Color.RED
                    + "Votre Choix (Quitter = 0) ? ");

        } while (rep < 0 | rep > i);

        return rep;
    }
}
