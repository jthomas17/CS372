/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;
import java.util.*;
/**
 *
 * @author jthomas17
 */
//PT - this will work, but you could also have your class inherit from ArrayList,
//     since these methods are simply calling the ArrayList methods.
public class GerbilList {
    private List list = new ArrayList();
    public void add(Gerbil gerbil){
        list.add(gerbil);
    }
    public Gerbil get(int index){
        return (Gerbil)list.get(index);
    }
    public int size(){
        return list.size();
    }
}
