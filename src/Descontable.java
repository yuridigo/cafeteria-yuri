/*
debo tener el metodo double aplicarDescuento
java no permite que una clase herede de varias clases (extends),
y las interfaces son una forma de compartir comportamientos entre
clases sin necesidad de esa herencia múltiple.
Las interfaces también sirven para decir:
"Estas clases, aunque no sean de la misma familia, comparten una capacidad."
Un atributo guarda información que pertenece al objeto durante toda su vida.
Un parámetro es un dato que un método necesita solo cuando se ejecuta.
 */

public interface Descontable {

    public double aplicarDescuento(double porcentaje);
}
