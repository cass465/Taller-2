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
 private double semana;
 private double dias;
 private double horas;
 private double minutos;
 
 
 /**
  * 
  */
   
 public void pedirSegundos(){
      System.out.println("Digite la cantidad de veces que quiere consultar la estacion del año");
      Scanner leer= new Scanner (System.in) ;       
     segundos=leer.nextInt();
     
 }
 /**
  * halla la cantidad de semanas
  */
 public void semanas(){
    semana=segundos/604800;
    System.out.println("semanas: "+(int)semana);
 }
public void dias(){
   dias=((semana-(int)semana)*604800)/86400;
   System.out.println("dias: "+(int)dias);
}

public void horas(){
  horas=((dias-(int)dias)*86400)/3600;
  System.out.println("horas: "+(int)horas);
  
}
public void minutos(){
  minutos=((horas-(int)dias)*3600)/60;
  System.out.println("minutos: "+(int)minutos);
  
}
 @Override
  public String toString(){
      return "segundo:"+segundos+"semana: "+semana+" dias: "+dias+" horas: "+horas+" minutos"+minutos;
      
  }

}
