package com.example.talkin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Ow_level extends AppCompatActivity {

    ListView levelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ow_level);

        levelList = findViewById(R.id.levelList);
    }
}
