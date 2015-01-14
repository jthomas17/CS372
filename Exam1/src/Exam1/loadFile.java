/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exam1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author jthomas17
 */
public class loadFile {
    ArrayList<String> list = new ArrayList<String>();//list of strings
    String _name;
    int _money = 500;//intiializes money for new person
    /**
     * 
     * @param constructor
     * loads file if there is one at specified path other wise creates a file at that path
     * adds names from that file to ArrayList of strings
     */
    public loadFile(String name){        
        _name = name;             
    } 
    public void loadfile(String name){//doesnt work wont write to file and wont take in names
        File f = new File("c:\\users\\Jthomas17\\documents\\dice.txt");
        try{
        if(!f.exists()){
            f.createNewFile();
        }
        BufferedReader rdr = new BufferedReader(new FileReader(f));
        BufferedWriter wtr = new BufferedWriter(new FileWriter(f));
        String line;
        while ((line = rdr.readLine()) != null){//runs through file and assigns line to line in txt file
            list.add(line);//adds line to ArrayList            
        } 
        for(int i = 0; i < list.size(); i++){//adds name to ArrayList if it isnt there
        if (list.get(i) != name){
            list.add(name);
            wtr.write(list.get(i));//writes new name to file
        }
        rdr.close();
        }
        }
        catch(Exception ex){//catches if file doesn't open
            System.out.println("File went bad");
        }
    }
}
