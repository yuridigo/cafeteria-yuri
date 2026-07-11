public class Comida extends Producto{


    //comida empanadas colombianas que se pueden comprar frias o calientes

    private boolean caliente;

    public Comida(String nombre, double precio, String categoria, boolean caliente){
        super(nombre,precio,categoria);
        this.caliente = caliente;


    }



}
