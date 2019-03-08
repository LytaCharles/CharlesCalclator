package com.example.charlescalclator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void myfirstbutton(View view){



        EditText edittextnumberone = (EditText) findViewById(R.id.edittextnumberone);

        EditText edittexttwo = (EditText) findViewById(R.id.edittexttwo);

        TextView  ans = (TextView) findViewById(R.id.mytextview);

        int  myedittextnumberone = Integer.parseInt(edittextnumberone.getText().toString());
       int myedittextnumbertwo = Integer.parseInt(edittexttwo.getText().toString());


       int results = myedittextnumberone + myedittextnumbertwo;

       ans.setText(results + ""); 






    }





}
