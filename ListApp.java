package com.example.timeapp;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class ListApp extends Activity
        implements AdapterView.OnItemSelectedListener {
    Spinner selection;
    String[] items={"app","TimeApp", "Web1", "File1",
            "AllApp"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.list);
        selection=(Spinner) findViewById(R.id.simpleSpinner);

        Spinner spin=(Spinner)findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);


        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                items);

        aa.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    public void onItemSelected(AdapterView<?> parent,
                               View v, int position, long id) {

        String name=items[position];
        switch(name){
            case "TimeApp":
                //Intent in=new Intent(getApplicationContext(),.class);
                //startActivity(in);
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
                break;

            case "Web1":
                //Intent in1=new Intent(getApplicationContext(),Web1.class);
                // startActivity(in1);
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
                break;



            case "File1":
                //Intent in3=new Intent(getApplicationContext(),File1.class);
                //startActivity(in3);
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
                break;
            case "AllApp":
                //Intent in2=new Intent(getApplicationContext(),AllApp.class);
                //startActivity(in2);
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
                break;



            default:Toast.makeText(getApplicationContext(),"not use",Toast.LENGTH_SHORT).show();

        }}

    public void onNothingSelected(AdapterView<?> parent) {

    }
}
