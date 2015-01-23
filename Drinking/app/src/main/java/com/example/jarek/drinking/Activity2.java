package com.example.jarek.drinking;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.security.AccessController.getContext;


public class Activity2 extends ActionBarActivity {

    double met;
    double alc;
    int weight;

    Person p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void toggleLabel3(View v){
        TextView n = (TextView)findViewById(R.id.name);
        TextView w = (TextView)findViewById(R.id.weight);
        String g = w.getText().toString();
        weight = Integer.parseInt(g);
        CharSequence name = n.getText();
        CheckBox m = (CheckBox)findViewById(R.id.male);
        CheckBox f = (CheckBox)findViewById(R.id.female);
        if(m.isChecked()){
        met = .015;
        alc = .73;
            p = new Person(name,weight,met,alc);
        }
        else if (f.isChecked()){
        met = .017;
        alc = .66;
            p = new Person(name,weight,met,alc);
        }
        Intent launchActivity = new Intent(getApplicationContext(), Activity3.class);
        launchActivity.putExtra("weight", weight);
        launchActivity.putExtra("met", met);
        launchActivity.putExtra("alc", alc);
        startActivity(launchActivity);

    }

    public void save(View v){
        io o = new io();

        o.save(this);
    }
    public void load(View v){
        io o = new io();

        o.load(this);
    }
}
