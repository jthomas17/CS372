/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.*;

/**
 *
 * @author jthomas17
 */
public class userInput {

    List<Integer> a = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    public void _userInput() {
        System.out.println("Please enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            a.add(input.nextInt());
        }
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum / a.size();
    }

    public int min() {
        return a.get(0);
    }
    public int max(){
        return a.get(a.size()-1);
    }
}
