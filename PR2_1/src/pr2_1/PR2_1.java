/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;
import java.util.*;

//PT: Don't forget to use comments when you check into GitHub

/**
 *
 * @author jthomas17
 */
public class PR2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerbilList gerbils = new GerbilList();
        for (int i = 0; i < 5; i++){
            gerbils.add(new Gerbil(i));
        }
        for(int i = 0; i < gerbils.size(); i++){
            GerbilHop.Hop(gerbils.get(i));
            System.out.println();
        }
    }
    
}
