/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Consulta {
    private int numConsulta;
    private int consulta;
    /**
     * pide la cantidad de veces que quiere consultar la estacion
     */
    public void numConsulta(){
        System.out.println("Digite la cantidad de veces que quiere consultar la estacion del año");
        Scanner leer= new Scanner (System.in) ;       
        numConsulta=leer.nextInt();
    }
    /**
     * ingresar el numero del mes y determinar a que estacion pertenece
     */
    public void determinarEstacion(){
        int i;
        for (i=1;i<=numConsulta;i++){
            System.out.println("Digite el mes del año");
            Scanner leer= new Scanner (System.in) ;       
            consulta=leer.nextInt();
            while (consulta<1 || consulta>12){
                System.out.println("mes invalido");
                consulta=leer.nextInt();
            }
            if (consulta>=1 && consulta<=3){
                System.out.println("Estacion: Invierno");
            }
            if(consulta>=4 && consulta<=6){
                System.out.println("Estacion: Verano");
            }
            if (consulta>=7 && consulta<=9){
                System.out.println("Estacion: Otoño");
            }
            if(consulta>=10 && consulta<=12){
                System.out.println("Estacion: Primavera");
            }
        }
    }   
    @Override
    public String toString(){
        return "Consulta:"+consulta;
    }
}
