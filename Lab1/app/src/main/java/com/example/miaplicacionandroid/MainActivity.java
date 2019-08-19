package com.example.miaplicacionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contador =0;
    private TextView textoContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoContador = (TextView) findViewById(R.id.txt_marcador);
    }

    public void showToast(View view){

        Toast.makeText(this, getString(R.string.mensaje)+" " + textoContador.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view){
        ++contador;
        textoContador.setText(Integer.toString(contador));
    }

}
