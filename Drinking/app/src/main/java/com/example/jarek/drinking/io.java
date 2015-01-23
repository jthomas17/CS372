package com.example.jarek.drinking;

import android.app.Activity;
import android.content.Context;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Jarek on 1/22/2015.
 */
public class io {
    public void save(Activity a) {


    String filename = "users.txt";
    String s = "hello world this is fucking insane";
    FileOutputStream fos;
    try

    {
        fos = a.openFileOutput(filename, Context.MODE_PRIVATE);
        fos.write(s.getBytes());
        fos.close();
        System.out.println(s);
    }

    catch(
    Exception e
    )

    {
        e.printStackTrace();
    }
}
    public void load(Activity a){
        String filename = "users.txt";
    try {

        FileInputStream fis = a.openFileInput(filename);
        byte[] readbytes = new byte[256];
        int cb = fis.read(readbytes, 0, 256);
        while (cb != -1) {
            cb = fis.read(readbytes, 0, 256);
            String s = new String(readbytes,0,256);
            System.out.println(s);

        }
    }catch(Exception e){}
    }
}
