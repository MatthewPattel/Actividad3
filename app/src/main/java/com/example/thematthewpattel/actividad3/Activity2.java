package com.example.thematthewpattel.actividad3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent Actividad = getIntent();
        String RecibirNombres = Actividad.getStringExtra(MainActivity.EXTRA_NOMBRE);
        String RecibirApellido = Actividad.getStringExtra(MainActivity.EXTRA_APELLIDO);
        int RecibirEdad = Actividad.getIntExtra(MainActivity.EXTRA_EDAD, 0);

        TextView mostrarN = (TextView) findViewById(R.id.mostrarNombres);
        TextView mostrarA = (TextView) findViewById(R.id.mostrarApellidos);
        TextView mostrarE = (TextView) findViewById(R.id.mostrarEdad);

        mostrarN.setText(RecibirNombres);
        mostrarA.setText(RecibirApellido);
        mostrarE.setText("" + RecibirEdad);
    }
}
