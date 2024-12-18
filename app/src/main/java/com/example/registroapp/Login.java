package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {
    ImageButton tarjetaButton;
    Button logInButton;
    TextView registerText;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerText = findViewById(R.id.registerText);
        tarjetaButton = findViewById(R.id.tarjetaImage);
        logInButton = findViewById(R.id.logInButton);
        registerText.setOnClickListener(v -> {
            intent = new Intent(this, TarjetaActivity.class);
            startActivity(intent);
        });
        tarjetaButton.setOnClickListener(v -> {
            intent = new Intent(this,TarjetaActivity.class);
            startActivity(intent);
        });
        logInButton.setOnClickListener(v -> {
            intent = new Intent(this, PerfilUsuario.class);
            startActivity(intent);
        });
    }
}