package com.example.iniyai.eventsusc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
<<<<<<< HEAD
import android.widget.Button;
=======
>>>>>>> d96f1e0d9ec1776e8b9e74a50889b7dcb183f2a1
import android.widget.ListView;
import android.widget.Toast;
import android.database.sqlite.*;


public class MainActivity extends ActionBarActivity {
<<<<<<< HEAD
    public List publicList = new List();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] nameArray = List.getNames();
=======

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SQLiteDatabase mydatabase = openOrCreateDatabase("TrojanHacks",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS USCEvents(Name VARCHAR(100), Date DATE, Location VARCHAR(100), PRIMARY KEY(Name)));");
        mydatabase.execSQL("INSERT INTO USCEvents IF NOT EXISTS VALUES('Trojan Hacks', '2016-10-29', 'TCC Forum');");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] nameArray = { "TrojanHacks", "Wayne", "Bill"};
>>>>>>> d96f1e0d9ec1776e8b9e74a50889b7dcb183f2a1
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                nameArray);
        ListView l1 = (ListView) findViewById(R.id.list1);
        l1.setAdapter(adapter);

<<<<<<< HEAD
        Toast toast = Toast.makeText(getApplicationContext(), String.valueOf(List.count), Toast.LENGTH_SHORT);
        toast.show();

=======
>>>>>>> d96f1e0d9ec1776e8b9e74a50889b7dcb183f2a1
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Value1", nameArray[position]);
                startActivity(i);
            }
        });
<<<<<<< HEAD

        Button bAdd = (Button) findViewById(R.id.b2);
        bAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddEventActivity.class);
                i.putExtra("Value1", "Yay, you got to the second screen");
                i.putExtra("Value2", 56);
                startActivity(i);
            }
        });
=======
>>>>>>> d96f1e0d9ec1776e8b9e74a50889b7dcb183f2a1
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
}
