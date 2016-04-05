package com.inzimamtariq.bookmyumrah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hiding default app icon

//        ActionBar actionBar = getActionBar();
//        if (actionBar != null) {
//            actionBar.setDisplayShowHomeEnabled(false);
//
//            //displaying custom ActionBar
//            @SuppressLint("InflateParams") View mActionBarView = getLayoutInflater().inflate(R.layout.my_action_bar, null);
//            actionBar.setCustomView(mActionBarView);
//            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        }

//        getActionBar().setTitle(null);
//        getActionBar().setSubtitle(null);
//
//        // set image
//        ImageView img = new ImageView(getApplicationContext());
//        img.setImageResource(R.drawable.logo);
//        getActionBar().setCustomView(img, new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT));
//
//        // Enable Custom View
//        getActionBar().setDisplayShowCustomEnabled(true);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
//            actionBar.setIcon(R.drawable.logo);
            actionBar.setTitle(null);
            actionBar.setSubtitle(null);

            actionBar.setDisplayShowHomeEnabled(false);

           //displaying custom ActionBar
            View mActionBarView = getLayoutInflater().inflate(R.layout.activity_action_bar, null);
            actionBar.setCustomView(mActionBarView);
            actionBar.setDisplayOptions(android.support.v7.app.ActionBar.DISPLAY_SHOW_CUSTOM);

        }

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        Button btn = (Button) findViewById(R.id.btn_search);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivityWithNavigationDrawer.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
            return true;
//        }

//        return super.onOptionsItemSelected(item);
    }
}
