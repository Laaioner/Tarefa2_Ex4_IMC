package com.example.tarefa2_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText calcPeso, calcAltura;
    Button buttonEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.btnCalcular);
        calcPeso = findViewById(R.id.peso);
        calcAltura = findViewById(R.id.altura);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("altura",calcAltura.getText().toString());
                intent.putExtra("peso",calcPeso.getText().toString());
                startActivity(intent);
            }
        });
    }



}