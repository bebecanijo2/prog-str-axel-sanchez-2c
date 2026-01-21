import java.util.Scanner;

public class Main {

    public static double DESCUENTO =0.10;
    public static double UMBRAL_DESCUENTO=1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = pedirDouble(scanner, "Subtotal: ");
        double total = calcularDescuento(subtotal);

        System.out.printf("Total a pagar: %.2f%n", total);
    }

    /**
     * Funcion para leer el precio del producto x del usuario
     * @param scanner Nos permite leer el input del usuario
     * @param mensaje Nos permite darle la instruccion al usuario de que introducir
     * @return Nos devuelve el input leido
     */
    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    /**
     * Funcion para calcular el descuento solo si aplica
     * @param subtotal Es el precio original del producto x
     * @return Nos devuelve el precio con el descuento aplicado
     */
    public static double calcularDescuento(double subtotal){
        if (subtotal>UMBRAL_DESCUENTO) return subtotal-(subtotal*DESCUENTO);
        else return subtotal;
    }
}