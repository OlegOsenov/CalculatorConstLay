package my.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText operation, result;
    private Button btnC,btnDel,btn7,btn8,btn9,btnDivision,btn4,btn5,btn6,btnMulti,btn1,btn2,btn3,
            btnMinus,btnPoint,btn0,btnEqually,btnPlus;
   private String curr, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operation = (EditText)findViewById(R.id.operation);
        result = (EditText)findViewById(R.id.result);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnC = (Button) findViewById(R.id.btnC);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnEqually = (Button) findViewById(R.id.btnEqually);
        btnPlus = (Button) findViewById(R.id.btnPlus);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                operation.setText(String.format(Locale.getDefault(),"0"));
                break;
            case R.id.btn1:
                operation.setText(String.format(Locale.getDefault(),"1"));
                break;
            case R.id.btn2:
                operation.setText(String.format(Locale.getDefault(),"2"));
                break;
            case R.id.btn3:
                operation.setText(String.format(Locale.getDefault(),"3"));
                break;
            case R.id.btn4:
                operation.setText(String.format(Locale.getDefault(),"4"));
                break;
            case R.id.btn5:
                operation.setText(String.format(Locale.getDefault(),"5"));
                break;
            case R.id.btn6:
                operation.setText(String.format(Locale.getDefault(),"6"));
                break;
            case R.id.btn7:
                operation.setText(String.format(Locale.getDefault(),"7"));
                break;
            case R.id.btn8:
                operation.setText(String.format(Locale.getDefault(),"8"));
                break;
            case R.id.btn9:
                operation.setText(String.format(Locale.getDefault(),"10"));
                break;
        }

    }
}