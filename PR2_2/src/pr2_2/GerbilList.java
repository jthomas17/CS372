/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jthomas17
 */
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
