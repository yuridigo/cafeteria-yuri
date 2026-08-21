import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
@Test indica a JUnit: "este método es una prueba".
aplicarDescuentoComidaFria() → nombre  dado a la prueba
assertEquals, es la herramienta con la que compruebo que el resultado es el esperado
 */
/**
 * Pruebas para la clase Comida.
 */
public class ComidaTest {
    /**
     * Comprueba que una comida fría aplica correctamente un descuento.
     */

    @Test
    void aplicarDescuentoComidaFria() {
        Comida comida = new Comida("Empanada", 2.0, "comida", false);
        double resultado = comida.aplicarDescuento(10);
        assertEquals(1.80, resultado);

    }
    /**
     * Comprueba que una comida caliente mantiene su precio sin descuento.
     */
    @Test
    void aplicarDescuentoComidaCaliente() {
        Comida comida = new Comida("Empanada", 2.0, "comida", true);

        double resultado = comida.aplicarDescuento(10);

        assertEquals(2.0, resultado);
    }
}


