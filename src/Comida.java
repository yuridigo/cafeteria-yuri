public class Comida extends Producto implements Descontable {

    //comida empanadas colombianas que se pueden comprar frias o calientes.
    // Por lo general se comen calientes, pero hay que considerar otros gustos
    //Un atributo guarda información que pertenece al objeto durante toda su vida.
    //Un parámetro es un dato que un método necesita solo cuando se ejecuta.Por lo tanto aqui no tengo que crear
    //private double descuento(intente crearlo)
    private boolean caliente;

    //constructor
    public Comida(String nombre, double precio, String categoria, boolean caliente) {
        super(nombre, precio, categoria);
        this.caliente = caliente;

    }

    /*metodo sobreescrito
    Sobrescribo informacionProducto() para aprovechar lo que ya hace Producto (mostrar nombre, precio y categoría)
    y además añadir la información específica de Bebida (el tamaño)
    System.out.println("Tienes un descuento del " + porcentaje + "%");
            System.out.println("Precio final: " + precioFinal + " €");
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
