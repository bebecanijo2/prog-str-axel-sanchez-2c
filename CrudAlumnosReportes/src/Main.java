import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        AlumnoService servicio = new AlumnoService();
        Alumno[] alumnos = new Alumno[25];

        int decision =-1;

        do {
            System.out.println("Elige lo que quieres hacer");
            System.out.println("1.-Dar alta a Alumno");
            System.out.println("2.-Buscar por ID alumnos activos");
            System.out.println("3.-Actualizar promedio de alumno por ID");
            System.out.println("4.-Baja lógica de alumno por ID");
            System.out.println("5.-Listar alumnos activos");
            System.out.println("6.-Reportes de los alumnos");
            System.out.println("0.-Salir");

            if (sc.hasNextInt()){
                decision = sc.nextInt();
            }else {
                sc.nextLine();
                decision = -1;
            }

            switch (decision){
                case 1:
                    servicio.alta(sc, alumnos);
                    break;
                case 2:
                    servicio.buscarPorId(sc, alumnos);
                    break;
                case 3:
                    servicio.actualizarPromedio(sc, alumnos);
                    break;
                case 4:
                    servicio.bajaLogica(sc, alumnos);
                    break;
                case 5:
                    servicio.listarActivas(alumnos);
                    break;
                case 6:
                    servicio.imprimirReporte(alumnos);
                    break;

            }


        }while (decision!=0);
    }
}