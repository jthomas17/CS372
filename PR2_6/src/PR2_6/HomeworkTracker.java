/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PR2_6;
import java.util.*;
/**
 *
 * @author jthomas17
 */
public class HomeworkTracker {
    double _testScore = 0;
    double _min = 0;
    double _max = 0;
    double _average = 0;
    ArrayList<Double> grade = new ArrayList<Double>();
    
    HomeworkTracker(){
    
    }
    //PT -- why add1, rather than add?
    public void add1(double c){
        grade.add(c);
    }
    public double findMin(){
        _min = grade.get(0);
        return _min;
    }
    public double findMax(){
        _max =  grade.get(grade.size()-1);
        return _max;
    }
    public double average(){
        double sum = 0;
        for (int i = 0; i < grade.size(); i++){
            sum+=grade.get(i);
        }
        return sum / grade.size();
        }
}
