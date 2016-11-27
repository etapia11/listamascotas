package com.example.etapia.appmascotas;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


/**
 * Created by Etapia on 25/11/2016.
 */

public class mascotaadaptador extends RecyclerView.Adapter<mascotaadaptador.MascotaViewHolder> {

    ArrayList<Mascotas> mascotas;
    int count = 0;

    public mascotaadaptador(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }

    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascotas,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascotas mascota = mascotas.get(position);

        mascotaViewHolder.foto.setImageResource(mascota.getFoto());
        mascotaViewHolder.nombre.setText(mascota.getNombre());

        mascotaViewHolder.btnlike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count ++;
                mascotaViewHolder.contador.setText(String.valueOf(count)) ;
            }
           });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        CardView lmas;
        private ImageView foto;
        private TextView nombre;
        private TextView contador;
        private ImageButton btnlike;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            lmas = (CardView)itemView.findViewById(R.id.rvmascotas);
            foto = (ImageView) itemView.findViewById(R.id.mascotafoto);
            nombre = (TextView) itemView.findViewById(R.id.mascotanombre);
            contador = (TextView) itemView.findViewById(R.id.contador);
            btnlike = (ImageButton) itemView.findViewById(R.id.btnlike);
        }
    }

}
