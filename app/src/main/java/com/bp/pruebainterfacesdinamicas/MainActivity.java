package com.bp.pruebainterfacesdinamicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/* Crea un editText de forma dinámica cuando se pulsa un botón.
*  Se podría crear dinamicamente cualquier elemento. */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se declara el espacio que contendrá los editText, en este caso un LinearLayout.
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        //Se declara el botón que genera los editText.
        Button btn = (Button) findViewById(R.id.addBtn);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se crea el editText
                EditText edit = new EditText(MainActivity.this);
                //y se estable su hint.
                edit.setHint("Nuevo editText");
                //Los LayoutParams sirven para especificar las propiedades (ancho y alto).
                LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
                //Se establecen las propiedades al editText.
                edit.setLayoutParams(layoutParams);
                //y se añade a la vista.
                linearLayout.addView(edit);
            }
        });
    }
}
