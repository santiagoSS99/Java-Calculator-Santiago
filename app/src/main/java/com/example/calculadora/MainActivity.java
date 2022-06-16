package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    private float numero1 =0.0f, numero2 =0.0f;
    private String operacion;
    private float numeroalmacenado;
    private Button bt1x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        bt1x = (Button)findViewById(R.id.bt1x);

    }

    // FUNCIÓN IGUAL
    public void showResultado(View view) {



        numero2 = Float.parseFloat(tvResultado.getText().toString());

        switch (operacion){
            case ("-"):
                float resultador = (numeroalmacenado - numero2);
                tvResultado.setText(resultador +"");
                break;
            case ("+"):
                float resultado = numeroalmacenado + numero2;
                tvResultado.setText(resultado+"" );
                break;
            case ("*"):
                float resultadom = numeroalmacenado *numero2;
                tvResultado.setText(resultadom+"");
                break;
            case ("/"):
                if (numero2 == 0){
                    tvResultado.setText("SyntaxError");
                    Toast.makeText(this, "No se permite dividir en 0", Toast.LENGTH_SHORT).show();
                }else{
                    float resultadod = numeroalmacenado / numero2;
                    tvResultado.setText(resultadod +"");
                }
        }
    }
    // - FUNCIÓN SETEAR NUMEROS
    public void escribirCero(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText()+"0");
        }
    }
    public void escribirUno(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText()+"1");
        }
    }
    public void escribirDos(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText()+"2");
        }
    }
    public void escribirTres(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText()+"3");
        }
    }
    public void escribirCuatro(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText()+"4");
        }
    }
    public void escribirCinco(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText()+"5");
        }
    }
    public void escribirSeis(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText()+"6");
        }
    }
    public void escribirSiete(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }
    public void escribirOcho(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }
    public void escribirNueve(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1 == 0.0f) {
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }
    public void coma(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if(numero1== 0){
            tvResultado.setText(".");
        }else {
            tvResultado.setText(tvResultado.getText() + ".");
        }
    }
    // - OPERACIONES
    public void multiplicar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "*";
        tvResultado.setText("0");
        numeroalmacenado = numero1;
    }
    public void porcentaje(View view) {
        this.numero1 = Float.parseFloat(tvResultado.getText().toString());
        this.numero2 = Float.parseFloat(tvResultado.getText().toString());

        if (this.numero1 != 0 && this.numero2 != 0 && this.operacion != null) {
            float num2 = ((this.numero2)/100)*(this.numeroalmacenado);
            this.numero2 = num2;
            tvResultado.setText(num2+"");
        } else {
            tvResultado.setText("0");
            numero1 = 0.0f;
            numero2 = 0.0f;
            operacion = "";
        }
    }
    public void dividir(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion ="/";
        tvResultado.setText("0");
        numeroalmacenado = numero1;
    }
    public void sumar(View v) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+";
        tvResultado.setText("0");
        numeroalmacenado = numero1;
    }
    public void restar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion ="-";
        tvResultado.setText("0");
        numeroalmacenado = numero1;
    }
    public void raizCuadrada(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());

        float resutlado = (float) Math.sqrt(numero1);
        tvResultado.setText(resutlado+"");

    }
    // - FUNCIONES
    public void borrarDigito(View view) {
        if(tvResultado.getText().toString().equals("0")==false){
            String tvResul = tvResultado.getText().toString();
            tvResul = tvResul.substring(0,tvResul.length()-1);
            tvResultado.setText(tvResul);
            if(tvResultado.length()== 0){
                tvResultado.setText("0");
            }
        }
    }
    public void limpiarnum_2(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
        bt1x.setEnabled(true);
    }
    public void unoSobrex(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());

        if(numero1 != 0){
            float resultadofrac = 1/numero1;
            tvResultado.setText(resultadofrac+"");
        }else{
            tvResultado.setText("SyntaxError");
            bt1x.setEnabled(false);
        }
    }
    public void antep_Menos(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        numero2 = Float.parseFloat(tvResultado.getText().toString());
    }
    public void limpiar(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        bt1x.setEnabled(true);
    }
}


















