import models.Inventario;
import models.Producto;

import java.util.Scanner;

public class Principal {
    public static void main(String [] srgs){
        Scanner entrada =  new Scanner(System.in);
        int opc;
        do{
            System.out.println("\n::          Inventario EXAMEN           ::" +
                             "\n::           1. registrar               ::" +
                             "\n::           2. ordenar                 ::" +
                             "\n::           3. Visualizar              ::" +
                             "\n::           4. Salir                   ::");
            System.out.printf("        : ");
            opc =  entrada.nextInt();
            switch (opc){
                case 1:
                    Inventario.registrar();
                    break;
                case 2:
                    Inventario.ordenar();
                    break;
                case 3:
                    Inventario.visualizar();
                    break;
                case 4:
                    System.out.println(" || :]   nos vemooos :] ||");
                    break;
                default:
                    System.out.println("||     ESTA OPCION NO EXISTE :[     ||");
            }
        }while(opc != 4);
    }
}
