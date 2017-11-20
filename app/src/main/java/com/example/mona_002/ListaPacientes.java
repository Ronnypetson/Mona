package com.example.mona_002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaPacientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacientes);

        //Intent intent = getIntent();
        // Using ArrayAdapter
        String[] StringArray = {"1","2","3"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,StringArray);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
