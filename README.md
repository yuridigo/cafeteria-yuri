# Cafetería COCORA

## Descripción

Aplicación desarrollada en Java para gestionar las ventas de una cafetería mediante tickets.

El proyecto utiliza programación orientada a objetos, herencia, interfaces, composición, arrays, estructuras condicionales y bucles.

## Estructura del proyecto

El proyecto está organizado siguiendo la estructura de Maven:

- `src/main/java`: contiene las clases principales de la aplicación.
- `src/test/java`: contiene las pruebas realizadas con JUnit.
- `pom.xml`: contiene la configuración del proyecto y sus dependencias.
- `README.md`: documentación general del proyecto.

## Clases principales

- `Producto`: clase padre, representa los productos de la cafetería.
- `Bebida`: hereda de `Producto` y añade el tamaño de la bebida.
- `Comida`: hereda de `Producto` y permite aplicar descuentos mediante la interfaz `Descontable`.
- `Descontable`: interfaz que define el método para aplicar descuentos.
- `Cliente`: representa al cliente.
- `Camarero`: representa al responsable de la venta.
- `Ticket`: relaciona el cliente, el camarero y los productos de una venta.
- `Main`: clase principal desde la que se ejecuta el programa.

## Funcionalidades

El programa permite:

- Crear clientes y camareros.
- Crear productos, bebidas y comidas.
- Añadir productos a un ticket.
- Calcular el precio total de una compra.
- Mostrar el ticket por pantalla.
- Aplicar descuentos a las comidas que corresponda.

## Pruebas

El proyecto incluye pruebas automatizadas realizadas con JUnit 5:

- `ComidaTest`: comprueba la aplicación de descuentos en comidas frías y calientes.
- `TicketTest`: comprueba el cálculo del total de un ticket.

## Tecnologías utilizadas

-Java 21 (inicialmente Java 25, pero se cambió a Java 21 para evitar incompatibilidades).
- Maven (añadido después de la creación del proyecto al revisar el enunciado).
- JUnit 5
- IntelliJ IDEA
- Git y GitHub

## Ejecución

La aplicación se ejecuta desde la clase `Main`.

Las pruebas pueden ejecutarse desde las clases de test situadas en `src/test/java`.

El proyecto utiliza Maven para gestionar la compilación y las dependencias.

## Autoría

Proyecto realizado por Yuri.

## Licencia

Este proyecto se distribuye bajo la licencia MIT.