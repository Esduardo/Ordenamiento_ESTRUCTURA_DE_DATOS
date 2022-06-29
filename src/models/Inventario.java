package models;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.Port;
import java.net.CacheRequest;
import java.util.Scanner;

public class Inventario {
    static Producto objetoProducto;
    static  Producto [] arregloA;
    static Scanner entrada =  new Scanner(System.in);
    public static void registrar() {
        Scanner entrada= new Scanner(System.in);
        int cantidad, stock, id = 0;
        String nom;
        arregloA = new Producto[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nombre: ");
            nom = entrada.next();
            do {
                System.out.print("stock: ");
                stock = entrada.nextInt();
            }while(stock < 1000 || stock >9999);
            System.out.printf("id:  " + i + "\n");
            id = id + i;
            objetoProducto = new Producto(nom, stock, id);
            arregloA [i - 1] = objetoProducto;
        }


    }
    public static void ordenar(){
        Producto aux;
        for(int i = 0; i < 5 - 1; i++){
            for(int j = 0; j < 5 - 1; j++){
                if(arregloA[j].getStock() > arregloA[j+1].getStock()){
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
            System.out.printf("\nProducto      : " + arregloA[i].getNombre());
            System.out.printf("\nstock: " + arregloA[i].getStock());
            System.out.printf("\nID   : " + arregloA[i].getId());
        }
    }
}
