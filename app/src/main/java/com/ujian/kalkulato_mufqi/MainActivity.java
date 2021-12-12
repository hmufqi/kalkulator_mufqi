package com.ujian.kalkulato_mufqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNumber = "";
    String op = "+";
    boolean isNewOp = true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if (isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.btn1:;
                number += "1";
                break;
            case R.id.btn2:;
                number += "2";
                break;
            case R.id.btn3:;
                number += "3";
                break;
            case R.id.btn4:;
                number += "4";
                break;
            case R.id.btn5:;
                number += "5";
                break;
            case R.id.btn6:;
                number += "6";
                break;
            case R.id.btn7:;
                number += "7";
                break;
            case R.id.btn8:;
                number += "8";
                break;
            case R.id.btn9:;
                number += "9";
                break;
            case R.id.btn0:;
                number += "0";
                break;
            case R.id.btnComa:;
                number += ",";
                break;
            case R.id.btnPlusMinus:;
                number = "-"+number;
                break;
        }
        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.btnDevide: op = "/"; break;
            case R.id.btnMultiply: op = "*"; break;
            case R.id.btnPlus: op = "+"; break;
            case R.id.btnMinus: op = "-"; break;
        }
    }

    public void equalsEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op) {
            case "+":
                result = Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }

    public void resetEvent(View view) {
        ed1.setText("0");
        isNewOp = true;
    }

    public void percentEvent(View view) {
        double no = Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(no+"");
        isNewOp = true;
    }
}