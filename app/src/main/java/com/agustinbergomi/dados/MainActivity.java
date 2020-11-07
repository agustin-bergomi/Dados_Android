package com.agustinbergomi.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ImageView dado;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.btn_tirar);
        dado = (ImageView) findViewById(R.id.iv_dado);
        Random rand = new Random();

        //se utiliza un Listener, en este caso onclick
        //con el listener se va a escuchar cada click
        //el metodo esta asignado a btn_tirar
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero_aleatorio = rand.nextInt(6);

                if(numero_aleatorio == 0){
                    dado.setImageResource(R.drawable.dado1);
                }
                else if(numero_aleatorio == 1){
                    dado.setImageResource(R.drawable.dado2);
                }
                else if(numero_aleatorio == 2){
                    dado.setImageResource(R.drawable.dado3);
                }
                else if(numero_aleatorio == 3){
                    dado.setImageResource(R.drawable.dado4);
                }
                else if(numero_aleatorio == 4){
                    dado.setImageResource(R.drawable.dado5);
                }
                else if(numero_aleatorio == 5) {
                    dado.setImageResource(R.drawable.dado6);
                }

            }
        });


    }



    }

