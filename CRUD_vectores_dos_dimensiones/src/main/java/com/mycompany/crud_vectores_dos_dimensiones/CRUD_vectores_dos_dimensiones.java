
package com.mycompany.crud_vectores_dos_dimensiones;
import java.util.Scanner;

public class CRUD_vectores_dos_dimensiones {

    public static void main(String[] args) {
        
        Scanner entradaScanner = new Scanner (System.in);
        
        int opcion;
        int contador = 0;
        String nombre;
        String material;
        String precio;
        int posicion_modificar;
        int posicion_eliminar;
        String [][] joyas = new String [10][3];
        
        do{
            System.out.println("Bienvenido a la tienda de joyas de Alejandro");
            System.out.println("-----------------------------------------");
            System.out.println("1-Agregar joya");
            System.out.println("2-Modificar joya");
            System.out.println("3-Mostrar catalogo de joyas");
            System.out.println("4-Eliminar joyas");
            System.out.println("5-Salir");
            System.out.println("-----------------------------------------");
            opcion=entradaScanner.nextInt();
            switch(opcion)
            {
                case 1:{
                    if(contador<10){
                        System.out.println("Introduce el numero de joya que quieres");
                        contador=entradaScanner.nextInt();
                        System.out.println(" ");
                    
                        System.out.println("Cual es el nombre de la joya");
                        nombre=entradaScanner.nextLine();
                        joyas[contador][0]=nombre;
                        System.out.println(" ");
                    
                        System.out.println("Cual es el material de la joya");
                        material=entradaScanner.nextLine();
                        joyas[contador][1]=material;
                        System.out.println(" ");
                    
                        System.out.println("Cual es el precio de la joya");
                        precio=entradaScanner.nextLine();
                        joyas[contador][2]=precio;
                        System.out.println(" ");
                        contador++;
                        break;
                    }
                }
                case 2:{
                    System.out.println("Cual es el numero de la joya que quieres modificar");
                    posicion_modificar=entradaScanner.nextInt();
                    System.out.println(" ");
                    
                    if(posicion_modificar <= contador){
                        System.out.println("Cual es el nuevo nombre de la joya");
                        nombre=entradaScanner.nextLine();
                        joyas[posicion_modificar][0]=nombre;
                        System.out.println(" ");
                        
                        System.out.println("Cual es el material de la joya");
                        material=entradaScanner.nextLine();
                        joyas[posicion_modificar][1]=material;
                        System.out.println(" ");
                        
                        System.out.println("Cual es el precio de la joya");
                        precio=entradaScanner.nextLine();
                        joyas[posicion_modificar][2]=precio;
                        System.out.println(" ");
                    }
                    break;
                }
                case 3:{
                    for(int i=0;i<contador;i++){
                        System.out.println("Posicion: " + i);
                        System.out.println("Precio: " + joyas[i][0]);
                        System.out.println("Material: " + joyas[i][1]);
                        System.out.println("Precio: " + joyas[i][2]);
                    }
                    break;
                }
                case 4:{
                    System.out.println("Que numero de joya quieres eliminar");
                    posicion_eliminar=entradaScanner.nextInt();
                    System.out.println(" ");
                    
                    if(posicion_eliminar<=contador){
                        joyas[posicion_eliminar][0]=" ";
                        joyas[posicion_eliminar][1]=" ";
                        joyas[posicion_eliminar][2]=" ";
                    }
                    break;
                }
                default:{
                    System.out.println("Error al introducir un dígito");
                }
            }
        }while(opcion!=5);
            System.out.println("Saliendo");
           
        
    }
}
