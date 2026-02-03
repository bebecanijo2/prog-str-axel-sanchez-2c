import java.util.Scanner;

public class Main {

    public static double IVA = 0.16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = pedirDouble(scanner, "Subtotal: ");
        double total = calcularIva(subtotal);


        System.out.printf("Total a pagar: %.2f%n", total);
    }

    /**
     * Funcion para leer los inputs de los precios
     * @param scanner Nos permite leer el input del usuario
     * @param mensaje Nos permite describirle al usuario lo que tiene que introducir con un mensaje
     * @return Nos devuelve el precio leido
     */
    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    /**
     * Funcion para calcular el precio con el IVA incluido
     * @param subtotal Es el precio original del producto x
     * @return Nos devuelve la cantidad con el IVA ya incluido
     */
    public static double calcularIva(double subtotal){
        return subtotal+(subtotal*IVA);
    }
}