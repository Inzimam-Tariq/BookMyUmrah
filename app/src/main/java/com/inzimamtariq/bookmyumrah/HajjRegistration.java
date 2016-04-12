package com.inzimamtariq.bookmyumrah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class HajjRegistration extends AppCompatActivity {

    private String[] cities, packages, persons;
    private Spinner spin_cities, spin_packages, spin_adult, spin_infant, spin_child;
    private Button nav_collapse, nav_expand;
    private LinearLayout conDiv, exp_Div;

//    NumberPicker npAdult, npInfant, npChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        callReferences();

//        npAdult.setMinValue(1);
//        npAdult.setMaxValue(100);
//        npAdult.setWrapSelectorWheel(true);
//
//        npInfant.setMinValue(1);
//        npInfant.setMaxValue(100);
//        npInfant.setWrapSelectorWheel(true);
//
//        npChild.setMinValue(1);
//        npChild.setMaxValue(100);
//        npChild.setWrapSelectorWheel(true);

//        npAdult.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//
//            @Override
//            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//                // TODO Auto-generated method stub
//
//                String Old = String.valueOf(npAdult.getValue());
//
//                Toast.makeText(getApplicationContext(), Old, Toast.LENGTH_SHORT).show();
//            }
//        });


        nav_collapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conDiv.setVisibility(View.INVISIBLE);
                exp_Div.setVisibility(View.VISIBLE);
            }
        });
        exp_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp_Div.setVisibility(View.GONE);
                conDiv.setVisibility(View.VISIBLE);
            }
        });

        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cities);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_cities.setAdapter(cityAdapter);

        spin_cities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        ArrayAdapter<String> adultAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, persons);
        adultAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_adult.setAdapter(adultAdapter);

        spin_adult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        ArrayAdapter<String> infantAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, persons);
        infantAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_infant.setAdapter(infantAdapter);

        spin_infant.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });


        ArrayAdapter<String> childAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, persons);
        childAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_child.setAdapter(childAdapter);

        spin_child.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(getApplicationContext(), "Your Item Position is : " + position, Toast.LENGTH_LONG).show();
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

    private void callReferences() {
        cities = getResources().getStringArray(R.array.cities_list);
        spin_cities = (Spinner) findViewById(R.id.cities);

        packages = getResources().getStringArray(R.array.packages_list);
        spin_packages = (Spinner) findViewById(R.id.packages);

        persons = getResources().getStringArray(R.array.person_list);
        spin_adult = (Spinner) findViewById(R.id.adult);
        spin_infant = (Spinner) findViewById(R.id.infant);
        spin_child = (Spinner) findViewById(R.id.child);

        nav_collapse = (Button) findViewById(R.id.nav_btn_collapse);
        conDiv = (LinearLayout) findViewById(R.id.contact_panel);
        exp_Div = (LinearLayout) findViewById(R.id.nav_btn_expand);
//        npAdult = (NumberPicker) findViewById(R.id.adult);
//        npInfant = (NumberPicker) findViewById(R.id.infant);
//        npChild = (NumberPicker) findViewById(R.id.child);


    }

}
