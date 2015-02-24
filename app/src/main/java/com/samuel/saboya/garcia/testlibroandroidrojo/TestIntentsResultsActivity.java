package com.samuel.saboya.garcia.testlibroandroidrojo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class TestIntentsResultsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intents_results);

        // estamos atentos al clic botón
        Button button2 = (Button) this.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se pasa el nombre de la actividad
                // y un identificador que se utilizará
                // en el retorno para saber dónde
                // vienen esos dats

                // si se pasa el identificador -4
                // no habrá devolución de resultados
                // es decir, este método actuaría igual
                // que startActivity()
                // Intent intent = new Intent(TestIntentsResultsActivity.this,ActividaddB.class );
                startActivityForResult(new Intent("com.samuel.saboya.garcia.testlibroandroidrojo.ActividaddB"),1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // procesa los datos de la actividad invocada
        if(resultCode == RESULT_OK) {
            Toast.makeText(this, "La actividad con el identificador " + Integer.toString(requestCode)
                            +" envía estos datos "+ data.getData().toString(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Problema de obtención de datos desde otra actividad ", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_intents_results, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
