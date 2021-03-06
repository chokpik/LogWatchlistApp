package com.daca.logwatchlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ListasActivity extends AppCompatActivity {

    private String nombres[];
    private RecyclerView rvListas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);

        rvListas = findViewById(R.id.rvListas);
        nombres = getResources().getStringArray(R.array.nombres_listas);

        AdaptadorLista adapter = new AdaptadorLista(this, nombres);
        rvListas.setAdapter(adapter);
        rvListas.setLayoutManager(new LinearLayoutManager(this));

    }
}