package com.example.jarek.drinking;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Activity2 extends ActionBarActivity {
int num;
    Math m = new Math();
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
        int weight = Integer.parseInt(g);
        CharSequence name = n.getText();
        CheckBox m = (CheckBox)findViewById(R.id.male);
        CheckBox f = (CheckBox)findViewById(R.id.female);
        if(m.isChecked()){
            double met = .015;
            double alc = .73;
            p = new Person(name,weight,met,alc);
        }
        else if (f.isChecked()){
            double met = .017;
            double alc = .66;
            p = new Person(name,weight,met,alc);
        }
      //  Intent launchActivity = new Intent(getApplicationContext(), Activity3.class);
       // startActivity(launchActivity);


        //TextView t = (TextView)findViewById(R.id.test);
        //t.setText(p._name);
    }
    public void toggleLabel4(View v){
        num+=1;

        TextView t= (TextView)findViewById(R.id.bac);
        String meh = String.format("%1.3f", m.setAlcohol(num, p.getWeight(),p.getAlc(),p.getMet()));
        t.setText(meh);
    }
}
