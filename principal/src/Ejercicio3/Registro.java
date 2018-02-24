/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author cass4
 */
public class Registro {
    private int edad;
    private String categoria;
    /**
     * ingresar la edad
     */
    public void ingresarEdad(){
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE LA EDAD");
        edad = leer.nextInt();
        while(edad<0){
            System.out.println("EDAD INVALIDA");
            edad = leer.nextInt();
        }
    }
    /**
     * hallar la categoria a la que pertenece esa edad
     */
    public void hallarCategoria(){
        if(edad>=0 && edad<=6){
            categoria="PRE INFANTIL";
        }
        if(edad>=7 && edad<=17){
            categoria="INFANTIL";
        }
        if(edad>=18 && edad<=25){
            categoria="JUVANIL";
        }
        if(edad>=26 && edad<=45){
            categoria="MAYORES";
        }
        if(edad>45){
            categoria="VATERANOS";
        }
        System.out.println("LA CATEGORIA PARA LA EDAD "+edad+" ES: "+categoria);
    }
    @Override
    public String toString(){
        return "EDAD: "+edad+" CATEGORIA: "+categoria;
    }
}
