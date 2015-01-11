/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jthomas17
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Sleepy", new Gerbil(4));
        gerbils.put("Happy", new Gerbil(5));
        Iterator<String> it = gerbils.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + ": ");
            gerbils.get(s).Hop();
        }
    }

}
