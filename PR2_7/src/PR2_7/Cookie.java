/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PR2_7;
import java.util.*;

/**
 *
 * @author jthomas17
 */
public class Cookie {
    int thinMint = 0;
    int samoas = 0;
    int ChocolateChip = 0;
    int total;
    public void addthinMint(int i){
        thinMint += i;
        
    }
    public void addSamoas(int i){
        
        samoas += i;
    }
    public void addChocolate(int i){
        
        ChocolateChip += i;
    }
    public int printthin(){
        return thinMint;
    }
    public int printsamoas(){
        return samoas;
    }
    public int printchocolate(){
        return ChocolateChip;
    }
    public int totalsale(){
        int totalmint = thinMint*3;
        int totalsamoas = samoas*4;
        int totalchocolate = ChocolateChip*5;
        return total = totalmint+totalsamoas+totalchocolate;
    }
    
}
