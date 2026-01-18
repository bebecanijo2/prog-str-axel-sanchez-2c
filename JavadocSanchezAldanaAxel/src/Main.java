
import java.util.Scanner;

public class Main{

    public static double PI = 3.14;
    public static double PROPORCION = 1.8;
    public static int PARTIDA = 32;

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int decision = 0;

        do {

            System.out.println("Menu de opciones");
            System.out.println("1.-Calcular IMC\n");
            System.out.println("2.-Calcular area de rectangulo\n");
            System.out.println("3.-Calcular area de circulo\n");
            System.out.println("4.-Convertir grados Celsius a Fahrenheit\n");
            System.out.println("5.-Salir\n");
            decision = leerDecision(sc, "Entre estas opciones elige la operacion que quieres hacer");

            switch (decision) {

                case 1:
                    double pesoKg = obtenerDouble(sc, "Escribe tu peso en kilogramos");
                    double alturaM = obtenerDouble(sc, "Escribe tu altura en metros");
                    double IMC = calcularIMC(pesoKg, alturaM);
                    System.out.println("Tu IMC es de: "+ IMC);
                    break;
                case 2:
                    double baseRec = obtenerDouble(sc, "Escribe de cuanto es la base del rectangulo");
                    double alturaRec = obtenerDouble(sc, "Escribe de cuanto es la altura del rectangulo");
                    double areaRectangulo = calcularRectangulo(baseRec,alturaRec);
                    System.out.println("El area del rectangulo es de; "+areaRectangulo);
                    break;
                case 3:
                    double radioCirculo = obtenerDouble(sc, "Escribe de cuanto es el radio del ciruclo");
                    double areaCirculo = calcularCirculo(radioCirculo, PI);
                    System.out.println("El area del circulo es: "+areaCirculo);
                    break;
                case 4:
                    double gradosCelsius = obtenerDouble(sc, "Escribe cuantos grados Celsius convertiras");
                    double conversion = conversionFahrenheit(gradosCelsius, PROPORCION, PARTIDA);
                    System.out.println("Los grados Fahrenheit son: "+conversion);
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Decision invalida");
            }

        }   while (decision != 5) ;

    }


    /**
     * Lectura de la decision del menu
     * @param sc Le damos la funcion de leer al metodo, le permitimos la capacidad de leer entradas
     * @param mensaje Le damos la capacidad de arrojar un texto al usuario para describirle que es lo que quiere hacer
     * @return
     */
    public static int leerDecision(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }


    /**
     * Lectura de todos los doubles del codigo
     * @param sc Le damos la funcion de leer al metodo, le permitimos la capacidad de leer entradas
     * @param mensaje Le damos la capacidad de arrojar un texto al usuario para describirle que es lo que quiere hacer
     * @return
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }


    /**
     * Formula para calcular el indice de masa corporal
     * @param pesoKG Es el peso del usuario, pedido en kilogramos
     * @param alturaM Es la altura del usuario, pedida en metros
     * @return
     */
    public static double calcularIMC(double pesoKG, double alturaM){
        return pesoKG/(alturaM*alturaM);
    }


    /**
     * Formula para calcular el area del rectangulo
     * @param baseRec Es la base del rectangulo
     * @param alturaRec Es la altura del rectangulo
     * @return
     */
    public static double calcularRectangulo(double baseRec, double alturaRec){
        return alturaRec*baseRec;
    }


    /**
     * Formula para calcular el area del circulo
     * @param radioCirculo Variable del radio del circulo que introducirá el usuario
     * @param PI Es la constante de PI
     * @return
     */
    public static double calcularCirculo(double radioCirculo, double PI){
        return PI*(radioCirculo*radioCirculo);
    }


    /**
     * Formula para la conversion de grados Celsius a Fahrenheit
     * @param gradosCelsius Son los grados celsius que el usuario quiere convertir a farhenheit
     * @param PROPORCION Es la constante 1.8 necesaria para la conversion
     * @param PARTIDA Es la constante 32, la que suma al final la ecuacion
     * @return
     */
    public static double conversionFahrenheit(double gradosCelsius, double PROPORCION, int PARTIDA){
        return (PROPORCION*gradosCelsius)+PARTIDA;
    }
}