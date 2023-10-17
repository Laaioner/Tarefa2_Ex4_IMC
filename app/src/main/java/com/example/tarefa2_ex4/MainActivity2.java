package com.example.tarefa2_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView recebaAltura, recebaPeso, recebaImc, recebaNivel;
    float peso, altura, calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recebaPeso = findViewById(R.id.RecPeso);
        recebaAltura = findViewById(R.id.recAlt);
        recebaImc = findViewById(R.id.recIMC);
        recebaNivel = findViewById(R.id.recNivel);

        Bundle dados = getIntent().getExtras();
        peso = Float.parseFloat(dados.getString("peso"));
        altura = Float.parseFloat(dados.getString("altura"));

        recebaAltura.setText(String.valueOf(altura));
        recebaPeso.setText(String.valueOf(peso));

        calculo = peso/(altura*altura);

        if(calculo >= 40){
            recebaNivel.setText("Obesidade grau 3");
            recebaImc.setText(String.valueOf(calculo));
        } else if (calculo >= 35 && calculo <= 39.9 ) {
            recebaNivel.setText("Obesidade grau 2");
            recebaImc.setText(String.valueOf(calculo));
        }else if (calculo >= 30 && calculo <= 34.9 ) {
            recebaNivel.setText("Obesidade grau 1");
            recebaImc.setText(String.valueOf(calculo));
        }else if (calculo >= 25 && calculo <= 29.9 ) {
            recebaNivel.setText("Levemente aciam do peso");
            recebaImc.setText(String.valueOf(calculo));
        }else if (calculo >= 18.6 && calculo <= 24.9 ) {
            recebaNivel.setText("Peso ideal");
            recebaImc.setText(String.valueOf(calculo));
        }else {
            recebaNivel.setText("Abaixo do peso");
            recebaImc.setText(String.valueOf(calculo));
        }
    }
}