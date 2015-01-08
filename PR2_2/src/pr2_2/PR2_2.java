/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

import java.util.*;

/**
 *
 * @author jthomas17
 */
public class PR2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List gerbils = new ArrayList();
        for (int i = 0; i < 5; i++){
            gerbils.add(new Gerbil(i));
        }
        Iterator e = gerbils.iterator();
        while (e.hasNext()){
            GerbilHop.Hop(e.next());
            System.out.println();
        
        }
    }
    
}
