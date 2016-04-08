package com.inzimamtariq.bookmyumrah;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class UmrahFragment extends Fragment {

    public UmrahFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_umrah, container, false);

//        LinearLayout layout = (LinearLayout) findViewById(R.id.searchB);
//        if (layout != null) {
//            layout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
////                    Toast.makeText(getApplicationContext(), "Yeah Its working!", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(getApplicationContext(), MainPage.class));
//                }
//            });
//        }
    }

}