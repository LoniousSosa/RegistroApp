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

public class TarjetaActivity extends AppCompatActivity {

    Button logInButton,registerButton,adminButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);
        logInButton = findViewById(R.id.nextButton);
        registerButton = findViewById(R.id.nextButtonRegister);
        adminButton = findViewById(R.id.botonAdmin);
        logInButton.setOnClickListener(v -> {
            intent = new Intent(this, PerfilUsuario.class);
            startActivity(intent);
        });
        registerButton.setOnClickListener(v -> {
            intent = new Intent(this, Register.class);
            startActivity(intent);
        });
        adminButton.setOnClickListener(v -> {
            intent = new Intent(this, PerfilAdministrador.class);
            startActivity(intent);
        });
    }
}