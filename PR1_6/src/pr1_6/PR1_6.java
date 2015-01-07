/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_6;

/**
 *
 * @author jthomas17
 * Prime number generator
 */
public class PR1_6 {

    /**
     * @param uses two for loops to run through a specific number of numbers and then uses % to find prime numbers
     */
    public static void main(String[] args) {
        int found = 0;
        for (int i=1;i <= 10000; i++){
            for (int k = 1; k < 10000; k++){
                if(i%k == 0 && i != k && k != 1){
                    break;
                }
                if (i == k)
                    if (( ++found)%1 == 0)
                        System.out.println(i);

            }
        }
    }
    
}
