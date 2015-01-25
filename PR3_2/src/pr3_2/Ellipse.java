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
public class Ellipse extends Shape{
    int radius,radius2;
    public Ellipse(int r1, int r2){
        radius = r1;
        radius2 = r2;
        //PT -- if (r1 <= 0 || r2 <= 0) -3
        if(r1 == 0 || r1 == 0){
            String msg = "radius must be greater than 0";
            throw new IllegalArgumentException(msg);
        }
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius2;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * Math.sqrt(((radius * radius) + (radius2*radius2))/(2));
    }
}
