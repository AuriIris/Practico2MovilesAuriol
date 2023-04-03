package com.example.practico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble> lista= new ArrayList<Inmueble>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();

    }
    public void generarListView(){
        ArrayAdapter<Inmueble> adapter=new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv= findViewById(R.id.milista);
        lv.setAdapter(adapter);

    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"Juana koslay", 8000));
        lista.add(new Inmueble(R.drawable.casa2,"San luis", 15000));
        lista.add(new Inmueble(R.drawable.casa3,"Lujan", 19000));

    }
}