package com.example.rene.proyecto;

/* En esta seccion del main, que es la mas importante establezco las librerias necesarias
* y luego establezco los textView, editText y button que usare en la interfaz grafica.
* Luego establezco los editText que nos permiten la introduccion de los datos y el resultado.
* Las variables deben ser inicializadas en cero.
* Genero entonces el codigo con la opcion Try y Catch las cuales tienen parametros
* establecidos en caso de que uno de los Text este vacio, me mande un mensaje informandome
* que el cuadro de texto de cierta calificacion esta vacio.
* Esta validacion se hace con el boton que cree, llamado Calcular Promedio.
* Luego al establecer las tres notas, despliego el mensaje de que las notas han sido introducidas
* y se puede ver el resultado del promedio obtenido.*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvResul;
    EditText etCal1, etCal2, etCal3;
    Button btnCal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResul = (TextView) findViewById(R.id.tvResul);
        etCal1 = (EditText) findViewById(R.id.etCal1);
        etCal2 = (EditText) findViewById(R.id.etCal2);
        etCal3 = (EditText) findViewById(R.id.etCal3);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a =0 , b = 0 , c =0;
                try {
                    a= Float.parseFloat(etCal1.getText().toString());
                                                        }

                catch (Exception e){

                    Toast.makeText(getApplicationContext(), "¡INTRODUZCA CALIFICACION 1!", Toast.LENGTH_SHORT).show();

                }

                try{
                    b= Float.parseFloat(etCal2.getText().toString());
                }
                catch(Exception e){
                    Toast.makeText(getApplicationContext(), "¡INTRODUZCA CALIFICACION 2!", Toast.LENGTH_SHORT).show();

                }

                try{
                    c= Float.parseFloat(etCal3.getText().toString());
                }
                catch(Exception e){

                    Toast.makeText(getApplicationContext(), "¡INTRODUZCA CALIFICACION 3!", Toast.LENGTH_SHORT).show();


                }


                Calificaciones promedio = new Calificaciones(a, b, c);
                tvResul.setText("Tu Promedio es: " + promedio.calcularPromedio());
                Toast.makeText(getApplicationContext(), "FELICIDADES CALIFICACIONES INTRODUCIDAS CORRECTAMENTE", Toast.LENGTH_SHORT).show();

            }
        });



    }

}
