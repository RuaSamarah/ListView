package com.example.ruaasamara.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] carsArray = {"BMW","Audi","Mercedes","Toyota","Golf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, carsArray);

        ListView listView = (ListView) findViewById(R.id.Cars_List);
        listView.setAdapter(adapter);
    }
}
