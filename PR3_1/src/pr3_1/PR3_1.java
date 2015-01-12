/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.Collections;

/**
 *
 * @author jthomas17
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        userInput ui = new userInput();
        try{
            ui._userInput();
        }
        
        catch(Exception ex){
            System.out.println("Entered non-int value" +ex.getMessage());
        }
        finally{
            Collections.sort(ui.a);
            System.out.println("Numbers entered: " + ui.a);
            System.out.println("Min: " + ui.min());
            System.out.println("Max: "+ui.max());
            System.out.println("Average: "+ui.average());
        }

    }

}
