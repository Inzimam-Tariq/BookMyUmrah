package com.inzimamtariq.bookmyumrah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Search extends AppCompatActivity {

    private Spinner spin_cities, spin_packages;
    private String[] cities, packages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cities = getResources().getStringArray(R.array.cities_list);
        spin_cities = (Spinner) findViewById(R.id.cities);

        packages = getResources().getStringArray(R.array.packages_list);
        spin_packages = (Spinner) findViewById(R.id.packages);


        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cities);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_cities.setAdapter(cityAdapter);

        spin_cities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
//                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });


        ArrayAdapter<String> packageAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, packages);
        packageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_packages.setAdapter(packageAdapter);

        spin_packages.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
//                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}

