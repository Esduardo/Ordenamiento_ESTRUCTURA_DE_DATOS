package models;

public class Producto {
    private static int id;
    private static String nombre;
    private static int stock;

    public  Producto(int id, String nombre, int stock){
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    public  int getid() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public int getstock() {
        return stock;
    }

    public void setId(int id) {
        Producto.id = id;
    }

    public  void setNombre(String nombre) {
        Producto.nombre = nombre;
    }

    public  void setStock(int stock) {
        Producto.stock = stock;
    }
}
