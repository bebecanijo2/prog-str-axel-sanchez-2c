import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("____________");
        Persona[] personas = new Persona[20];

        int decision;

        do {

            System.out.println("Elige lo que quieres hacer");
            System.out.println("1.-Alta");
            System.out.println("2.-Buscar por ID (solo activas)");
            System.out.println("3.-Baja logica por ID ");
            System.out.println("4.-Listar activas");
            System.out.println("5.-Actualizar nombre por ID (solo activas)");
            System.out.println("6.salir");
            sc.nextInt();



        }while (decision!=6);




    }
}