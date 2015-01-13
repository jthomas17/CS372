/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import java.util.*;
/**
 *
 * @author jthomas17
 */
public class Triangle extends Shape{
    int side1,side2,side3;
    public Triangle(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
         if (side1 + side2 <= side3 && side1 + side3 <= side2 && side2 + side3 <= side1|| side1 == 0 || side2 == 0 || side3 == 0) {
            String msg = "Side 1 and 2 must add up to be greater than base side and all sides must"
                    + "be more than 0";
            throw new IllegalArgumentException(msg);
        }
    }
    @Override
    public double getArea(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*((p-side1)*(p-side2)*(p-side3)));
    }
    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }
}
