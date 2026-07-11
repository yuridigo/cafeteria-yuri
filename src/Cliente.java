public class Cliente {

    // atributos privados para fuera de la clase no poder acceder por seguridad
    //this.nombre=nombre, hace referencia al objeto, pero para entenderlo puedo interpretar
    //el cajon de este cliente es igual al nombre que me acaban de pasar

    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
