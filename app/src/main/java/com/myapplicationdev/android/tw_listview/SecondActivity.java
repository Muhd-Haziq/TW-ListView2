package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;

    ArrayList<Module> moduleArray;
    ModuleAdapter moduleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = findViewById(R.id.fishView);
        tvYear = findViewById(R.id.tvYear);


        moduleArray = new ArrayList<>();
        moduleAdapter = new ModuleAdapter(this, R.layout.row, moduleArray);
        lv.setAdapter(moduleAdapter);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        // Set List of Modules for Year Selected
        moduleArray.clear();
        if (year.equals("Year 1")) {
            moduleArray.add(new Module("C207", R.drawable.nonprog));
            moduleArray.add(new Module("C208", R.drawable.nonprog));
            moduleArray.add(new Module("C273", R.drawable.nonprog));
            moduleArray.add(new Module("C294", R.drawable.nonprog));
        } else if (year.equals("Year 2")) {
            moduleArray.add(new Module("C203", R.drawable.nonprog));
            moduleArray.add(new Module("C206", R.drawable.nonprog));
            moduleArray.add(new Module("C235", R.drawable.nonprog));
            moduleArray.add(new Module("C346", R.drawable.nonprog));
            moduleArray.add(new Module("C348", R.drawable.nonprog));
            moduleArray.add(new Module("C273", R.drawable.nonprog));
            moduleArray.add(new Module("C308", R.drawable.nonprog));
        } else if (year.equals("Year 3")) {
            moduleArray.add(new Module("C390", R.drawable.prog));
            moduleArray.add(new Module("C349", R.drawable.prog));
            moduleArray.add(new Module("C347", R.drawable.prog));
        }
        moduleAdapter.notifyDataSetChanged();

    }



}
