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
        RepositorioLugares lugares = (RepositorioLugares) new LugaresLista();
        for (int i=0; i<lugares.tamaño();i++){
            System.out.println(lugares.elemento(i).toString());
        }
    }

}