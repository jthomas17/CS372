/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_3;

/**
 *
 * @author jthomas17
 */
public class PR1_3 {

    /**
     * @param args the command line arguments
     * go
     */
    public static void main(String[] args) {
        /**
        * initialize string name to a name<code>name</code>
        */
         String name = "Jack";
         /**
          *if new argument is entered give different name
          */
        if(args.length > 0 && args[0].equalsIgnoreCase("new name"))
            name = "Pear";
        /**
          *if new argument is entered give different name
          */
        else if(args.length > 0 && args[0].equalsIgnoreCase("dif name"))
            name = "bob";
        /**
          *if new argument is entered give different name
          */
        else if(args.length > 0 && args[0].equalsIgnoreCase("not this name"))
            name = "Jain";
        /**
         *Prints out name based on arguments given
         */
        System.out.println(name);
    }
    
}
