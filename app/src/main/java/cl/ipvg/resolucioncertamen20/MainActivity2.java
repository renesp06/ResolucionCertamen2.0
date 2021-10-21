package cl.ipvg.resolucioncertamen20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tVFinal;
    private TextView tVNombre;
    private TextView tVNota;
    private Button bTVolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bTVolver = (Button) findViewById(R.id.bTVolver);
        tVNombre = (TextView) findViewById(R.id.tVNombre);
        tVNota= (TextView) findViewById(R.id.tVNota);
        tVFinal = (TextView) findViewById(R.id.tVFinal);

        Intent intentnombrefinal = getIntent();
        double intentpromediofinal = intentnombrefinal.getDoubleExtra("promediogeneral",0);

        String textofinal = " la nota final es: " + intentpromediofinal;
        tVNota.setText(textofinal);

        Bundle nota = getIntent().getExtras();
        String finaluno = nota.getString("nombre");
        tVNombre.setText(finaluno);
        tVFinal.setText(finaluno + textofinal );

        Intent intentnombrefnaldos = new Intent(this,MainActivity.class);
        bTVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentnombrefnaldos);
            }
        });
        }
    }
