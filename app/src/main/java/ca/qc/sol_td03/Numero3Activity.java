package ca.qc.sol_td03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Numero3Activity extends AppCompatActivity {

    RadioButton rbMunicipal, rbAutoroute;
    EditText txtVitesse;
    Spinner spinnerLimite;
    TextView lblAmende;
    Float[] limites;
    float limiteVitesse;
    boolean isAutoroute, isMunicipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero3);
        //init
        rbMunicipal = findViewById(R.id.numero3_rb_municipal);
        rbAutoroute = findViewById(R.id.numero3_rb_autoroute);
        txtVitesse = findViewById(R.id.numeroe3_txt_vitesse);
        spinnerLimite = findViewById(R.id.numero3_spinner_limite);
        lblAmende = findViewById(R.id.numero3_lbl_amende);

        limites = new Float[]{
          30.0f, 50.0f, 70.0f, 100.f
        };
        limiteVitesse = 30.0f;
        isAutoroute = false;
        isMunicipal = false;
        //event select sur le spinner
        spinnerLimite.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                limiteVitesse = limites[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        rbAutoroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isAutoroute = true;
                isMunicipal = false;
            }
        });

        rbMunicipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isMunicipal = true;
                isAutoroute = false;
            }
        });
    }

    public void clickCalculer(View view) {
        float amende  = 25.00f;
        float vitesse = Float.parseFloat(txtVitesse.getText().toString());
        //calcul des Kms exécedants
        float km = vitesse  - limiteVitesse;
        if(isMunicipal && !isAutoroute){
            if(km < 25)
                amende += (km * 15.0);
            else
                amende += (km * 20.0f);
        }else if (isAutoroute && !isMunicipal)
            amende += (km * 20.0f);

        lblAmende.setText(amende +  " $");

    }
}