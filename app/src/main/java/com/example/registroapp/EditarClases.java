package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EditarClases extends AppCompatActivity {

    ImageButton imageButtonAñadirClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_clases);
        imageButtonAñadirClase = findViewById(R.id.imageButtonAñadirClase);
        imageButtonAñadirClase.setOnClickListener(v -> {
           Intent intent = new Intent(this, InformacionClase.class);
           startActivity(intent);
        });
    }
}