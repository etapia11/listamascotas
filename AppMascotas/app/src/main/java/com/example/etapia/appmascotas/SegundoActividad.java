package com.example.etapia.appmascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Etapia on 26/11/2016.
 */

public class SegundoActividad  extends AppCompatActivity   {
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotasfavoritas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        onSupportNavigateUp();


        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

    }


}
