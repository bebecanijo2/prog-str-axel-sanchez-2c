import java.util.Scanner;

public class ActividadIfElseTarifa {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int edad;
        boolean esEstudiante = false;
        int tarifa = 0;
        String estaEstudiando = "";

        edad = leerEdad(sc, "Qué edad tienes?");
        if (edad>0){
            esEstudiante = leerEstudiante(sc, "Eres estudiante? (true/false)");

            if (edad < 12){
                tarifa = 50;

            } else if ((edad>=12 && edad<=17)) {

                if (esEstudiante == true){
                    tarifa = 60;
                    estaEstudiando = "SI";
                } else if (esEstudiante==false){
                    tarifa = 80;
                    estaEstudiando = "NO";
                }
            } else if (edad >= 18) {
                if (esEstudiante == true){
                    tarifa = 90;
                    estaEstudiando = "SI";

                } else if (esEstudiante == false) {
                    tarifa = 120;
                    estaEstudiando = "NO";

                }

            }
        } else {
            System.out.println("Edad invalida");
            tarifa = 0;
            estaEstudiando = "NO";
        }



        System.out.println("\n Tu edad es de: "+edad + "\n Estas estudiando: "+estaEstudiando + "\n Tu tarifa es de: " + tarifa);

    }

    /**
     * Este metodo nos permite leer la edad del usuario
     * @param sc Escanea el input introducido por el usuario
     * @param mensaje Nos permite darle la instruccion al usuario de que introduzca su edad
     * @return Edad leida para nosotros poder clasificar su tarifa
     */
    public static int leerEdad(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo para leer si el usuario es un estudiante o no
     * @param sc Escanea el input del usuario
     * @param mensaje Permite preguntarle al usuario si es un estudiante o no
     * @return Opcion leida en booleano
     */
    public static boolean leerEstudiante(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextBoolean();
    }
}