/**
 * clase que representa a un camarero de la cafetería.
 */

public class Camarero {
   private String nombre;
   private String codigoCamarero;
    /**
     * Crea un camarero con su nombre y código identificativo.
     *
     * @param nombre nombre del camarero
     * @param codigoCamarero código identificativo del camarero
     */
    public Camarero(String nombre, String codigoCamarero) {
        this.nombre = nombre;
        this.codigoCamarero = codigoCamarero;
    }
    /**
     * Devuelve el nombre del camarero.
     *
     * @return nombre del camarero
     */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * Modifica el nombre del camarero.
     *
     * @param nombre nuevo nombre del camarero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el código del camarero.
     *
     * @return código del camarero
     */
    public String getCodigoCamarero() {
        return codigoCamarero;
    }
    /**
     * Modifica el código del camarero.
     *
     * @param codigoCamarero nuevo código del camarero
     */
    public void setCodigoCamarero(String codigoCamarero) {
        this.codigoCamarero = codigoCamarero;
    }
    /**
     * Devuelve una representación textual de los datos del camarero.
     *
     * @return datos del camarero en formato de texto
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("-----Responsable venta-----").append("\n");
        sb.append("Nombre:").append(nombre).append('\n');
        sb.append("Código del camarero:").append(codigoCamarero).append('\n');
        return sb.toString();
    }
}
