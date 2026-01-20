import java.util.Scanner;

public class Main {

    public static double DESCUENTO = 0.10;
    public static double UMBRAL_DESCUENTO = 1000.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double subtotal = pedirDouble(sc, "Subtotal: ");
        double total = aplicarDescuentoSiAplica(subtotal, UMBRAL_DESCUENTO);
        System.out.printf("Total a pagar: %.2f%n", total);


    }

    /**
     * Escaneo y leida de todos los double del programa
     *
     * @param sc      Le damos la funcion de scanner para que pueda leer el input del usuario
     * @param mensaje Este parametro nos ayuda a ahorrarnos escribir un print
     * @return Va a devolver el double que introdujo el usuario escaneado
     */
    public static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static double aplicarDescuentoSiAplica(double subtotal, double total) {
        if (subtotal > UMBRAL_DESCUENTO) {
             total = subtotal - (subtotal * DESCUENTO);
        } else if (subtotal <= UMBRAL_DESCUENTO) {
            total = subtotal;
        }
        return total;

    }
}