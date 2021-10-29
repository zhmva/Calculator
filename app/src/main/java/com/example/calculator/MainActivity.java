package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstVariable, secondVariable;
    private String operation;
    private boolean isFirstVarClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                if (isFirstVarClick){
                    tvResult.setText("1");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_2:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                if (isFirstVarClick){
                    tvResult.setText("2");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_0:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("0");
                }else{
                    tvResult.append("0");
                }
                if (isFirstVarClick) {
                    tvResult.setText("0");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_3:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("3");
                }else{
                    tvResult.append("3");
                }
                if (isFirstVarClick){
                    tvResult.setText("3");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_4:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("4");
                }else{
                    tvResult.append("4");
                }
                if (isFirstVarClick){
                    tvResult.setText("4");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_5:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("5");
                }else{
                    tvResult.append("5");
                }
                if (isFirstVarClick){
                    tvResult.setText("5");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_6:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("6");
                }else{
                    tvResult.append("6");
                }
                if (isFirstVarClick){
                    tvResult.setText("6");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_7:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("7");
                }else{
                    tvResult.append("7");
                }
                if (isFirstVarClick){
                    tvResult.setText("7");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_8:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("8");
                }else{
                    tvResult.append("8");
                }
                if (isFirstVarClick){
                    tvResult.setText("8");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_9:
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("9");
                }else{
                    tvResult.append("9");
                }
                if (isFirstVarClick){
                    tvResult.setText("9");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_ac:
                tvResult.setText("0");
                firstVariable = null;
                secondVariable = null;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstVariable + operation);
                break;
            case R.id.btn_minus:
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstVariable + operation);
                break;
            case R.id.btn_D:
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "÷";
                tvResult.setText(firstVariable + operation);
                break;
            case R.id.btn_x:
                firstVariable = Integer.parseInt(tvResult.getText().toString());
                operation = "×";
                tvResult.setText(firstVariable + operation);
                break;

            case R.id.btn_equals:

                if (operation.equals("+")) {
                    String text = tvResult.getText().toString();
                    text = text.replace(firstVariable + operation, "");
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable + secondVariable;
                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                    firstVariable = null;
                    secondVariable = null;
                    break;
                }else if (operation.equals("-")){
                    String text = tvResult.getText().toString();
                    text = text.replace(firstVariable + operation, "");
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable - secondVariable;
                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                    firstVariable = null;
                    secondVariable = null;
                    break;
                }else if (operation.equals("*")){
                    String text = tvResult.getText().toString();
                    text = text.replace(firstVariable + operation, "");
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable * secondVariable;
                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                    firstVariable = null;
                    secondVariable = null;
                    break;
                }else if (operation.equals("/")) {
                    String text = tvResult.getText().toString();
                    text = text.replace(firstVariable + operation, "");
                    secondVariable = Integer.parseInt(text);
                    Integer result = firstVariable / secondVariable;
                    tvResult.setText(firstVariable + operation + secondVariable + "=" + result);
                    firstVariable = null;
                    secondVariable = null;
                    break;
                }
        }
    }
}