import java.util.Scanner;

public class Main {

    public static int PARCIALES = 3;
    public static int PUNTOS_REQUERIDOS = 18;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de calificaciones del CETIS 12\n");
        System.out.println("Tienes que juntar 18 puntos para pasar la materia\n");
        int primerNota = pedirEntero(scanner, "Introduce la primer nota\n");
        int segundaNota = pedirEntero(scanner, "Introduce la segunda nota\n");
        int tercerNota = pedirEntero(scanner, "Introduce la tercer nota\n");
        double resultado = sumaPuntosTotales(primerNota,segundaNota,tercerNota);
        String pase = aprobadoOReprobado(resultado);
        System.out.println("La suma total de puntos es de: " + resultado + " Tu fuiste: " + pase);
        double promedio = calcularPromedio(primerNota,segundaNota,tercerNota);
        System.out.println("El promedio del ciclo escolar fue de: "+promedio);
    }

    /**
     * Función para pedir al usuario las calificaiones y leerlas
     * @param scanner Permite a la función leer los inputs
     * @param mensaje Permite arrojar un mensaje al usuario para especificar lo que tiene que poner
     * @return Input leído por el programa
     */
    public static int pedirEntero(Scanner scanner, String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    /**
     * Función para la suma de las calificaciones para verificar cuantos puntos
     * @param primerNota Primer nota del primer parcial
     * @param segundaNota Segunda nota del segundo parcial
     * @param tercerNota Tercer nota del tercer parcial
     * @return Si el usuario juntó los puntos necesarios para pasar
     */
    public static double sumaPuntosTotales(int primerNota, int segundaNota, int tercerNota){
        return primerNota+segundaNota+tercerNota;
    }

    /**
     * Funcion para calcular el promedio en total del ciclo escolar
     * @param primerNota Primer nota del primer parcial
     * @param segundaNota Segunda nota del segundo parcial
     * @param tercerNota Tercer nota del tercer parcial
     * @return Nos devuelve el promedio ya calculado
     */
    public static double calcularPromedio(int primerNota, int segundaNota, int tercerNota){
        return (primerNota+segundaNota+tercerNota)/PARCIALES;

    }

    /**
     * Funcion para determinar si el usuario paso la materia o no
     * @param resultado Son los puntos sumados de los parciales cursados
     * @return Devolverá si el usuario pasó o no la materia
     */
    public static String aprobadoOReprobado(double resultado){
        if (resultado>=PUNTOS_REQUERIDOS) return "APROBADO";
        else return "REPROBADO";
    }

}