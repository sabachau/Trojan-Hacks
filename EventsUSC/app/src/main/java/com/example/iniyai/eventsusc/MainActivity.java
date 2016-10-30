package com.example.iniyai.eventsusc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.database.sqlite.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SQLiteDatabase mydatabase = openOrCreateDatabase("TrojanHacks",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS USCEvents(Name VARCHAR(100), Date DATE, Location VARCHAR(100), PRIMARY KEY(Name)));");
        mydatabase.execSQL("INSERT INTO USCEvents IF NOT EXISTS VALUES('Trojan Hacks', '2016-10-29', 'TCC Forum');");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] nameArray = { "TrojanHacks", "Wayne", "Bill"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                nameArray);
        ListView l1 = (ListView) findViewById(R.id.list1);
        l1.setAdapter(adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Value1", nameArray[position]);
                startActivity(i);
            }
        });
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
