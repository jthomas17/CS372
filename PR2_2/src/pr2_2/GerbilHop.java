/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

/**
 *
 * @author jthomas17
 */
public class GerbilHop {
    static void Hop(Object g){
         Gerbil gerbil = (Gerbil)g;
        System.out.printf("Gerbil number: %d is hopping", gerbil.getNumber());
    }
}
