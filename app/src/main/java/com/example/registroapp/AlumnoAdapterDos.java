package com.example.registroapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AlumnoAdapterDos extends RecyclerView.Adapter<AlumnoAdapterDos.AlumnoViewHolder> {

    private List<Alumno> alumnos;

    public AlumnoAdapterDos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @NonNull
    @Override
    public AlumnoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alumno, parent, false);
        return new AlumnoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlumnoAdapterDos.AlumnoViewHolder holder, int position) {
        Alumno alumno = alumnos.get(position);
        holder.nombreTextView.setText(alumno.getNombre());

        // Configurar acciones de los botones
        holder.checkButton.setOnClickListener(v ->
                Toast.makeText(holder.itemView.getContext(), "Check para " + alumno.getNombre(), Toast.LENGTH_SHORT).show()
        );

        holder.deleteButton.setOnClickListener(v ->
                Toast.makeText(holder.itemView.getContext(), "Eliminar a " + alumno.getNombre(), Toast.LENGTH_SHORT).show()
        );

        holder.messageButton.setOnClickListener(v ->
                Toast.makeText(holder.itemView.getContext(), "Mensaje a " + alumno.getNombre(), Toast.LENGTH_SHORT).show()
        );
    }


    @Override
    public int getItemCount() {
        return alumnos.size();
    }

    static class AlumnoViewHolder extends RecyclerView.ViewHolder {

        TextView nombreTextView;
        ImageView checkButton, deleteButton, messageButton;

        public AlumnoViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.nombre_alumno);
            checkButton = itemView.findViewById(R.id.check_button);
            deleteButton = itemView.findViewById(R.id.delete_button);
            messageButton = itemView.findViewById(R.id.message_button);
        }
    }
}