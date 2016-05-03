package com.inzimamtariq.bookmyumrah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class splash extends AppCompatActivity {

    Thread activityThread, graphicThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final FrameLayout containerFrame = (FrameLayout) findViewById(R.id.splash_graphics_container);
//        final LinearLayout logFrame = (LinearLayout) findViewById(R.id.logoCon);
        final LinearLayout conFrame = (LinearLayout) findViewById(R.id.versionCon);

        graphicThread = new Thread() {
            public void run() {

                try {
                    sleep(1500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
//                } finally{
//                    Toast.makeText(getApplicationContext(), "Good to Go", Toast.LENGTH_SHORT).show();
////                    logFrame.setVisibility(View.VISIBLE);
////                    conFrame.setVisibility(View.VISIBLE);
                }
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (containerFrame != null) {
                                containerFrame.setVisibility(View.VISIBLE);
                            }
                        }
                    });
            }
        };
        graphicThread.start();

         activityThread = new Thread() {
            public void run() {

                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally{
                    Intent intent = new Intent(getApplicationContext(), MainActivityWithNavigationDrawer.class);
                    startActivity(intent);
                }
            }
        };
        activityThread.start();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        activityThread.splash();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        activityThread.splash();
    }
}
