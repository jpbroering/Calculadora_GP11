package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// 11
public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        result = findViewById(R.id.result);
    }
    public void soma(View v){
        int nu1 = Integer.parseInt(n1.getText().toString());
        int nu2 = Integer.parseInt(n2.getText().toString());
        int tl = nu1+nu2;
        result.setText(tl);
    }
}