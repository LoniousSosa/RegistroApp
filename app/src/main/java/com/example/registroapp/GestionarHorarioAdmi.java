package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GestionarHorarioAdmi extends AppCompatActivity {
    LinearLayout line1,line2,line3;
    Button buttonNext;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestionar_horario_admi);
        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);

        line1.setOnClickListener(v -> {
            intent = new Intent(this,SeleccionarHora.class);
            startActivity(intent);
        });
        line2.setOnClickListener(v -> {
            intent = new Intent(this,SeleccionarHora.class);
            startActivity(intent);
        });
        line3.setOnClickListener(v -> {
            intent = new Intent(this,SeleccionarHora.class);
            startActivity(intent);
        });

        buttonNext = findViewById(R.id.ButtonNext);
        buttonNext.setOnClickListener(v -> {
            intent = new Intent(this,GestionarHorarioAdmi.class);
            startActivity(intent);
        });
    }
}