package com.example.mona_002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),CadastroMonitor.class);
                startActivity(intent);
            }
        });
    }

    public void entrar(View view){
        Intent intent = new Intent(this, ListaPacientes.class);
        startActivity(intent);
        //this.finish();
    }
}
