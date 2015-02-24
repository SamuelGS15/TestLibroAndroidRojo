package com.samuel.saboya.garcia.testlibroandroidrojo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Samuel on 24/02/2015.
 */
public class ActividaddB extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // aquí simplemente nos inventamos un dato de
        // retorno a partir de un texto constante
        // pero el proceso puede ser mas complicado

        // el objeto intent
        Intent datos = new Intent();

        String dato = "-datos devueltos a la actividad que se invocó-";

        // se asigna el resultado
        // Uri.parse() crea un Uri a partir de la cadena
        // pasada por parámetro
        datos.setData(Uri.parse(dato));

        // setResult es un método de la clase Activity
        // para devolver datos a la actividad invocante
        setResult(RESULT_OK, datos);

        // finaliza la actividad
        // método finish() de la Activity
        finish();


    }
}
