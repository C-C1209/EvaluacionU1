package com.example.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vuelos extends AppCompatActivity{

    protected TextView hora;
    protected TextView fecha;
    protected Button V,T,C;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuelos);
        getSupportActionBar().hide();
        Date d=new Date();
        fecha = findViewById(R.id.txtFecha);
        hora = findViewById(R.id.txtHora);
        T = findViewById(R.id.btnTrenes);
        C = findViewById(R.id.btnCamiones);
        V = findViewById(R.id.btnVuelos);

        SimpleDateFormat fech=new SimpleDateFormat("dd/MM/yyyy");
        String completo = fech.format(d);
        fecha.setText(completo);

        SimpleDateFormat ho=new SimpleDateFormat("h:mm a");
        String horaString = ho.format(d);
        hora.setText(horaString);


        T.setOnClickListener(v -> {
            Intent i = new Intent(Vuelos.this, Trenes.class);
            startActivity(i);
        });

        C.setOnClickListener(v ->{
            Intent i = new Intent(Vuelos.this, Camiones.class);
            startActivity(i);
        });

        V.setBackgroundResource(R.drawable.btnmenusprensado);
        V.setTextColor(Color.parseColor("#363CDE"));
    }

}