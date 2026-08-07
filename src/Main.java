import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //nuevo objeto cliente y camarero
        Cliente c1=new Cliente("yuri","666728194");
        Camarero camarero1= new Camarero("Nami","Ca01" );
        //productos
        Bebida b1= new Bebida("avena",2,"bebida",Tamanio.MEDIANO);
        Bebida b2= new Bebida("café",1.8,"bebida",Tamanio.MEDIANO);
        Comida empanada=new Comida("empanada",2,"comida",false);
        //ticket
        Ticket ticket1 = new Ticket(c1,camarero1);
        ticket1.agregarProducto(b1);
        ticket1.agregarProducto(b2);
        ticket1.agregarProducto(empanada);
        ticket1.mostrarTicket();
        //he metido aquí la variable precioFinal, porque no he sabido crear dentro de ticket el llamar al método aplicar descuento e implementarlo
        //el descuento se hace aquí, se muestra al final del ticket
        double precioFinal =empanada.aplicarDescuento(10);
        System.out.println("Descuento aplicado a la empanada: 10%");
        System.out.println("Precio final de la empanada: " + precioFinal + " €");






    }
}
