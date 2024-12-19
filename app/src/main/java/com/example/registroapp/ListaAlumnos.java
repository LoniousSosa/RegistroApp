package com.example.registroapp;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos extends AppCompatActivity {
    private AlumnoAdapter adapter;
    EditText editAlumno, editClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alumnos);
        editAlumno = findViewById(R.id.editAlumno);
        editClase = findViewById(R.id.editClase);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Karen", "DAW"));
        alumnos.add(new Alumno("Pau", "DAM"));
        alumnos.add(new Alumno("Albaro", "ASIX"));
        alumnos.add(new Alumno("Lonious", "DAM"));
        alumnos.add(new Alumno("Guillermo", "ASIX"));

        adapter = new AlumnoAdapter(alumnos);
        recyclerView.setAdapter(adapter);


        findViewById(R.id.add_button).setOnClickListener(v -> {
            String nombreAlumno = editAlumno.getText().toString().trim();
            String claseAlumno = editClase.getText().toString().trim();

            if (!nombreAlumno.isEmpty() && !claseAlumno.isEmpty()) {
                alumnos.add(new Alumno(nombreAlumno, claseAlumno));
                adapter.notifyItemInserted(alumnos.size() - 1);

                editAlumno.setText("");
                editClase.setText("");
            } else {
                Toast.makeText(this, "Por favor, rellena ambos campos.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}