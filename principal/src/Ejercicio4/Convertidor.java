/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Convertidor {
    private int segundos;
    private int semanas=0;
    private int dias=0;
    private int horas=0;
    private int minutos=0;
    /**
    * ingresar el numero de segundos 
    */
    public void pedirSegundos(){
        System.out.println("INGRESE EL NUMERO DE SEGUNDOS");
        Scanner leer= new Scanner (System.in) ;       
        segundos=leer.nextInt(); 
        while(segundos<0){
            System.out.println("NUMERO DE SEGUNDOS INVALIDO");
            segundos=leer.nextInt(); 
        }
    }
    /**
     * hallar la cantidad de semanas
     */
    public void calcularSemanas(){
        if(segundos>=604800){
            semanas=segundos/604800;
            segundos-=(semanas*604800);
        }
        System.out.println("semanas: "+semanas);
    }
    public void calcularDias(){
        if(segundos>=86400){
            dias=segundos/86400;
            segundos-=(dias*86400);
        }
        System.out.println("dias: "+dias);
    }
    public void calcularHoras(){
        if(segundos>=3600){
            horas=segundos/3600;
            segundos-=(horas*3600);
        }
        System.out.println("horas: "+horas);
    }
    public void calcularMinutos(){
        if(segundos>=60){
            minutos=segundos/60;
            segundos-=(minutos*60);
        }
        System.out.println("minutos: "+minutos);
  
}
 @Override
  public String toString(){
      return "segundo:"+segundos+"semana: "+semanas+" dias: "+dias+" horas: "+horas+" minutos"+minutos;
      
  }

}
