
package com.mycompany.crud_dos_dimensiones_class;
import java.util.Scanner;

    class Joyas{
        public String nombre;
        public String material;
        public int precio;
    }

public class CRUD_dos_dimensiones_class 
{

    public static void main(String[] args) 
    {
        
        Scanner entradaScanner = new Scanner(System.in);
        
        Joyas[] datos= new Joyas[10];
        int menu=0;
        int añadir;
        int contador=0;
        String nombre_eliminar=null;
        String material_eliminar = null;
        int precio_eliminar=0;
        int opcion1;
        String joya_modificar;
        
        do
        {
            System.out.println("Bienvenido a la tienda de Joyas de Alejandro");
            System.out.println("--------------------------------------------");
            System.out.println("1-Agregar joyas");
            System.out.println("2-Eliminar joyas");
            System.out.println("3-Modificar joyas");
            System.out.println("4-Catálogo de joyas");
            System.out.println("5-Salir");
            System.out.println("--------------------------------------------");
            System.out.println("Elige una opcion");
            menu=entradaScanner.nextInt();
            System.out.println("Accediendo............");
            System.out.println("");
            
            switch(menu)
            {
                case 1:
                {
                    System.out.println("Accediendo a la opción de agregar joyas");
                    System.out.println("");
                    
                    System.out.println("¿Cuantas jpyas quieres agregar?");
                    añadir=entradaScanner.nextInt();
                    
                    for(int i=0;i<añadir;i++)
                    {
                        datos[i]= new Joyas();
                        System.out.println("¿Cual es el nombre de la joya?");
                        datos[contador].nombre=entradaScanner.nextLine();
                        datos[contador].nombre=entradaScanner.nextLine();
                        
                        System.out.println("¿Cual es el material de la joya?");
                        datos[contador].material=entradaScanner.nextLine();
                        
                        System.out.println("¿Caul es el precio de la joya?");
                        datos[contador].precio=entradaScanner.nextInt();
                        System.out.println("");
                        
                        contador++;
                    }
                break;
                }
                case 2:
                {
                    System.out.println("Accediendo a la opción de eliminar joyas");
                    System.out.println("");
                    
                    System.out.println("Buscar joya y eliminar en funcion del 1-nombre, 2-material o 3-precio");
                    opcion1=entradaScanner.nextInt();
                    
                    switch(opcion1)
                    {
                        case 1:
                        {
                            System.out.println("Buscar joya en funcion del nombre y eliminar joya");
                            System.out.println("");
                            
                            for(int i=0;i<contador;i++)
                            {
                                if(nombre_eliminar==datos[i].nombre)
                                {
                                    datos[i].nombre=null;
                                    datos[i].material=null;
                                    datos[i].precio=0;
                                }
                            }
                        break;
                        }
                        case 2:
                        {
                            System.out.println("Buscar joya en funcion del material y eliminar joya");
                            System.out.println("");
                            
                            for(int i=0;i<contador;i++)
                            {
                                if(material_eliminar==datos[i].material)
                                {
                                    datos[i].nombre=null;
                                    datos[i].material=null;
                                    datos[i].precio=0;
                                }
                            }
                        break;
                        }
                        case 3:
                        {
                            System.out.println("Buscar una joya en funcion del precio y eliminar joya");
                            System.out.println("");
                            
                            for(int i=0;i<contador;i++)
                            {
                                if(precio_eliminar==datos[i].precio)
                                {
                                    datos[i].nombre=null;
                                    datos[i].material=null;
                                    datos[i].precio=0;
                                }
                            }
                        }
                    }
                }
                case 3:
                {
                    System.out.println("Has accedido al menu de modificacion de joyas");
                    System.out.println("");
                            
                    System.out.println("¿Cual es el nombre de la joya que quieres modificar");
                    joya_modificar=entradaScanner.nextLine();
                    
                    for(int i=0;i<contador;i++)
                    {
                        if(joya_modificar==datos[i].nombre)
                        {
                            System.out.println("¿Cual es el nuevo nombre de la joya");
                            datos[i].nombre=entradaScanner.nextLine();
                            
                            System.out.println("¿Cual es el nuevo material de la joya");
                            datos[i].material=entradaScanner.nextLine();
                            
                            System.out.println("¿Cual es el nuevo precio de la joya");
                            datos[i].precio=entradaScanner.nextInt();
                        }
                    }
                }
                case 4:
                {
                    System.out.println("Has accedido al catalogo de las joyas");
                    System.out.println("");
                    
                    for(int i=0;i<contador;i++)
                    {
                        System.out.println("Posicion: " + i);
                        System.out.println("Nombre: " + datos[i].nombre);
                        System.out.println("Material: " + datos[i].material);
                        System.out.println("Precio: " + datos[i].precio);
                        System.out.println("");
                    }
                }
            }   
        }while(menu!=5);
            System.out.println("Saliendo...");
    }
}
