/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;

/**
 *
 * @author jthomas17
 */
public class Gerbil {
    public int gerbilNumber;
    public Gerbil(){};
	public Gerbil(int i) {
		gerbilNumber = i;
	}

    void Hop() {
        System.out.println("gerbil " + gerbilNumber + " hops");
        
    }
      
}

