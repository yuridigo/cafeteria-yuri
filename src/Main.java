import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Cliente c1=new Cliente("yuri","666728194");
        System.out.println(c1);
        Camarero camarero1= new Camarero("Nami","Ca01" );
        System.out.println(camarero1);
        Bebida b1= new Bebida("avena",2,"bebida",Tamanio.MEDIANO);
        b1.informacionProducto();
        Comida co1=new Comida("empanada",1.8,"comida",true);
        co1.informacionProducto();



    }
}
