public class Bebida extends Producto {

    // mi bebida va a ser avena colombiana que se puede escoger tamaño de 250 que es pequeño o 500 grande
    private String tamanio;

    public Bebida(String  nombre, double precio, String categoria, String tamanio){

        super(nombre,precio,categoria);
        this.tamanio = tamanio;

    }
}
