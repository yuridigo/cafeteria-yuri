/**
 * Esta clase representa un producto de la cafetería, tiene 2 clases hijas, bebida y comida.
 */
public class Producto {
    // Las clases hijas pueden acceder a los atributos protected de su clase padre

    protected String nombre;
    protected double precio;
    protected String categoria;
    /**
     * Crea un producto con nombre, precio y categoría.
     *
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param categoria categoría del producto
     */

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
    /**
     * Muestra la información del producto.
     */
    public void informacionProducto() {
        System.out.println("----- Producto -----");
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Categoría:" + categoria);


    }
//Getter: función que sirve para leer un atributo. No recibe parámetros y devuelve el valor de ese atributo sin permitir modificarlo.
    /**
     * Devuelve el nombre del producto.
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el precio del producto.
     *
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Devuelve la categoría del producto.
     *
     * @return categoría del producto
     */
    public String getCategoria() {
        return categoria;
    }
//Setter: función que recibe un valor por parámetro para modificar un atributo.
// Además, puede comprobar que ese valor sea correcto antes de guardarlo.
    /**
     * Modifica el nombre del producto.
     *
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Modifica el precio del producto.
     * El precio debe ser mayor que cero.
     *
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {

        // El setter debe tener la asignación solo cuando el dato sea válido. Si el precio no es válido, muestro el mensaje y no cambio el atributo.
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error, importe no válido");
        }
    }
    /**
     * Modifica la categoría del producto.
     *
     * @param categoria nueva categoría del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * Devuelve una representación textual de los datos del producto.
     *
     * @return datos del producto en formato de texto
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("-----Producto -----").append("\n");
        sb.append("Nombre:").append(nombre).append('\n');
        sb.append("Categoria:").append(categoria).append('\n');
        sb.append("Precio:").append(precio).append("\n");



        return sb.toString();
    }
}




