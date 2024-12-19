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

public class AddPasoUno extends AppCompatActivity {
    Button buttonNext;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_paso_uno);
        buttonNext = findViewById(R.id.ButtonNext);
        buttonNext.setOnClickListener(v -> {
            intent = new Intent(this,GestionarHorarioAdmi.class);
            startActivity(intent);
        });
    }
}