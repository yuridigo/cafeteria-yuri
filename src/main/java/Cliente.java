/**
 * clase que representa a un cliente de la cafetería.
 */
public class Cliente {

    // atributos privados para fuera de la clase no poder acceder por seguridad
    //this. referencia al objeto actual. Es obligatorio cuando hay dos variables con el mismo nombre (por ejemplo, el atributo y el parámetro).

    /*
    pensar en una funcion como una tarea que te ponen en casa: void=espera que se haga una tarea por ejemplo limpiar la cocina y vuelves con las manos vacias
    return=quiere que hagas la compra, vas a la compra y vuelves con comida
    Los atributos representan el estado del objeto (lo que el objeto "es" o "tiene" tiene nombre telefono).
    Los métodos representan el comportamiento del objeto (lo que el objeto "hace").
     */

    private String nombre;
    private String telefono;
    private String correo;

// este es mi constructor con los atributos de nombre y telefono, debe ser publico, sino nadie va a poder usarlo
    /**
     * Crea un cliente con nombre y teléfono.
     *
     * @param nombre nombre del cliente
     * @param telefono teléfono del cliente
     */

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        setTelefono(telefono);
    }
// la funcion get devuelve el atributo nombre de este cliente
    /**
     * Devuelve el nombre del cliente.
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el teléfono del cliente.
     *
     * @return teléfono del cliente
     */

    public String getTelefono() {
        return this.telefono;
    }
/**
 * Devuelve el correo electrónico del cliente.
 *
 * @return correo electrónico del cliente
 */
    public String getCorreo() {
        return this.correo;
    }
// este constructor recibe nombre, telefono y correo
    /**
     * Crea un cliente con nombre, teléfono y correo electrónico.
     *
     * @param nombre nombre del cliente
     * @param telefono teléfono del cliente
     * @param correo correo electrónico del cliente
     */

    public Cliente(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.correo = correo;
        setTelefono(telefono);


    }
    /**
     * Modifica el nombre del cliente.
     *
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Modifica el teléfono del cliente.
     * El teléfono debe contener exactamente 9 dígitos.
     *
     * @param telefono nuevo teléfono del cliente
     */
    public void setTelefono(String telefono) {

// 1. Comprobamos la longitud
        if (telefono.length() == 9) {

            // 2. Comprobamos que todos los caracteres sean números
            boolean soloNumeros = true;
            for (int i = 0; i < telefono.length(); i++) {
                if (!Character.isDigit(telefono.charAt(i))) {
                    soloNumeros = false;
                    break; // Salimos si encontramos una letra
                }
            }

            if (soloNumeros) {

        /*Cuando un atributo necesita validación,
        es buena práctica hacerla en el setter. Si el constructor también recibe ese atributo,
        el constructor puede usar el setter para reutilizar esa validación
         */
                this.telefono=telefono;
            } else {
                System.out.println("Error: Contiene letras o símbolos.");
            }


        } else {
            System.out.println("Error: Debe tener exactamente 9 dígitos.");
        }


    }
    /**
     * Modifica el correo electrónico del cliente.
     *
     * @param correo nuevo correo electrónico del cliente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Devuelve una representación textual de los datos del cliente.
     *
     * @return datos del cliente en formato de texto
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("----- Cliente -----").append("\n");
        sb.append("Nombre:").append(nombre).append('\n');
        sb.append("Telefono:").append(telefono).append('\n');

// mejor que null que salga un mensaje cuando no se ha proporcionado correo
        if (correo !=null) {
            sb.append("Correo:").append(correo).append('\n');
        }else{
        sb.append("Correo:no disponible ").append("\n"); }

        return sb.toString();
    }

}


