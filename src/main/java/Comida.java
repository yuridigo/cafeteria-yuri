/**
 * Clase que representa una comida de la cafetería y permite aplicar descuentos.
 */

public class Comida extends Producto implements Descontable {

    //Un atributo guarda información que pertenece al objeto durante toda su vida.
    //Un parámetro es un dato que un método necesita solo cuando se ejecuta.Por lo tanto aqui no tengo que crear
    //private double descuento(intente crearlo)
    private boolean caliente;

    /**
     * Crea una comida con sus datos e indica si se sirve caliente.
     *
     * @param nombre nombre de la comida
     * @param precio precio de la comida
     * @param categoria categoría del producto
     * @param caliente indica si la comida se sirve caliente
     */
    public Comida(String nombre, double precio, String categoria, boolean caliente) {
        super(nombre, precio, categoria);
        this.caliente = caliente;

    }

    /*método sobreescrito
    Sobrescribo informacionProducto() para aprovechar lo que ya hace Producto (mostrar nombre, precio y categoría)
    y además añadir la información específica de Bebida (el tamaño)
    System.out.println("Tienes un descuento del " + porcentaje + "%");
            System.out.println("Precio final: " + precioFinal + " €");
      */
    /**
     * Muestra la información del producto e indica si la comida está caliente.
     */
    @Override
    public void informacionProducto() {
        super.informacionProducto();

        if (caliente) {
            System.out.println("Caliente:sí");
        } else {
            System.out.println("Caliente:no");
        }
    }
    /**
     * Aplica un descuento al precio de la comida si no está caliente.
     * Si la comida está caliente, mantiene su precio original.
     *
     * @param porcentaje de descuento que se aplica
     * @return precio final de la comida
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        if (caliente) {
            System.out.println("Precio sin oferta");
            return getPrecio();
        }else {
            double precioFinal = getPrecio() - (getPrecio() * porcentaje / 100);

            return precioFinal;
        }


    }


}
