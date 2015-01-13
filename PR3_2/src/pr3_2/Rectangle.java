/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author jthomas17
 */
public class Rectangle extends Shape{
    int _width = 0;
    int _height = 0;
    public Rectangle(int width, int height){
        _width = width;
        _height = height;        
    }
    @Override
    public double getArea(){
        return _width*_height;
    }
    @Override
    public double getPerimeter(){
        return (_width * 2) + (_height * 2);
    }
}
