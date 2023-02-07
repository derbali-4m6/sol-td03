package ca.qc.sol_td03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lancerNumero1(View view) {
        Intent ex1 = new Intent(this, Numero1Activity.class);
        startActivity(ex1);
    }

    public void lancerNumero2(View view) {
        Intent ex2 = new Intent(this, Numero2Activity.class);
        startActivity(ex2);
    }

    public void lancerNumero3(View view) {
        Intent ex3 = new Intent(this, Numero3Activity.class);
        startActivity(ex3);
    }
}