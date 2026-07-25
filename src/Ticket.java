public class Ticket {
    /*
     para definir el nombre de la cafeteria
   camareros y clientes en plural
  Respecto a la clase ticket para crear un usuario y camarero.
  No tiene sentido crear un atributo de esta forma: private String Camarero(lo mismo aplica a cliente),
  porque yo ya tengo mi clase Cliente y Camarero, tiene más sentido hacerlo de esta forma:
   private Cliente cliente, porque ahi yo estoy referenciando a mi clase Cliente donde ya tengo este con sus atributos creados.
   No es necesario que yo haya creado este cliente primero en el Main.
    Sobre el día de mañana si yo en mi clase Cliente añado por ejemplo intolerancia y direccion cliente, no es que automaticamente en el ticket vaya a aparecer esta informacion, sino que debo "actualizar" esta informacion en el ToString

     */
    public static final String NOMBRE_CAFETERIA = "Cocora";
    private Cliente cliente;
    private Camarero camarero;
    private Producto [] productos;
    private int contadorProductos;

    public Ticket(Camarero camarero,Cliente cliente, Producto[] productos, int contadorProductos) {
        this.camarero = camarero;
        this.cliente = cliente;
        this.productos = productos;
        this.contadorProductos = contadorProductos;
    }
/*publico para llamarlo desde las otras clases, void porque no devuelve nada, agregar producto el nombre del metodo
    public void agregarProducto(Producto producto) {
*/
    }


