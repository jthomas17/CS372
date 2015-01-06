/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_5;
import java.util.Random;
/**
 *
 * @author jthomas17
 */
public class PR1_5 {

    /**
     * generates 25 random int values and then compares then to another random generated number
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random(20);
        
        for (int i = 0; i < 25; i++){
            int x = rand.nextInt(25);
            int y = rand2.nextInt(25); 
            if(x > y){
                System.out.printf("%d is greater than %d", x, y);
            System.out.println();
            }
            else if (x < y){
                System.out.printf("%d is greater than %d", y, x);
                System.out.println();
            }
            else{
                System.out.printf("%d is equal to %d", y, x);
                System.out.println();
         }
           
    }
    
}
}
