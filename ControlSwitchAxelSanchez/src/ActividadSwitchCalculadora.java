
import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caso = leerCaso(sc, "Elige que quieres hacer\n 1)Suma\n 2)Restar\n 3)Multiplicar\n 4)Dividir");
        double primerNumero;
        double segundoNumero;
        double resultado;

        switch (caso){
            case 1:
                 primerNumero = leerDouble(sc, "Introduce el primer numero");
                 segundoNumero= leerDouble(sc, "Introduce el segundo numero");
                 resultado = realizarSuma(primerNumero, segundoNumero);
                System.out.println("El resultado de la suma es "+ resultado);
                break;
            case 2:
                 primerNumero = leerDouble(sc, "Introduce el primer numero");
                 segundoNumero= leerDouble(sc, "Introduce el segundo numero");
                 resultado = realizarResta(primerNumero, segundoNumero);
                System.out.println("El resultado de la resta es "+ resultado);
                break;
            case 3:
                 primerNumero = leerDouble(sc, "Introduce el primer numero");
                 segundoNumero= leerDouble(sc, "Introduce el segundo numero");
                 resultado = realizarMultiplicacion(primerNumero, segundoNumero);
                System.out.println("El resultado de la multiplicacion es "+ resultado);
                break;
            case 4:
                 primerNumero = leerDouble(sc, "Introduce el primer numero");
                 segundoNumero= leerDouble(sc, "Introduce el segundo numero");
                 resultado = realizarDivision(primerNumero, segundoNumero);
                 if (segundoNumero != 0){
                 System.out.println("El resultado de la division es "+ resultado);
                 }
                 else{
                 System.out.println("No puede haber un 0 en la division");
                 }
                break;

            default:
                System.out.println("Decision invalida");
                break;
        }


    }

    /**
     * Metodo para leer la opcion que el usuario tomará en el programa
     * @param sc Extension de scanner para leer inputs del usuario
     * @param mensaje Nos permite escribirle al usuario, en este caso le dimos un menu de opciones
     * @return Nos devuelve la decision que tomo el usuario del menu de opciones
     */
    public static int leerCaso(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo para leer numeros no enteros, necesario para realizar las operaciones
     * @param sc Lee el numero no entero que al que el usuario quiere operar
     * @param mensaje Nos permite pedirle al usuario el numero que va a introducir
     * @return Nos devuelve el numero del usuario, nos pemite usarlo para las operaciones
     */
    public static double leerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo para sumar los numeros introducidos por el usuario
     * @param primerNumero Llamamos el primer numero que le pedimos al usuario
     * @param segundoNumero Llamamos el segundo numero que le pedimos al usuario
     * @return Nos devuelve el resultado de la suma entre los dos numeros
     */
    public static double realizarSuma(double primerNumero, double segundoNumero){
        return primerNumero+segundoNumero;
    }

    /**
     * Metodo para restar los numeros introducidos por el usuario
     * @param primerNumero Llamamos el primero numero que le pedimos al usuario
     * @param segundoNumero Llamamos el segundo numero que le pedimos al usuario
     * @return Nos devuelve el resultado de la resta entre los dos numeros
     */
    public static double realizarResta(double primerNumero, double segundoNumero){
        return primerNumero-segundoNumero;
    }

    /**
     * Metodo para multiplicar los numeros introducidos por el usuario
     * @param primerNumero Llamamos al primer numero que le pedimos al usuario
     * @param segundoNumero Llamamos al segundo numero que le pedimos al usuario
     * @return Nos devuelve el resultado de la multiplicacion entre los dos numeros
     */
    public static double realizarMultiplicacion(double primerNumero, double segundoNumero){
        return primerNumero*segundoNumero;
    }

    /**
     * Metodo para dividir los dos numeros introducidos por el usuario
     * @param primerNumero Llamamos al primer numero que le pedimos al usuario
     * @param segundoNumero Llamamos al segundo numero que le pedimos al usuario
     * @return Nos devuelve el resultado de la division entre los dos numeros
     */
    public static double realizarDivision(double primerNumero, double segundoNumero){
        return primerNumero/segundoNumero;
    }
}





