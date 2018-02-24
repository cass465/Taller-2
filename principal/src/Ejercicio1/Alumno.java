/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 * version 1.0
 * @author cass4
 * 24/02/2018
 * esta clase calcula el promedio de notas de un alumno
 */
public class Alumno {
    private String nombre;
    private int numNotas;
    private float nota=0;
    private float sumaNotas;
    private float promedio;
    /**
     * ingresar el nombre del alumno
     */
    public void ingresarNombre(){
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO: ");
        nombre = leer.nextLine();
    }
    /**
     * ingresar el numero de notas
     */
    public void ingresarNumNotas(){
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE NOTAS DE "+nombre);
        numNotas = leer.nextInt();
        while(numNotas<0){
            System.out.println("NUMERO DE NOTAS INVALIDO");
            numNotas = leer.nextInt();
        }
    }
    /**
     * ingresar el valor de las notas
     */
    public void ingresarNotas(){
        Scanner leer=new Scanner(System.in);
        int i=0;
        for(i=0;i<numNotas;i++){
            System.out.println("INGRESE LA NOTA "+(i+1));
            nota = leer.nextFloat();
            while(nota<0 || nota>5){
                System.out.println("NOTA INVALIDA");
                nota = leer.nextFloat();
            }
            sumaNotas+=nota;
        }
    }
    /**
     * calcular el promedio del alumno
     */
    public void calcularPromedio(){
        promedio=sumaNotas/numNotas;
        System.out.println("EL PROMEDIO DE "+nombre+" ES: "+promedio);
    }
    @Override
    public String toString(){
        return "NOMBRE: "+nombre+" PROMEDIO: "+promedio;
    }
}
