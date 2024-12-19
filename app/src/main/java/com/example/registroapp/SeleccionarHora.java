package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeleccionarHora extends AppCompatActivity {
    Button buttonCancelar,buttonAceptar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_hora);
        buttonCancelar = findViewById(R.id.buttonCancelar);
        buttonAceptar = findViewById(R.id.buttonAceptar);
        intent = new Intent(this,GestionarHorarioAdmi.class);
        buttonCancelar.setOnClickListener(v -> {
            startActivity(intent);
        });
        buttonAceptar.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}