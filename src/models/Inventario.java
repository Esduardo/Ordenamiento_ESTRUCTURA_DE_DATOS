package models;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.Port;
import java.net.CacheRequest;
import java.util.Scanner;

public class Inventario {
    static Producto objetoProducto;
    static  Producto [] arregloA;
    static Scanner entrada =  new Scanner(System.in);
    public static void registrar(){
        String nom;
        int cantidadPro,  y = 0, stock, id = 0;
        System.out.println("::                    REGISTRO              ::");
        System.out.println("::     cantidad fija (5 elementos)          ::");

        for (int i = 0; i < 5; i++) {
            arregloA =  new Producto[5];
            System.out.print("Nombre: ");
            nom = entrada.next();
            System.out.print("stock: ");
            stock = entrada.nextInt();
            objetoProducto = new Producto(id, nom, stock);
            arregloA [i] = objetoProducto;
        }
        for(int i = 0; i < 5; i++){
            System.out.println(arregloA[i].getid());
            System.out.println(arregloA[i].getnombre());
            System.out.println(arregloA[i].getstock());
        }

    }

    public static void ordenar(){
        Producto aux;
        for(int i = 0; i < 5 - 1; i++){
            for(int j = 0; j < 5 - 1; j++){
                if(arregloA[j].getstock() > arregloA[j+1].getstock()){
                    aux = arregloA[j];
                    arregloA[j] = arregloA[j + 1];
                    arregloA[j+1] = aux;
                }
            }
        }
    }

    public static void visualizar(){
        System.out.println("      Visualizacion de productos      ");
        for(int i = 0; i < 5; i++){
            System.out.printf("\nID      : " + arregloA[i].getid());
            System.out.printf("\nProducto: " + arregloA[i].getnombre());
            System.out.printf("\nStock   : " + arregloA[i].getstock());
        }
    }
}
