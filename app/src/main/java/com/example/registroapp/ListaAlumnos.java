package com.example.registroapp;

import android.os.Bundle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlumnoAdapter adapter;
    private List<Alumno> alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear lista de alumnos
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Alumno 1", "Clase 1"));
        alumnos.add(new Alumno("Alumno 2", "Clase 2"));
        alumnos.add(new Alumno("Alumno 3", "Clase 3"));
        alumnos.add(new Alumno("Alumno 4", "Clase 4"));
        alumnos.add(new Alumno("Alumno 5", "Clase 5"));

        // Configurar Adapter
        adapter = new AlumnoAdapter(alumnos);
        recyclerView.setAdapter(adapter);

        // Botón añadir
        findViewById(R.id.add_button).setOnClickListener(v -> {
            alumnos.add(new Alumno("Alumno nuevo", "Nueva clase"));
            adapter.notifyItemInserted(alumnos.size() - 1);
        });

    }
}