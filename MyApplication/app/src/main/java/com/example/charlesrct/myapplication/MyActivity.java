package com.example.charlesrct.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button botonHablar = (Button) findViewById(R.id.button);
        botonHablar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView repite = (TextView) findViewById(R.id.textView2);
                EditText origen = (EditText) findViewById(R.id.editText);
                repite.setText(origen.getText());

                quitarTeclado(origen);

            }

            private void quitarTeclado(View v) {
                InputMethodManager teclado = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                teclado.hideSoftInputFromWindow(v.getWindowToken(), 0);
            }
        });

        //TextView texto2 = (TextView) findViewById(R.id.textView2);
        //texto2.setBackgroundColor(0xFF0000);
        //texto2.setText("Hola desde code...");

        //Button btn1 = (Button) findViewById(R.id.boton1);
        //btn1.setText("Boton 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
