package cl.ipvg.resolucioncertamen20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button bTCalcular;
    private EditText eTNombre;
    private EditText eTNotaUno;
    private EditText eTNotaDos;
    private EditText eTNotaTres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bTCalcular = (Button) findViewById(R.id.bTCalcular);
        eTNombre = (EditText) findViewById(R.id.eTNombre);
        eTNotaUno = (EditText) findViewById(R.id.eTNotaUno);
        eTNotaDos = (EditText) findViewById(R.id.eTNotaDos);
        eTNotaTres = (EditText) findViewById(R.id.eTNotaTres);

    }
    public void resultado (View View){
        String calculouno = eTNotaUno.getText().toString();
        String calculodos = eTNotaDos.getText().toString();
        String calculotres = eTNotaTres.getText().toString();
        String nombre = eTNombre.getText().toString();

        double promediouno = Double.parseDouble(calculouno);
        double promediodos = Double.parseDouble(calculodos);
        double promediotres = Double.parseDouble(calculotres);

        double promediogeneral = (promediouno + promediodos + promediotres) /3;

        Intent intentenviar = new Intent(this,MainActivity2.class);

        bTCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                intentenviar.putExtra("promediogeneral", promediogeneral);
                intentenviar.putExtra("nombre", nombre);

                startActivity(intentenviar);
            }
        });

    }
}


