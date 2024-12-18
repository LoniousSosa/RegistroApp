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

public class PerfilUsuario extends AppCompatActivity {
    Button asistencia,contacto,clases;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
        asistencia = findViewById(R.id.asistencia);
        contacto = findViewById(R.id.contacto);
        clases = findViewById(R.id.clases);
        asistencia.setOnClickListener(v -> {
            intent = new Intent(this, AsistenciaInstituto.class);
            startActivity(intent);
        });
        contacto.setOnClickListener(v -> {
            intent = new Intent(this,PaginaContacto.class);
            startActivity(intent);
        });
        clases.setOnClickListener(v -> {
            intent = new Intent(this, PerfilAdministrador.class);
            startActivity(intent);
        });
    }
}