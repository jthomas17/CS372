/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

import java.util.*;

/**
 *
 * @author jthomas17
 */
public class ValueofPI {

    public ValueofPI() {
    }

    public double findPI(int userInput) {
        int _userInput = userInput;
        double sum = 0;
        int n = 1;

        for (int a = 1; a < _userInput; a += 2) {
            sum += (double) (n * (4.0 / a));
            n = (n == -1) ? 1 : -1;
        }
        return sum;

    }
}
