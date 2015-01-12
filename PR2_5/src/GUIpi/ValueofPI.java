/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpi;
//PT -- Again, import the PR2_4 package so you don't have to copy/paste the whole class -2
/**
 *
 * @author jthomas17
 */
public class ValueofPI {
double _userInput = 0;
    public ValueofPI(double c) {
        findPI(c);
    }

    public double findPI(double userInput) {
        _userInput = userInput;
        double sum = 0;
        int n = 1;

        for (int a = 1; a < _userInput; a += 2) {
            sum += (double) (n * (4.0 / a));
            n = (n == -1) ? 1 : -1;
        }
        return sum;

    }
}
