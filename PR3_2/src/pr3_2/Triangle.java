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
