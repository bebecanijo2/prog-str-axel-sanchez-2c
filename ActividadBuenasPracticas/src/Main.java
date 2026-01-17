import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Este programa suma todos los números enteros desde el 1 hasta el numero x que tu ingreses");
        int numeroMeta = pedirEntero(sc, "Introduce un número");
        int resultado = sumarHastaN(numeroMeta);
        System.out.println("El resultado de la suma es: "+resultado);

    }

    /**
     * Metodo para leer el numero input del usuario
     * @param sc Llamamos al metodo Scanner
     * @param mensaje Imprimimos la instrucción inicial al usuario, le pedimos el input
     * @return
     */
    public static int pedirEntero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo para realizar la suma de los numeros
     * @param numeroMeta Numero input del usuario
     * @return
     */
    public static int sumarHastaN(int numeroMeta){
        int sumaTotal = 0;
        for(int numeroPrincipio = 1; numeroPrincipio <= numeroMeta; numeroPrincipio++){
            sumaTotal = sumaTotal + numeroPrincipio;

        }
        return sumaTotal;
    }
}

