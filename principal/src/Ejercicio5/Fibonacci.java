/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author cass4
 */
public class Fibonacci {
    private int numero1=0;
    private int numero2=1;
    private int auxiliar;
    private int numeroUsuario;
    /**
     * ingresar hasta que numero se realiza la serie fibonacci
     */
    public void ingresarNumero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        numeroUsuario = leer.nextInt();
        while(numeroUsuario<=1){
            System.out.println("NUMERO INVALIDO");
            numeroUsuario = leer.nextInt();
        }
    }
    /**
     * imprimir la serie de Fibonacci
     */
    public void imprimirSerie(){
        System.out.println(numero1);
        System.out.println(numero2);
        while(numero1+numero2<=numeroUsuario){
            auxiliar=numero1;
            numero1=numero2;
            numero2=auxiliar+numero1;
            System.out.println(numero2);
        }
    }
    @Override
    public String toString(){
        return "NUMERO DE USUARIO: "+numeroUsuario;
    }
}
