package com.example.sourabh.autocompletetextviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private String[] string;
    private ArrayAdapter adapter;
    private AutoCompleteTextView auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        string = new String[]{"Gourav","Ben","Jack","Bosco","Ganache","Julie","Jessica"};  //Creating & initializing an array with some values
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,string); //Creating a new adapter to display AutoCompleteTextView with an array items
        auto = (AutoCompleteTextView)findViewById(R.id.text);
        auto.setAdapter(adapter);  //setting adapter to an AutoCompleteTextView to display array items
        auto.setThreshold(1);  /* setThreshold(int) : Defines the number of characters that the user must type before completion
                                     suggestions are displayed in a drop down menu. */



    }
}
