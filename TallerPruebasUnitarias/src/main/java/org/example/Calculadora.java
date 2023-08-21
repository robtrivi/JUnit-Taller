package org.example;

public class Calculadora {
    private double a;
    private double b;

    public Calculadora (double a, double b) {
        this.a = a;
        this.b  = b;
    }

    public Calculadora () {}

    public double suma (double a, double b) {
        return a + b;
    }

    public double suma () {
        return this.a + this.b;
    }

    public double resta (double a, double b) {
        return a - b;
    }
    public double resta () {
        return this.a - this.b;
    }

    public double multiplicacion (double a, double b) {
        return a * b;
    }

    public double multiplicacion () {
        return this.a * this.b;
    }

    public double division (double dividendo, double divisor) {
        verificarDivisionPorCero (divisor);
        return dividendo / divisor;
    }

    public double division () {
        verificarDivisionPorCero (this.b);
        return this.a / this.b;
    }

    private void verificarDivisionPorCero (double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
    }

    public double exponenciacion (double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double exponenciacion () {
        return Math.pow(this.a, this.b);
    }

    public double radicacion (double numero, double indice) {
        verificarRadicacionNumeroNegativoIndicePar (numero, indice);
        return Math.pow(numero, 1.0 / indice);
    }

    public double radicacion () {
        verificarRadicacionNumeroNegativoIndicePar (this.a, this.b);
        return Math.pow(this.a, 1.0 / this.b);
    }

    private void verificarRadicacionNumeroNegativoIndicePar (double numero, double indice) {
        boolean numeroNegativo = numero < 0 ;
        boolean indicePar = (indice%2) == 0;
        if ( numeroNegativo && indicePar ) {
            throw new IllegalArgumentException("Entrada inválida.");
        }
    }
}
