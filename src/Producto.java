public class Producto {
    // los atributos protected van a poder ser vistos por la clase padre y las clases hijas

    protected String nombre;
    protected double precio;
    protected String categoria;


    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        setPrecio(precio);
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
        System.out.println("----- Producto -----");
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Categoría:" + categoria);


    }
//Getter: función que sirve para leer un atributo. No recibe parámetros y devuelve el valor de ese atributo sin permitir modificarlo.
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }
//Setter: función que recibe un valor por parámetro para modificar un atributo.
// Además, puede comprobar que ese valor sea correcto antes de guardarlo.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {

        if (precio <=0){
            System.out.println("Error, importe no válido");
        }
        // El setter debe tener la asignación solo cuando el dato sea válido. Si el precio no es válido, muestro el mensaje y no cambio el atributo.
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("-----Producto -----").append("\n");
        sb.append("Precio:").append(precio).append("\n");
        sb.append("Categoria:").append(categoria).append('\n');
        sb.append("Nombre:").append(nombre).append('\n');

        return sb.toString();
    }
}




