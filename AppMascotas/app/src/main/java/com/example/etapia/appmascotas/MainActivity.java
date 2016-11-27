package com.example.etapia.appmascotas;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascota;
    private RecyclerView listamascotas;
    Toolbar miactbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miactbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(miactbar);

        listamascotas = (RecyclerView) findViewById(R.id.rvmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listamascotas.setLayoutManager(llm);
        iniciardatos();
        inicializaradaptador();
    }

    public void irSegundaActividad(View v){

        Intent intent = new Intent(this, SegundoActividad.class);
        startActivity(intent);
    }


    public void inicializaradaptador()
    {
        mascotaadaptador adaptador  = new mascotaadaptador(mascota);
        listamascotas.setAdapter(adaptador);
    }

    public void iniciardatos(){
        mascota = new ArrayList<>();
        mascota.add(new Mascotas("candy",0, R.drawable.perros_1 ));
        mascota.add(new Mascotas("lazy",0, R.drawable.perro_2 ));
        mascota.add(new Mascotas("ruffo",0, R.drawable.perro_3 ));
        mascota.add(new Mascotas("toto",0, R.drawable.perro_4 ));
        mascota.add(new Mascotas("killer",0, R.drawable.perro_5 ));
    }
}
