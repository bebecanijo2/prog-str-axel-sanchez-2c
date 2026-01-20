import java.util.Scanner;

public class Main {

    public static double IVA = 0.16;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double subtotal = pedirDouble(sc, "Subtotal: ");
        double total = sumaTotal(subtotal,IVA);
        System.out.printf("Total a pagar: %.2f%n", total);
    }

    /**
     * Escaneo y leida de todos los double del programa
     * @param sc Le damos la funcion de scanner para que pueda leer el input del usuario
     * @param mensaje Este parametro nos ayuda a ahorrarnos escribir un print
     * @return Va a devolver el double que introdujo el usuario escaneado
     */
    public static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    /**
     * Suma del precio con el IVA incluido
     * @param subtotal Es la cantidad original, el valor del producto a comprar
     * @param total Es la cantidad original sumada al IVA
     * @return Nos va a devolver la cantidad ya calculada
     */
    public static double sumaTotal(double subtotal, double total){
        return total = subtotal+(subtotal*IVA);
    }
}