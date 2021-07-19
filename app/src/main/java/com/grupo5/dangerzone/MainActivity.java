package com.grupo5.dangerzone;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import
        com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //barra de acciones
        Toolbar toolbar = findViewById(R.id.toolbar_Main);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolbarLayout =
                findViewById(R.id.toolbar_layout_Main);
        toolbar.setTitle(getTitle());
        //Boton flotante FAB circular
        /**/
        FloatingActionButton fab =
                findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, R.string.mensaje_fab,
                        Snackbar.LENGTH_LONG).setAction("Accion",null).show();
            }
        });
        RepositorioLugares lugares = new LugaresLista();
        for (int i=0; i<lugares.tamaño();i++){
            System.out.println(lugares.elemento(i).toString());
            //mensaje.setText(lugares.elemento(i).toString());
        }
        // lugar.toString();
        Log.d("Tag en Main","Mensaje prueba por el logcat");
    }
    //mostrar menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.ajustes){
            Log.d("Tag en Main","Clic en la opción ajustes");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}