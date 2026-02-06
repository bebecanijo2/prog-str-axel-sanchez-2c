public class Ticket {

    public Ticket(){}

    public void imprimirTicket(double pesoKg, int distanciaKm, boolean esZonaRemota, double subtotal, double total) {

        System.out.println("Ticket del paquete:");
        System.out.println("Peso del paquete: " + pesoKg);
        System.out.println("Distancia: " + distanciaKm);
        System.out.println("Zona remota: " + esZonaRemota);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total final: " +total);
    }
}

