/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plum.console;

import java.util.Arrays;
import plum.console.Clavier;

/**
 *
 * @author thbogusz
 */
public class Form {

    private static String color_histo;

    public static String[] show(String leTitre, String[] champ, String data[]) {
        String espace;
        String[] reponse = new String[champ.length];

        int i;

        String titre = "MESSAGERIE -> " + leTitre;
        espace = "";
        if (titre.length() < 40) {
            espace = new String(new char[40 - titre.length()]).replace("\0", " ");
        }
        titre = Color.BLUE_BACKGROUND + " "
                + Color.BLUE_BACKGROUND + Color.WHITE
                + titre
                + espace
                + Color.BLUE_BACKGROUND + " ";
        System.out.println(titre);

        for (i = 0; i < champ.length; i++) {
            String d = "";
            if (data != null) {
                d = "(" + data[i] + ")";
            }
            String item = "  " + champ[i] + d + " ? ";
            espace = "";
            if (item.length() < 30) {
                espace = new String(new char[30 - item.length()]).replace("\0", " ");
            }
            item += espace;
            item = Color.BLUE_BACKGROUND + " "
                    + Color.WHITE_BACKGROUND + Color.BLUE + item;

            reponse[i] = Clavier.lireTexte(item);

            if (data != null & reponse[i].equals("")) {
                reponse[i] = data[i]; // car aucun changement
            }
        }

        String fermetureMenu = Color.BLUE_BACKGROUND + " "
                + Color.GREEN + Color.BLUE_BACKGROUND
                + new String(new char[40]).replace("\0", " ")
                + Color.BLUE_BACKGROUND + " ";

        String rep = "";
        if (champ.length > 1) {
            while (!rep.equals("N") & !rep.equals("O")) {
                rep = Clavier.lireTexte(Color.BLUE_BACKGROUND
                        + Color.WHITE
                        + "VALIDER (O/N) ? "
                        + Color.RESET);
            }
        }

        if (rep.equals("N")) {
            // Aucune réponse à retourner
            return null;
        }

        return reponse;

    }

    public static void message(String message) {
        String messagef = Color.BLUE_BACKGROUND + "!!"
                + Color.WHITE + Color.YELLOW_BACKGROUND
                + message
                + Color.BLUE_BACKGROUND + "!!";

        System.out.println(messagef);
    }

    public static void printList(String message, String color1, String color2) {

        if (color_histo == null) {
            color_histo = color1;
        }
        if (color_histo.equals(color1)) {
            color_histo = color2;
        } else {
            color_histo = color1;
        }

        String messagef = color_histo + message + Color.RESET;
        System.out.println(messagef);
    }
}
