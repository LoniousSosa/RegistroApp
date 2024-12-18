package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilAdministrador extends AppCompatActivity {
    LinearLayout line1,line2,line3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_administrador);
        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line1.setOnClickListener(v -> {
            intent = new Intent(this, ListaAlumnos.class);
            startActivity(intent);
        });
        line2.setOnClickListener(v -> {
            intent = new Intent(this, AsistenciaAlumnos.class);
            startActivity(intent);
        });
        line3.setOnClickListener(v -> {
            intent = new Intent(this, GestionarClases.class);
            startActivity(intent);
        });
    }
}