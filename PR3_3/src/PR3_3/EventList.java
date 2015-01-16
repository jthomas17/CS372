/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PR3_3;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jthomas17
 */
public class EventList {
    List<Event> list = new <Event> ArrayList();
    List<String> list2 = new <String>ArrayList();
    public void rd() {

        File f = new File("C:\\Users\\jthomas17\\Documents\\text.txt");
        try {
            list.clear();
            list2.clear();
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while ((line = rdr.readLine()) != null) {
                Pattern p = Pattern.compile(" ");
                Matcher m = p.matcher(line.substring(11));
                m.find();
                Event readEvent = new Event();
                list2.add(line);
                readEvent.date = line.substring(0, 10);
                readEvent.location = line.substring(11, m.start() + 11);
                readEvent.event = line.substring(m.start() + 12);
                list.add(readEvent);
            }
        } catch (Exception ex) {
            System.out.println("I was hoping that we wouldn't get here.");
        }
    }

    public void rt(String x, String y, String z) {

        File f = new File("C:\\Users\\jthomas17\\Documents\\text.txt");
        try {
            Event newEvent = new Event();
            newEvent.date = x;
            newEvent.location = y;
            newEvent.event = z;
            list.add(newEvent);
            Collections.sort(list, new LocationComparator());
            BufferedWriter writeToFile = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < list.size(); i++) {
                String a = list.get(i).date;
                String b = list.get(i).location;
                String c = list.get(i).event;
                writeToFile.write(a + " " + b + " " + c);
                writeToFile.newLine();
                System.out.println(a + " " + b + " " + c);

            }
            writeToFile.close();
        } catch (Exception ex) {
            System.out.println("I was hoping that we wouldn't get here2.");
        }
        
    }
    public String print(){        
        String display = "";
        for (int i = 0; i < list.size(); i++) {
                String a = list.get(i).date;
                String b = list.get(i).location;
                String c = list.get(i).event;
                display+=(a + " " + b + " " + c+"\n");
                
                

            }

        return display;
    }
}
