/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import Ejercicio1.Alumno;
import Ejercicio2.Consulta;
import Ejercicio3.Registro;
import Ejercicio4.Convertidor;
/**
 *
 * @author cass4
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("INGRESE UNA OPCION");
            System.out.println("1. EJERCICIO 1");
            System.out.println("2. EJERCICIO 2");
            System.out.println("3. EJERCICIO 3");
            System.out.println("4. EJERCICIO 4");
            System.out.println("5. EJERCICIO 5");
            System.out.println("0. SALIR");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    Alumno alumno1=new Alumno();
                    alumno1.ingresarNombre();
                    alumno1.ingresarNumNotas();
                    alumno1.ingresarNotas();
                    alumno1.calcularPromedio();
                    alumno1.toString();
                    break;
                case 2:
                    Consulta consulta1=new Consulta();
                    consulta1.numConsulta();
                    consulta1.consulta();
                    consulta1.toString();
                    break;  
                case 3:
                    Registro registro1=new Registro();
                    registro1.ingresarEdad();
                    registro1.hallarCategoria();
                    registro1.toString();
                    break;
                case 4:
                    Convertidor convertir=new Convertidor();
                    convertir.pedirSegundos();
                    convertir.semanas();
                    convertir.dias();
                    convertir.horas();
                    convertir.minutos();
                    convertir.toString();
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }while(opcion!=0);
        
    }
    
}
