package models;

public class Producto {
    String nombre;
    int stock;
    int id;

    public Producto(String nombreA, int matriculaA, int id){
        this.nombre = nombreA   ;
        this.stock = matriculaA;
        this.id = this.id;
    }

    public String getNombre (){
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public int getId() {
        return id;
    }
}

