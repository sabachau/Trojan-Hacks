package com.example.iniyai.eventsusc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CalendarView;
import java.util.GregorianCalendar;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

import java.util.Calendar;


public class AddEventActivity extends ActionBarActivity {
    String D = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
        Button bAdd1 = (Button) findViewById(R.id.eAdd1);
        final EditText mName = (EditText)findViewById(R.id.eName);
        mName.setHint("Your Name");
        final EditText mLoc = (EditText)findViewById(R.id.eLoc);
        CalendarView v =  (CalendarView) findViewById(R.id.cal) ;

        v.setOnDateChangeListener(new OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                D = String.valueOf(year) + "/" + String.valueOf(month) + "/" + String.valueOf(dayOfMonth);

            }
        });

        bAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AddEventActivity.this, MainActivity.class);
                List.add(mName.getText().toString(), mLoc.getText().toString(), D);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_event, menu);
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
