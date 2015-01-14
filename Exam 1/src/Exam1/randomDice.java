/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exam1;

import java.util.Random;

/**
 *
 * @author jthomas17
 * random dice generator
 * simulates 2 dice being rolled
 */
public class randomDice {
    
    public int randomdice(){
        Random rnd = new Random();//new random variable
        int dice = rnd.nextInt(11)+1;//creates a random number between 1 and 12
        return dice;
    }
}
