package ca.qc.sol_td03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Numero2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_11, btn_12, btn_13;
    Button btn_21, btn_22, btn_23;
    Button btn_31, btn_32, btn_33;

    Button[] btns = null;
    int numberComputerEvents = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
        //init
        btn_11 = findViewById(R.id.numero2_btn_11);
        btn_12 = findViewById(R.id.numero2_btn_12);
        btn_13 = findViewById(R.id.numero2_btn_13);

        btn_21 = findViewById(R.id.numero2_btn_21);
        btn_22 = findViewById(R.id.numero2_btn_22);
        btn_23 = findViewById(R.id.numero2_btn_23);

        btn_31 = findViewById(R.id.numero2_btn_31);
        btn_32 = findViewById(R.id.numero2_btn_32);
        btn_33 = findViewById(R.id.numero2_btn_33);

        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);

        btn_21.setOnClickListener(this);
        btn_22.setOnClickListener(this);
        btn_23.setOnClickListener(this);

        btn_31.setOnClickListener(this);
        btn_32.setOnClickListener(this);
        btn_33.setOnClickListener(this);

        btns = new Button[9];
        btns[0] = btn_11;
        btns[1] = btn_12;
        btns[2] = btn_13;
        btns[3] = btn_21;
        btns[4] = btn_22;
        btns[5] = btn_23;
        btns[6] = btn_31;
        btns[7] = btn_32;
        btns[8] = btn_33;
    }

    public void effacerTout(View view) {
        for (Button btn : btns) {
            btn.setText("");
        }
        numberComputerEvents = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.numero2_btn_11:
                if (btn_11.getText().toString().equals(""))
                    btn_11.setText("X");
                break;
            case R.id.numero2_btn_12:
                if (btn_12.getText().toString().equals(""))
                    btn_12.setText("X");
                break;
            case R.id.numero2_btn_13:
                if (btn_13.getText().toString().equals(""))
                    btn_13.setText("X");
                break;

            case R.id.numero2_btn_21:
                if (btn_21.getText().toString().equals(""))
                    btn_21.setText("X");
                break;
            case R.id.numero2_btn_22:
                if (btn_22.getText().toString().equals(""))
                    btn_22.setText("X");
                break;
            case R.id.numero2_btn_23:
                if (btn_23.getText().toString().equals(""))
                    btn_23.setText("X");
                break;

            case R.id.numero2_btn_31:
                if (btn_31.getText().toString().equals(""))
                    btn_31.setText("X");
                break;
            case R.id.numero2_btn_32:
                if (btn_32.getText().toString().equals(""))
                    btn_32.setText("X");
                break;
            case R.id.numero2_btn_33:
                if (btn_33.getText().toString().equals(""))
                    btn_33.setText("X");
                break;
            default:
                break;
        }
        computerEvent();
    }

    private void computerEvent() {
        numberComputerEvents++;
        if (numberComputerEvents <= btns.length / 2) {
            Random rand = new Random();
            int randPosition = rand.nextInt(btns.length);
            while (!btns[randPosition].getText().toString().equals("")) {
                randPosition = rand.nextInt(btns.length);
            }
            btns[randPosition].setText("O");
        }
    }
}













