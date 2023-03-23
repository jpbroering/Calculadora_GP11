package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// 11
public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    TextView result;
    int nu1, nu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        result = findViewById(R.id.result);
    }
    public void soma(View v){
        num();
        int tl = nu1+nu2;
        result.setText(tl+"");
    }
    public void subtrair(View v){
        num();
        int tl = nu1-nu2;
        result.setText(tl+"");
    }
    public void dividir(View v){
        num();
        if(nu1 == 0 || nu2 == 0){
            result.setText("não da para dividir por 0");
        }
        else {
            int tl = nu1 / nu2;
            result.setText(tl + "");
        }
    }
    public void multiplicar(View v){
        num();
        int tl = nu1*nu2;
        result.setText(tl+"");
    }
    public void num(){
        String snu1 = n1.getText().toString();
        String snu2 = n2.getText().toString();
        if (snu1.equals("")){
            snu1 = "1";
        }
        if (snu2.equals("")){
            snu2 = "1";
        }
        nu1 = Integer.parseInt(snu1);
        nu2 = Integer.parseInt(snu2);
    }
}