public class Producto {
    // los atributos protected van a poder ser vistos por la clase padre y las clases hijas

    protected String nombre;
    protected double precio;
    protected String categoria;


    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
}
