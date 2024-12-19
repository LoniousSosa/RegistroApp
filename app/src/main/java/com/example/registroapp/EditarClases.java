package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditarClases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_editar_clases);

        // Configura los márgenes del diseño principal
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Encuentra el botón por su ID
        ImageButton imageButtonAñadirClase = findViewById(R.id.imageButtonAñadirClase);

        // Configura el evento de clic para abrir la actividad de información de clase
        imageButtonAñadirClase.setOnClickListener(view -> {
            Intent intent = new Intent(EditarClases.this, InformacionClase.class);
            startActivity(intent);
        });
    }
}
