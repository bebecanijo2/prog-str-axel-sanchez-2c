import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaService servicio = new PersonaService();
        Persona[] personas = new Persona[20];

        int decision = 0;

        do {
            System.out.println("1.- Alta");
            System.out.println("2.- Buscar por ID (solo activas)");
            System.out.println("3.- Baja lógica por ID");
            System.out.println("4.- Listar activas");
            System.out.println("5.- Actualizar nombre por ID (solo activas)");
            System.out.println("6.- Salir");
            System.out.print("Elige una opcion: ");

            if (sc.hasNextInt()) {
                decision = sc.nextInt();
            } else {
                sc.next();
                decision = -1;
            }

            switch (decision) {
                case 1:
                    servicio.alta(sc, personas);
                    break;
                case 2:
                    servicio.buscarPorId(sc, personas);
                    break;
                case 3:
                    servicio.bajaLogica(sc, personas);
                    break;
                case 4:
                    servicio.listarActivas(personas);
                    break;
                case 5:
                    servicio.actualizarNombre(sc, personas);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (decision != 6);
    }


}
