package com.example.registroapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder> {

    private List<Alumno> alumnos;

    public AlumnoAdapter(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @NonNull
    @Override
    public AlumnoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alumno, parent, false);
        return new AlumnoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlumnoViewHolder holder, int position) {
        Alumno alumno = alumnos.get(position);
        holder.nombre.setText(alumno.getNombre());
        holder.clase.setText(alumno.getClase());
    }

    @Override
    public int getItemCount() {
        return alumnos.size();
    }

    static class AlumnoViewHolder extends RecyclerView.ViewHolder {

        TextView nombre, clase;
        ImageView editar;

        public AlumnoViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre_alumno);
            clase = itemView.findViewById(R.id.clase_alumno);
            editar = itemView.findViewById(R.id.editar_alumno);
        }
    }
}