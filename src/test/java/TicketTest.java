import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Pruebas para la clase Ticket.
 */
public class TicketTest {
    /**
     * Comprueba que se calcula correctamente el total del ticket.
     */
    @Test
   void calcularTotalTicketTest(){

        Cliente c1=new Cliente("yuri","666728194");
        Camarero camarero1= new Camarero("Nami","Ca01" );
        Ticket ticket = new Ticket(c1, camarero1);

        Producto producto = new Producto("Arepa", 2.0, "comida");
        ticket.agregarProducto(producto);

        ticket.calcularTotal();
        assertEquals(2.0, ticket.getTotalPrecioProductos());


    }

}
