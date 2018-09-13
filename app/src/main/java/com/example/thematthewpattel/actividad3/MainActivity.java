package com.example.thematthewpattel.actividad3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOMBRE = "com.example.application.example.EXTRA_NOMBRE";
    public static final String EXTRA_APELLIDO = "com.example.application.example.EXTRA_APELLIDO";
    public static final String EXTRA_EDAD = "com.example.application.example.EXTRA_EDAD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        }
        );

    }

    public void openActivity2() {
        EditText Nombres = (EditText) findViewById(R.id.insertarNombres);
        String SendNombres = Nombres.getText().toString();

        EditText Apellidos = (EditText) findViewById(R.id.insertarApellidos);
        String SendApellidos = Apellidos.getText().toString();

        EditText Edad = (EditText) findViewById(R.id.insertarEdad);
        int SendEdad = Integer.parseInt(Edad.getText().toString());

        Intent Actividad = new Intent(this, Activity2.class);
        Actividad.putExtra(EXTRA_NOMBRE, SendNombres);
        Actividad.putExtra(EXTRA_APELLIDO, SendApellidos);
        Actividad.putExtra(EXTRA_EDAD, SendEdad);
        startActivity(Actividad);
    }

}
