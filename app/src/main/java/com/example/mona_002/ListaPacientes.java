package com.example.mona_002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListaPacientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacientes);

        //Intent intent = getIntent();
        // Using ArrayAdapter
        String[] StringArray = {"Quagmire","John","Cleveland","Peter"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,StringArray);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView <? > arg0, View view, int position, long id) {
                // When clicked, show a toast with the TextView text
                //Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                //        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Monitored_Screen.class);
                startActivity(intent);
            }
        });
    }

    public void seeMonitored(View v){
        Intent intent = new Intent(this, Monitored_Screen.class);
        startActivity(intent);
    }
}
