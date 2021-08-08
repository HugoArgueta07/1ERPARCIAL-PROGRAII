package com.company;


import java.util.Scanner;

public class OperaAvanzadas {

    private double n1;
    private double n2;

    Scanner entradanum = new Scanner(System.in); //incializacion de entrada de teclado}

    //Constructores

    public OperaAvanzadas(){

    }

    public OperaAvanzadas(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    //Operacion potencia
    public double potencia(){
        System.out.println("Ingrese la BASE: ");
        n1 = entradanum.nextDouble();
        System.out.println("Ingrese el EXPONENTE: ");
        n2 = entradanum.nextDouble();
        double tpote = Math.pow(n1, n2);
        System.out.println("El resultado es: " + tpote + "\n");
        return tpote;
    }

    //Operacion raiz
    public double raizCuad(){
        System.out.println("Ingrese el RADICANDO: ");
        n1 = entradanum.nextDouble();
        double traiz = Math.sqrt(n1);
        System.out.println("El resultado es: " + traiz + "\n");
        return traiz;
    }

    //Operacion seno
    public double sin(){
        System.out.println("Ingrese el numero de GRADOS DEL ANGULO: ");
        n1 = entradanum.nextDouble();
        double tsin = Math.sin(n1);
        tsin = Math.toRadians(n1);
        System.out.println("El resultado es: " + Math.sin(tsin) + "\n");
        return tsin;
    }

    //Operacion coseno
    public double cos(){
        System.out.println("Ingrese el numero de GRADOS DEL ANGULO: ");
        n1 = entradanum.nextDouble();
        double tcos = Math.cos(n1);
        tcos = Math.toRadians(n1);
        System.out.println("El resultado es: " + Math.cos(tcos) + "\n");
        return tcos;
    }

    //Operacion tangente
    public double tan(){
        System.out.println("Ingrese el numero de GRADOS DEL ANGULO: ");
        n1 = entradanum.nextDouble();
        double ttan = Math.tan(n1);
        ttan = Math.toRadians(n1);
        System.out.println("El resultado es: " + Math.tan(ttan) + "\n");
        return ttan;
    }

}
