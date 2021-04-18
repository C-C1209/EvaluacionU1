package com.example.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Camiones extends AppCompatActivity {

    protected TextView hora;
    protected TextView fecha;
    protected Button V,T,C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camiones);
        getSupportActionBar().hide();
        Date d=new Date();
        fecha = findViewById(R.id.txtFecha);
        hora = findViewById(R.id.txtHora);
        V = findViewById(R.id.btnVuelos);
        T = findViewById(R.id.btnTrenes);
        C = findViewById(R.id.btnCamiones);

        SimpleDateFormat fech=new SimpleDateFormat("dd/MM/yyyy");
        String completo = fech.format(d);
        fecha.setText(completo);

        SimpleDateFormat ho=new SimpleDateFormat("h:mm a");
        String horaString = ho.format(d);
        hora.setText(horaString);

        V.setOnClickListener(v -> {
            Intent i = new Intent(Camiones.this, Vuelos.class);
            startActivity(i);
        });

        T.setOnClickListener(v -> {
            Intent i = new Intent(Camiones.this, Trenes.class);
            startActivity(i);
        });

        C.setBackgroundResource(R.drawable.btnmenuscamionprensado);
        C.setTextColor(Color.parseColor("#DE36DE"));

    }

}