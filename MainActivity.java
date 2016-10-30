package edu.usc.sigifres;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    //private Button mSendData;

    private Firebase mRef;
    private TextView mValueView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mValueView = (TextView) findViewById(R.id.value);

        mRef = new Firebase("https://uscevents-acc74.firebaseio.com/Event1/Title");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                mValueView.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        //Firebase.setAndroidContext(this);

        //mRef = new Firebase("https://uscevents-acc74.firebaseio.com/Event");
//
  //      mSendData = (Button) findViewById(R.id.sendData);

    //    mSendData.setOnClickListener(new View.OnClickListener() {
      //      @Override
        //    public void onClick(View v) {
          //      Firebase mRefChild = mRef.child("Event");

            //    mRef.setValue("Events");

    }
}
