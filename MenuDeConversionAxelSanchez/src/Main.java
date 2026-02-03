import java.util.Scanner;

public class Main {

    public static double PROPORCION = 1.8;
    public static double PARTIDA = 32;
    public static double CONSTANTE_MILLAS = 1.609;
    public static double CONSTANTE_KM = 0.621;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cantidadAConvertir;
        double resultado;
        int decision = 0;
        int vecesCAF = 0;
        int vecesFAC = 0;
        int vecesKmAM = 0;
        int vecesMAKm = 0;

        do {
            System.out.println("Elige qué quieres hacer\n");
            decision = leerDecision("1.-Convertir C° a F°\n 2.-Convertir C° a F°\n 3.-Convertir km a millas\n 4.-Convertir millas a km\n 5.-SALIR",sc);
            if (decision>=1 && decision<=5){
                switch (decision){
                    case 1:
                        cantidadAConvertir=obtenerDoubles("Cuantos C° vas a convertir a F°",sc);
                        resultado = conversionAFahrenheit(cantidadAConvertir);
                        System.out.println("El resultado es: "+resultado);
                        vecesCAF++;
                        break;

                    case 2:
                        cantidadAConvertir=obtenerDoubles("Cuantos F° vas a convertir a C°", sc);
                        resultado = conversionACelsius(cantidadAConvertir);
                        System.out.println("El resultado es: "+resultado);
                        vecesFAC++;
                        break;

                    case 3:
                        cantidadAConvertir=obtenerDoubles("Cuantos km vas a convertir a millas",sc);
                        resultado = conversionAMillas(cantidadAConvertir);
                        System.out.println("El resultado es: "+resultado);
                        vecesKmAM++;
                        break;

                    case 4:
                        cantidadAConvertir=obtenerDoubles("Cuantas millas vas a convertir a km",sc);
                        resultado = conversionAKilometros(cantidadAConvertir);
                        System.out.println("El resultado es: "+resultado);
                        vecesMAKm++;
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        break;

                }

            }else {
                System.out.println("Opcion invalida");
            }
        }while(decision!=5);
        System.out.println("Veces en las que se convirtio C° a F°: "+vecesCAF);
        System.out.println("Veces en las que se convirtio F° a C°: "+vecesFAC);
        System.out.println("Veces en las que se convirtio km a millas: "+vecesKmAM);
        System.out.println("Veces en las que se convirtio millas a km: "+vecesMAKm);
    }

    /**
     * Metodo para leer doubles introducidos
     * @param mensaje Le especificamos al usuario lo que tiene que introducir
     * @param sc Leemos el input del usuario
     * @return Obtenemos el input leido listo para ser utilizado
     */
    public static double obtenerDoubles(String mensaje,Scanner sc) {
        while (true) {
            try {

                System.out.println(mensaje);
                return sc.nextInt();
            } catch (Exception errorLetras) {

                System.out.println("Solo escribe numeros");
                sc.next();
            }
        }
    }
    /**
     * Metodo para leer la decision del usuario
     * @param mensaje Le damos las opciones al usuario para que elija alguna
     * @param sc Leemos su decision
     * @return Obtenemos la decision leida para posteriormente pasarlo al apartado elegido
     */
    public static int leerDecision(String mensaje, Scanner sc) {
        while (true) {
            try {

                System.out.println(mensaje);
                return sc.nextInt();
            } catch (Exception errorLetras) {

                System.out.println("Selecciona un número del 1 al 5");
                sc.next();
            }

        }
    }
    /**
     * Metodo para convertir C° a F°
     * @param cantidadAConvertir Es la cantidad que el usuario desea convertir
     * @return Nos devuelve el resultado de la conversion hecha a partir de la formula
     */
    public static double conversionAFahrenheit(double cantidadAConvertir){
        return (PROPORCION*cantidadAConvertir)+PARTIDA;
    }

    /**
     * Metodo para convertir F° a C°
     * @param cantidadAConvertir Es la cantidad que el usuario desea convertir
     * @return Nos devuelve el resultado de la conversion hecha a partir de la formula
     */
    public static double conversionACelsius(double cantidadAConvertir){
        return (cantidadAConvertir-PARTIDA)/PROPORCION;
    }

    /**
     * Metodo para convertir km a millas
     * @param cantidadAConvertir Es la cantidad que el usuario desea convertir
     * @return  Nos devuelve el resultado de la conversion hecha a partir de la formula
     */
    public static double conversionAMillas(double cantidadAConvertir){
        return cantidadAConvertir/CONSTANTE_MILLAS;
    }

    /**
     * Metodo para convertir millas a km
     * @param cantidadAConvertir Es la cantidad que el usuario desea convertir
     * @return Nos devuelve el resultado de la conversion hecha a partir de la formula
     */
    public static double conversionAKilometros(double cantidadAConvertir){
        return cantidadAConvertir/CONSTANTE_KM;
    }
}