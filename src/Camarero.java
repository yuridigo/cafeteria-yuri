public class Camarero {
   private String nombre;
   private String codigoCamarero;

    public Camarero(String nombre, String codigoCamarero) {
        this.nombre = nombre;
        this.codigoCamarero = codigoCamarero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoCamarero() {
        return codigoCamarero;
    }

    public void setCodigoCamarero(String codigoCamarero) {
        this.codigoCamarero = codigoCamarero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("-----Responsable venta-----").append("\n");
        sb.append("Nombre:").append(nombre).append('\n');
        sb.append("Código del camarero:").append(codigoCamarero).append('\n');
        return sb.toString();
    }
}
