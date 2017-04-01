package com.example.andresmontoya.sabados1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView vista1;
    Button boton1;
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vista1 = (TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.buttonOne);
        boton2 = (Button) findViewById(R.id.buttonTwo);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        pepito();
    }

    public void pepito() {

        vista1.setText("este texto se ha modificado en este metodo");

    }

    @Override
    public void onClick(View v) {
        vista1.setText("cambiamos el texto con el boton");
    }
}
