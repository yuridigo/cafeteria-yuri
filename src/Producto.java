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
    /*
    public es el modificador de acceso, lo hago pubilco para poder llamarlo desde otras clases
    void como valor de retorno,ya que el objetivo es mostrar la informacion no devolver un valor
     no paso parametros, porque el propio objeto ya conoce su informaicon

     metodos
      o funciones dentro de una clase que describen el comportamiento
       y las acciones que un objeto puede realizar. Los tipos principales son métodos de instancia,
       constructores y métodos getters/setters.

     */

    public void informacionProducto() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoria);


    }
}
