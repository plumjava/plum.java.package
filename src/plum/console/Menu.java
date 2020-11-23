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

    public static char show(String leTitre, String[] menu) {
        String espace;
        char rep;
        int i;

        //déterminer la long max d'une ligne
        String titre = ":::" + leTitre + ":::";
        int max_length = leTitre.length();
        for (String item : menu) {
            if (item.length() > max_length) {
                max_length = item.length();
            }
        }

        max_length += 10;
        char numero;
        char numero_fin;
        do {

            String titreColor = Color.RED_BACKGROUND + " "
                    + Color.RED_BACKGROUND + Color.WHITE
                    + titre
                    + new String(new char[max_length - titre.length()]).replace("\0", " ")
                    + Color.RED_BACKGROUND + " ";
            System.out.println(titreColor);

            numero = 'a';
            numero_fin = (char)(numero + menu.length-1);
            for (i = 0; i < menu.length; i++) {
                String item = " " + (char)(numero+i) + " - " + menu[i];
                espace = new String(new char[max_length - item.length()]).replace("\0", " ");
                item += espace;
                System.out.println(Color.RED_BACKGROUND + " "
                        + Color.WHITE_BACKGROUND + Color.BLUE + item
                        + Color.RED_BACKGROUND + " ");
            }

            String fermetureMenu = Color.RED_BACKGROUND + " "
                    + Color.GREEN + Color.RED_BACKGROUND
                    + new String(new char[max_length]).replace("\0", " ")
                    + Color.RED_BACKGROUND + " ";
            System.out.println(fermetureMenu);

            rep = Clavier.lireChar(Color.YELLOW_BACKGROUND + Color.RED
                    + "Votre Choix (Quitter = Q) ? ");

        } while (rep != 'Q' & (rep < 'a' | rep > numero_fin));

        return rep;
    }
}
