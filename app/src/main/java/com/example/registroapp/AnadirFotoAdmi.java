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

public class AnadirFotoAdmi extends AppCompatActivity {
    Button buttonSave;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_foto_admi);
        buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(v -> {
            intent = new Intent(this, GestionarClases.class);
            startActivity(intent);
        });
    }
}