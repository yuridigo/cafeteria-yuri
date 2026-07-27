public class Comida extends Producto{


    //comida empanadas colombianas que se pueden comprar frias o calientes. Por lo general se comen calientes, pero hay que considerar otros gustos

    private boolean caliente;
//constructor
    public Comida(String nombre, double precio, String categoria, boolean caliente){
        super(nombre,precio,categoria);
        this.caliente = caliente;

    }
/*metodo sobreescrito
Sobrescribo informacionProducto() para aprovechar lo que ya hace Producto (mostrar nombre, precio y categoría)
y además añadir la información específica de Bebida (el tamaño)
  */
    @Override
    public void informacionProducto() {
        super.informacionProducto();

        if(caliente){
            System.out.println("Caliente:sí");
        }else{
            System.out.println("Caliente:no");
        }
    }
}
