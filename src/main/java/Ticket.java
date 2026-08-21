/**
 * Representa un ticket de compra de la cafetería.
 */
public class Ticket {
    /*
  En esta clase he incluido:Constante para el nombre de la cafeteria
  Respecto a la clase ticket para crear un usuario y camarero;No tiene sentido crear un atributo de esta forma:
  private String Camarero(lo mismo aplica a cliente),porque yo ya tengo mi clase Cliente y Camarero, tiene más sentido hacerlo de esta forma:
  private Cliente cliente, porque ahi yo estoy referenciando a mi clase Cliente donde ya tengo este con sus atributos creados.
  Sobre el día de mañana si yo en mi clase Cliente añado por ejemplo intolerancia y dirección cliente, no es que automáticamente
  en el ticket vaya a aparecer esta información, sino que debo "actualizar" esta información en el ToString
  El método de agregarProducto() → utiliza el contador para colocar el nuevo producto en esa posición y después actualizar el contador.
*/
    public static final String NOMBRE_CAFETERIA = "-----CAFETERIA COCORA-----";
    private Cliente cliente;
    private Camarero camarero;
    //atributo de producto para guardarlos
    private Producto [] productos;
    //contador para saber la siguiente posición libre
    private int contadorProductos;
    private double totalPrecioProductos;

/*publico para llamarlo desde las otras clases, void porque no devuelve nada, agregar producto el nombre del metodo
    public void agregarProducto(Producto producto)
*/
    /**
     * Crea un ticket asociado a un cliente y un camarero.
     * Inicializa la lista de productos y el total del ticket.
     *
     * @param cliente cliente asociado al ticket
     * @param camarero camarero responsable de la venta
     */

    public Ticket(Cliente cliente, Camarero camarero){
        this.cliente = cliente;
        this.camarero = camarero;
        // al ser un ticket nuevo, necesita un espacio donde guardar los productos
        this.productos = new Producto[50];
        //el contador necesita un int, al ser nuevo parte de 0
        this.contadorProductos= 0;
        this.totalPrecioProductos=0;

    }
    /**
     * Añade un producto al ticket.
     *
     * @param producto producto que se añade al ticket
     */
    public void agregarProducto(Producto producto){
        productos[contadorProductos] = producto;
        contadorProductos = contadorProductos + 1;
    }

    /*truco para saber si necesito parametros: ¿El Ticket necesita que alguien le pase un precio?
    La respuesta es:No. Porque el Ticket ya tiene guardados los productos.
   Y cada producto ya sabe cuál es su precio. Así que el Ticket puede hacer el trabajo él solo.
    System.out.println("Importe: "+totalPrecioProductos + "€"); esta parte la quito de esta función para evitar que al
    imprimir me salga 2 veces el precio
    */
    /**
     * Calcula el precio total de los productos incluidos en el ticket.
     */
public void calcularTotal() {
    totalPrecioProductos=0;
    for (int i = 0; i < contadorProductos; i++) {
        totalPrecioProductos += productos[i].getPrecio() ;

    }

}
//este get está añadido previamente para la clase de test del ticket
    //mantengo mi atributo privado pero así puedo consultar el valor desde fuera

    /**
     * Devuelve el precio total de los productos del ticket.
     *
     * @return precio total de los productos
     */
    public double getTotalPrecioProductos() {
        return totalPrecioProductos;
    }

// esta funcion solo debería imprimir
//dentro de un metodo puedo llamar a otra función; en mi caso si ejecuto el código sin llamar a calcular total,me va a dar 0 al ejecutar.

    /**
     * Muestra por pantalla la información del ticket,
     * incluyendo el cliente, el camarero, los productos y el precio total.
     */
    public void mostrarTicket(){
        System.out.println(NOMBRE_CAFETERIA);
        System.out.println(cliente);
        System.out.println(camarero);

        for (int i =0; i<contadorProductos; i++){
            System.out.println(productos[i]);
        }
        calcularTotal();
        System.out.println("tienes "+contadorProductos+" productos en tu compra");
        System.out.println("el precio total de los productos es "+totalPrecioProductos+"€");



    }


    }



