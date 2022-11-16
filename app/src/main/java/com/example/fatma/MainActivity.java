package com.example.fatma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.Num1);
        EditText num2 = findViewById(R.id.Num2);
        Button sum = findViewById(R.id.SUM);
        Button sub = findViewById(R.id.SUB);
        Button Mult = findViewById(R.id.MULT);
        Button div = findViewById(R.id.DIV);
        TextView result = findViewById(R.id.Result);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(num1.getText().toString().trim());
                int Num2 = Integer.parseInt(num2.getText().toString().trim());
                int res = Num1+Num2;
                result.setText("result is "+ result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(num1.getText().toString().trim());
                int Num2 = Integer.parseInt(num2.getText().toString().trim());
                int res = Num1-Num2;
                result.setText("result is "+ result);
            }
        });
        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(num1.getText().toString().trim());
                int Num2 = Integer.parseInt(num2.getText().toString().trim());
                int res = Num1*Num2;
                result.setText("result is "+ result);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(num1.getText().toString().trim());
                int Num2 = Integer.parseInt(num2.getText().toString().trim());
                int res = Num1/Num2;
                result.setText("result is "+ result);
            }
        });



    }
}