package com.example.actividadcuadernillorubio;

import android.widget.EditText;

public class Operaciones {

    private int operando1;
    private int operando2 ;
    private int resultado;
    private String simbolito;

    public Operaciones(int selectedItemId) {

        switch (selectedItemId){
            case 0:
                simbolito="+";
                operando1 = ((int) Math.random())*10;
                operando2 = pedirAleatorio(1);
                resultado = operando1+operando2;
                break;
            case 1:
                simbolito="+";
                operando2 = pedirAleatorio(2);
                operando2 = ((int) Math.random())*100;
                resultado = operando1-operando2;
                break;
            case 2:
                simbolito="*";
                operando1 = ((int) Math.random())*10;
                operando2 = ((int) Math.random())*10;
                resultado = operando1*operando2;
                break;


        }

    }

    private int pedirAleatorio(int i) {
        int factor = (int) Math.pow(10, i);
        return (int) (Math.random()*factor);
    }

    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public int getResultado() {
        return resultado;
    }

    public String getSimbolito() {
        return simbolito;
    }


}
