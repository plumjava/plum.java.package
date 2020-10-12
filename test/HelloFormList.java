
import plum.console.Color;
import plum.console.Form;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thbogusz
 */
public class HelloFormList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for  (int i=0; i< 10;i++){
        Form.printList("message " + i, Color.GREEN_BACKGROUND, Color.YELLOW_BACKGROUND);
    }
    }
    
}
