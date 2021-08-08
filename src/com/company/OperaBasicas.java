package com.company;

import java.util.Scanner;

public class OperaBasicas {

    private double n1;
    private double n2;

    Scanner entradanum = new Scanner(System.in); //incializacion de entrada de teclado

    //Constructores
    public OperaBasicas(){

    }

    public OperaBasicas(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    //Operacion suma
    public double sumar(){
        System.out.println("Ingrese el SUMANDO 1: ");
        n1 = entradanum.nextDouble();
        System.out.println("Ingrese el SUMANDO 2: ");
        n2 = entradanum.nextDouble();
        double tsuma = this.n1 + this.n2;
        System.out.println("El resultado es : " + tsuma + "\n");
        return tsuma;
    }

    //Operacion resta
    public double restar(){
        System.out.println("Ingrese el MINUENDO: ");
        n1 = entradanum.nextDouble();
        System.out.println("Ingrese el SUSTRAENDO: ");
        n2 = entradanum.nextDouble();
        double tresta = this.n1 - this.n2;
        System.out.println("El resultado es : " + tresta + "\n");
        return tresta;
    }

    //Operacion multiplicacion
    public double multip(){
        System.out.println("Ingrese el FACTOR 1: ");
        n1 = entradanum.nextDouble();
        System.out.println("Ingrese el FACTOR 2: ");
        n2 = entradanum.nextDouble();
        double tmultip = this.n1 * this.n2;
        System.out.println("El resultado es : " + tmultip + "\n");
        return tmultip;
    }

    //Operacion division
    public double divi(){
        System.out.println("Ingrese el DIVIDENDO: ");
        n1 = entradanum.nextDouble();
        System.out.println("Ingrese el DIVISOR: ");
        n2 = entradanum.nextDouble();
        double tdivi = this.n1 / this. n2;
        System.out.println("El resultado es : " + tdivi + "\n");
        return tdivi;
    }

}

