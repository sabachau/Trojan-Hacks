package com.example.iniyai.eventsusc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String val1 = getIntent().getStringExtra("Value1");
        final TextView textViewToChange = (TextView) findViewById(R.id.t1);
        textViewToChange.setText(
                val1);
<<<<<<< HEAD
        final TextView textViewToChange2 = (TextView) findViewById(R.id.t2);
        textViewToChange2.setText(List.getEvent(val1).getDate());
        final TextView textViewToChange3 = (TextView) findViewById(R.id.t3);
        textViewToChange3.setText(
                List.getEvent(val1).getLocation());
=======
>>>>>>> d96f1e0d9ec1776e8b9e74a50889b7dcb183f2a1
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
}
