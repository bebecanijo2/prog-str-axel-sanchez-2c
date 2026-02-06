import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InputValidator inputvalidator = new InputValidator();
        ShippingCalculator shippingCalculator = new ShippingCalculator();
        Ticket ticket = new Ticket();

        double pesoKg= inputvalidator.leerDoubleEnRango("Ingresa el peso en kg", sc, 0.1, 50.0);
        int distanciaKm = inputvalidator.leerIntEnRango("Ingresa la distancia en km", sc, 1, 2000);
        int tipoServicio = inputvalidator.leerIntEnRango("Ingresa el tipo de servicio 1)Estandar  2)Express", sc, 0, 3);
        boolean esZonaRemota = inputvalidator.leerBoolean("El destino esta en zona remota? true/false", sc);

        double subtotal = shippingCalculator.calcularSubtotal(pesoKg, distanciaKm, tipoServicio, esZonaRemota);
        double iva = shippingCalculator.calcularIVA(subtotal);
        double total = shippingCalculator.calcularTotal(subtotal, iva);


        ticket.imprimirTicket(pesoKg, distanciaKm, esZonaRemota, subtotal, total);


    }
}