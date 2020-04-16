package com.practicas.captaciondebotones;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRojo;
    private Button btnVerde;
    private Button btnAzul;
    private Button btnNegro;
    private TextView textoPrueba;
    private Button btnMas;
    private Button btnMenos;
    public float tamano=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRojo = (Button) findViewById(R.id.buttonRojo);
        btnVerde = (Button) findViewById(R.id.buttonVerde);
        btnAzul = (Button) findViewById(R.id.buttonAzul);
        btnNegro = (Button) findViewById(R.id.buttonNegro);
        textoPrueba = (TextView) findViewById(R.id.textViewPrueba);
        btnMas = (Button) findViewById(R.id.buttonSizeMas);
        btnMenos = (Button) findViewById(R.id.buttonSizeMenos);

//BOTONES CON LOS QUE SE CAMBIA EL COLOR DEL TEXTVIEW
        btnRojo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textoPrueba.setTextColor(Color.RED);
                Toast.makeText(MainActivity.this, "boton rojo pulsado", Toast.LENGTH_SHORT).show();

            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textoPrueba.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "boton verde pulsado", Toast.LENGTH_SHORT).show();
            }
        });

        btnAzul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textoPrueba.setTextColor(Color.BLUE);
                Toast.makeText(MainActivity.this, "boton azul pulsado", Toast.LENGTH_SHORT).show();
            }
        });

        btnNegro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textoPrueba.setTextColor(Color.BLACK);
                Toast.makeText(MainActivity.this, "boton negro pulsado", Toast.LENGTH_SHORT).show();

            }
        });

        btnMas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                tamano = textoPrueba.getTextSize();
                tamano = tamano + 1;
                textoPrueba.setTextSize(TypedValue.COMPLEX_UNIT_PX, tamano);


                Toast.makeText(MainActivity.this, "tamaño del texto: "+tamano, Toast.LENGTH_SHORT).show();

            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//
                tamano = textoPrueba.getTextSize();
                tamano = tamano - 1;
                textoPrueba.setTextSize(TypedValue.COMPLEX_UNIT_PX, tamano);


                Toast.makeText(MainActivity.this, "tamaño del texto: "+tamano, Toast.LENGTH_SHORT).show();            }
        });
    }
}
