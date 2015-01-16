/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PR3_3;

import java.util.Comparator;

/**
 *
 * @author jthomas17
 */
public class LocationComparator implements Comparator<Event>{
    @Override
    public int compare(Event f1, Event f2) {
        return f1.getLocation().compareTo(f2.getLocation());
    }
}
