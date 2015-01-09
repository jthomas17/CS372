/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1.pkg1;

/**
 *
 * @author jthomas17
 */
class DataOnly1{
    int i;
    float f;
    boolean b;
}

public class PR11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     DataOnly1 d = new DataOnly1();
    d.i = 47;
    d.f = 1.1f; //f after number indicates float constant
    d.b = false;
    System.out.printf("%d, %f, %b\n", d.i, d.f, d.b);
    }
    }
    
}
