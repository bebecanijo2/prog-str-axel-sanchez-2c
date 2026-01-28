import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean esEstudiante;
        int tarifa = 0;
        String estaEstudiando = "";
        edad = leerEdad(sc, "Qué edad tienes?");
        esEstudiante = leerEstudiante(sc, "Eres estudiante? (true/false)");


        if (edad < 12){
            tarifa = 50;

        } else if ((edad>=12&&edad<=17)) {

            if (esEstudiante = true){
                tarifa = 60;
                estaEstudiando = "SI";
            } else if (esEstudiante=true){
                tarifa = 80;
                estaEstudiando = "NO";
            }
        } else if (edad >= 18) {
            if (esEstudiante = true){
                tarifa = 90;
                estaEstudiando = "SI";

            } else if (esEstudiante = false) {
                tarifa = 120;
                estaEstudiando = "NO";

            }

        } else if ((edad<0||edad>120)) {
            System.out.println("Edad invalida");
            
        }
        System.out.println("\n Tu edad es de: "+edad + "\n Estas estudiando: "+estaEstudiando + "\n Tu tarifa es de: " + tarifa);

    }
    public static int leerEdad(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
    public static boolean leerEstudiante(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextBoolean();
    }
}