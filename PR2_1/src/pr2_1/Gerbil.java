/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;

/**
 *
 * @author jthomas17
 */
public class Gerbil {
    int _gerbilNumber;
    public Gerbil(int gerbilNumber){
        _gerbilNumber = gerbilNumber;
    }
    public String toString(){
        return " This is Gerbil#" + _gerbilNumber;
    }
    public int getNumber(){
        return _gerbilNumber;
    }
   
}
