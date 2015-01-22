package com.example.jarek.drinking;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    String name;
    private Spinner spinner;
    private static final String[]paths = {"item 1", "item 2", "item 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner dropdown = (Spinner)findViewById(R.id.drop);
        String[] items = new String[]{"1", "2", "three"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        dropdown.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void toggleLabel(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), Activity2.class);
        startActivity(launchActivity);
}
    public void toggleLabel2(View V){
        Spinner f = (Spinner) findViewById(R.id.drop);
        name = (String) f.getSelectedItem();
        //go to new activity
    }

}
