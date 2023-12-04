package com.example.examen_getbyte.ui.Animal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.examen_getbyte.R;

public class AnimalDetailsActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        // 1. Enviar objetos de un adaptador a un activity: investigar
        // 2. Implementar el viewBinding

        TextView item_anl_dtls_tv_nombre = findViewById(R.id.item_anl_dtls_tv_nombre);
        TextView item_anl_dtls_tv_edad = findViewById(R.id.item_anl_dtls_tv_edad);
        TextView item_anl_dtls_tv_raza = findViewById(R.id.item_anl_dtls_tv_raza);
        TextView item_anl_dtls_tv_snd_gato = findViewById(R.id.item_anl_dtls_tv_snd_gato);

        String nombre = getIntent().getStringExtra("nombre");
        int edad = getIntent().getIntExtra("edad", 0);
        String raza = getIntent().getStringExtra("raza");
        String sonido = getIntent().getStringExtra("sonido");

        item_anl_dtls_tv_nombre.setText("Nombre: " + nombre);
        item_anl_dtls_tv_edad.setText("Edad: " + edad);
        item_anl_dtls_tv_raza.setText("Raza: " + raza);
        item_anl_dtls_tv_snd_gato.setText("Sonido: " + sonido);
    }
    public void regresarMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
