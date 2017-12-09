package com.example.mona_002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroMonitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_monitor);
    }

    public void seeMainScreen(View v){
        Intent intent = new Intent(this, ListaPacientes.class);
        startActivity(intent);
    }
}
