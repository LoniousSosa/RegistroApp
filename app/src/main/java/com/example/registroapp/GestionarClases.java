package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class GestionarClases extends AppCompatActivity {

    Button addClass,editClass;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestionar_clases);
        addClass = findViewById(R.id.addClass);
        editClass = findViewById(R.id.editClass);
        addClass.setOnClickListener(v -> {
            intent = new Intent(this,AddPasoUno.class);
            startActivity(intent);
        });
        editClass.setOnClickListener(v -> {
            intent = new Intent(this, EditarClases.class);
            startActivity(intent);
        });
    }
}