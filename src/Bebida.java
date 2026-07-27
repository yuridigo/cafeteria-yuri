/*
esto de abajo traducido seria algo como una bebida es un producto,
por eso hereda todo lo que tiene producto
CHULETA:
¿Se llama igual que la clase y no devuelve nada? → Constructor.
¿Tiene otro nombre y devuelve un tipo (o void)? → Método.
 */
public class Bebida extends Producto {
    private Tamanio tamanio;
    //declaro tamaño porque en mi clase producto no lo tengo

//super(...) le digo al constructor del padre: "construye tú la parte común del objeto (nombre, precio y categoría),
// que yo como hija añadiré mis propios atributos
    public Bebida(String  nombre, double precio, String categoria, Tamanio tamanio){

        super(nombre,precio,categoria);
        this.tamanio=tamanio;


    }
// pensar en super como: "Le pido al padre que muestre la parte común del producto y despues la hija, añade lo que sabe."
@Override public void informacionProducto(){
        super.informacionProducto();

    System.out.println("Tamanio: " + tamanio);


}

}
