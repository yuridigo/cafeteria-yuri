public class Comida extends Producto{


    //comida empanadas colombianas que se pueden comprar frias o calientes. Por lo general se comen calientes, pero hay que considerar otros gustos

    private boolean caliente;

    public Comida(String nombre, double precio, String categoria, boolean caliente){
        super(nombre,precio,categoria);
        this.caliente = true;


    }



}
