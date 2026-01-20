import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double subtotal = pedirDouble(sc, "Subtotal: ");
        double total = subtotal;

        System.out.printf("Total a pagar: %.2f%n", total);
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}