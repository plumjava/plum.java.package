package plum.console;

import java.io.*;

public class Clavier
{// ***** débute la définition de la classe *****

 
   public static String lireTexte(String message) // lecture d'une chaine
   {
      String texte=null;
  
      // ... définir l'origine(Reader) du flux(stream) : le clavier ...
  
      Reader reader = new InputStreamReader(System.in);
      BufferedReader clavier=new BufferedReader(reader);
  
  	 // System.out.println("");
	  System.out.print(message);   
      try {
         
         texte=clavier.readLine();//lire le texte au clavier
      }
      catch(IOException exc) {
         exc.printStackTrace();  
      }
      
      return texte; //retourne la valeur saisie
  
   }// --- fin de la mthode "lireTexte"

	public static int lireInt(String message) // lecture d'un entier
	{
		String strInt=lireTexte(message);
		int intVal= Integer.parseInt(strInt);
		return intVal;
	}
	public static char lireChar(String message) // lecture d'un caractère
	{
		String strChar=lireTexte(message);
		char charVal= strChar.charAt(0);
		return charVal;
	}
	public static float lireFloat(String message) // lecture d'un float
	{
		String strInt=lireTexte(message);
		float floatVal= Float.parseFloat(strInt);
		return floatVal;
	}
	public static double lireDouble(String message) // lecture d'un double
	{
		String strInt=lireTexte(message);
		double doubleVal= Double.parseDouble(strInt);
		return doubleVal;
	}
  
 	
}// ***** fin de la classe *****