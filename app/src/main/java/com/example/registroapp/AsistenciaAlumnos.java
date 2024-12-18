package com.example.registroapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class AsistenciaAlumnos extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlumnoAdapterDos adapter;
    private Button siguienteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistencia_alumnos);

        // Configurar RecyclerView
        recyclerView = findViewById(R.id.recycler_viewAsist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Configurar lista de alumnos
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Alumno 1"));
        listaAlumnos.add(new Alumno("Alumno 2"));
        listaAlumnos.add(new Alumno("Alumno 3"));
        listaAlumnos.add(new Alumno("Alumno 4"));
        listaAlumnos.add(new Alumno("Alumno 5"));

        // Configurar adaptador
        adapter = new AlumnoAdapterDos(listaAlumnos);
        recyclerView.setAdapter(adapter);

        // Configurar botón "Siguiente"
        siguienteButton = findViewById(R.id.nextButton);
        siguienteButton.setOnClickListener(v ->
                Toast.makeText(AsistenciaAlumnos.this, "Siguiente pulsado", Toast.LENGTH_SHORT).show()
        );
    }
}