package com.example.actividadcuadernillorubio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
/*
prueba para commitear
 */
public class MainActivity extends AppCompatActivity {
    Spinner spn;
    Operaciones o;
    int puntuaciones;
    TextView et_txt1;
    TextView et_txt2;
    TextView et_txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=findViewById(R.id.btn_jugar);
        et_txt1 =findViewById(R.id.txt_1);
        et_txt2 =findViewById(R.id.txt_2);
        et_txt3 =findViewById(R.id.txt_3);




        spn=findViewById(R.id.spn_niveles);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn.getSelectedItemId();

                o = new Operaciones((int) spn.getSelectedItemId());
                mostrarOperacion();
            }

            private void mostrarOperacion() {
                et_txt1.setText(String.valueOf(o.getOperando1()));
                et_txt2.setText(String.valueOf(o.getSimbolito()));
                et_txt3.setText(String.valueOf(o.getOperando2()));

            }
        });

    }
}