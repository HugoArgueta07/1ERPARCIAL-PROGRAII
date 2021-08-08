package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void Menu() {

        int op; //se declara variable opcion
        boolean llave = false; //variable para ciclo while

        Scanner entradanum = new Scanner(System.in); //incializacion de entrada de teclado

        //ciclo while para constante imprension del menú
        while(!llave) {

            //Menu de opciones de la calculadora
            System.out.println("\t\tBienvenido a ProCALCULATOR3000");
            System.out.println("\t\t\t\t---Menu---");
            System.out.println("Operaciones Basicas\t\t\t\tOperaciones Avanzadas");
            System.out.println("1. Suma\t\t\t\t\t\t\t5. Potencia");
            System.out.println("2. Resta\t\t\t\t\t\t6. Raiz Cuadrada");
            System.out.println("3. Multiplicacion\t\t\t\t7. Seno (sin)");
            System.out.println("4. Division\t\t\t\t\t\t8. Coseno (cos)");
            System.out.println("\t\t\t\t\t\t\t\t9. Tangente (tan)");
            System.out.println("10. Salir");

            try{

            System.out.println("\nIngrese el numero de opcion que desee realizar:");
            op = entradanum.nextInt();


            //Switch para el control de seleccion de opciones
            switch (op) {
                case 1: {
                    OperaBasicas llamadosumar = new OperaBasicas();
                    llamadosumar.sumar();
                    break;
                }
                case 2: {
                    OperaBasicas llamadorestar = new OperaBasicas();
                    llamadorestar.restar();
                    break;
                }
                case 3: {
                    OperaBasicas llamadomultip = new OperaBasicas();
                    llamadomultip.multip();
                    break;
                }
                case 4: {
                    OperaBasicas llamadodivi = new OperaBasicas();
                    llamadodivi.divi();
                    break;
                }
                case 5: {
                    OperaAvanzadas llamadopote = new OperaAvanzadas();
                    llamadopote.potencia();
                    break;
                }
                case 6: {
                    OperaAvanzadas llamadoraiz = new OperaAvanzadas();
                    llamadoraiz.raizCuad();
                    break;
                }
                case 7: {
                    OperaAvanzadas llamadosin = new OperaAvanzadas();
                    llamadosin.sin();
                    break;
                }
                case 8: {
                    OperaAvanzadas llamadocos = new OperaAvanzadas();
                    llamadocos.cos();
                    break;
                }
                case 9: {
                    OperaAvanzadas llamadotan = new OperaAvanzadas();
                    llamadotan.tan();
                    break;
                }
                case 10: {
                    llave = true;
                    break;
                }
                default: {
                    System.out.println("¡Opcion incorrecta! Elija unicamente una de las que estan en pantalla\n");
                }
            }
        }catch (InputMismatchException e){
                System.out.println("Introduce unicamente numeros\n");
                entradanum.next();
            }
        }
    }
}