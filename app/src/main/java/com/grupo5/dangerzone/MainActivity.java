package com.grupo5.dangerzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lugar lugar = new Lugar("Oficina","Carrera 59 # 21 -21",
                7.1377,-73.121, TipoLugar.COMPRAS,
                5159000, "https://www.jjmasof.esy.es/","detalles y publicidad",5);
        mensaje = findViewById(R.id.txt_mensaje);
        mensaje.setText(lugar.toString()); // lugar.toString();
        Log.d("Tag en Main","Mensaje prueba por el logcat "+lugar.toString());
    }
}