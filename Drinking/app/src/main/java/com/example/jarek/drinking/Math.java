package com.example.jarek.drinking;

/**
 * Created by Jarek on 1/19/2015.
 */
public class Math {
    public double setAlcohol(int A, int W, double r,double mr){
        double H = 1;
        double bac = ((A * 5.14) /(W * r))-(mr * H);
        return bac;
    }
}
