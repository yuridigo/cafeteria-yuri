import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Cliente c1=new Cliente("yuri","666728194");
        Camarero camarero1= new Camarero("Nami","Ca01" );
        Bebida b1= new Bebida("avena",2,"bebida",Tamanio.MEDIANO);
        Bebida b2= new Bebida("café",1.8,"bebida",Tamanio.MEDIANO);
        Comida co1=new Comida("empanada",1.8,"comida",true);
        Ticket ticket1 = new Ticket(c1,camarero1);
        ticket1.agregarProducto(b1);
        ticket1.agregarProducto(b2);
        ticket1.agregarProducto(co1);
        ticket1.mostrarTicket();






    }
}
