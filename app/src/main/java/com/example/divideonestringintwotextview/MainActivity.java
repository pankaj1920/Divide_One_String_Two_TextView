package com.example.divideonestringintwotextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name);
        TextView last_name = (TextView) findViewById(R.id.last_name);


        String full_name = "Pankaj Bohra";

        //if any String contain 'Space','Tab',NewLine','Symbol' etc
        //StringTockenizer Class divid the String the the full_name String Contain
        //Space so Sting is divide into to part 'Pankaj','Bohra'

        StringTokenizer stringTokenizer = new StringTokenizer(full_name);

        //this will set first part of String to name i.e 'Pankaj'

        name.setText(stringTokenizer.nextToken());

        //This will set second part of String to last_name i.e 'Bohra'

        last_name.setText(stringTokenizer.nextToken());

/*
        String scentence= "This is Another Text@This is My Text@This is Your Text";

        //here is SecondParameter '@' indicate that the String is divide from @ Sign. we can use also use any keyword from String
        StringTokenizer stringTokenizer = new StringTokenizer(scentence,"@");

        name.setText(stringTokenizer.nextToken());

        last_name.setText(stringTokenizer.nextToken());
*/
    }
}
