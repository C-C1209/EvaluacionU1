package com.example.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Trenes extends AppCompatActivity {

    private TextView hora;
    private TextView fecha;
    private Button V,T,C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trenes);
        getSupportActionBar().hide();
        Date d=new Date();
        fecha = findViewById(R.id.txtFecha);
        hora = findViewById(R.id.txtHora);
        V = findViewById(R.id.btnVuelos);
        C = findViewById(R.id.btnCamiones);
        T = findViewById(R.id.btnTrenes);

        SimpleDateFormat fech=new SimpleDateFormat("dd/MM/yyyy");
        String completo = fech.format(d);
        fecha.setText(completo);

        SimpleDateFormat ho=new SimpleDateFormat("h:mm a");
        String horaString = ho.format(d);
        hora.setText(horaString);

        V.setOnClickListener(v -> {
            Intent i = new Intent(Trenes.this, Vuelos.class);
            startActivity(i);
        });

        C.setOnClickListener(v ->{
            Intent i = new Intent(Trenes.this, Camiones.class);
            startActivity(i);
        });

        T.setBackgroundResource(R.drawable.btnmenustrenprensado);
        T.setTextColor(Color.parseColor("#7F36DE"));
    }
}