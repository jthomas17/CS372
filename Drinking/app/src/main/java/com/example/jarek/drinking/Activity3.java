package com.example.jarek.drinking;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Activity3 extends ActionBarActivity {
Math m = new Math();
    Activity2 a = new Activity2();
    double num = 0;
    int weight;
    double alc;
    double met;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
        Intent i = getIntent();
        weight = (int) i.getExtras().get("weight");
        alc = (double) i.getExtras().get("alc");
        met = (double) i.getExtras().get("met");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity3, menu);
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
    public void toggleLabel4(View v){
        num+=.6;
        TextView t= (TextView)findViewById(R.id.bac);
        String meh = String.format("%1.3f", m.setAlcohol(num, weight, alc, met));
        //String test = String.format("%d", a.weight);
        t.setText(meh);
    }
}
