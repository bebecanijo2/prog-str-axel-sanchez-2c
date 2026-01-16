import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static double BAJO= 18.5;
    public static double MEDIO=25;
    public static double ALTO=30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoKG = obtenerDouble(sc, "Ingresa el peso en (KG)");
        double alturaM = obtenerDouble(sc, "Ingresa la altura en (M)");
        double IMC = calcularIMC(pesoKG,alturaM);
        System.out.println("El IMC es:"+IMC);
        System.out.println("Clasificación");
        String clacificacionIMC = clasificarIMC(IMC);
        System.out.println("Clasificación:"+clacificacionIMC );

    }

    /**
     * Metodo para obtener un numero double desde la consola
     * @param sc -> objeto previamente declarado
     * @param mensaje -> mensaje a mostrar en consola
     * @return
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo para calcular y devolver el IMC con formula peso/altura*altura
     * @param pesoKG -> expresado en KG (70)
     * @param alturaM -> expresado en M (1.69)
     * @return -> double IMC
     */
    public static double calcularIMC(double pesoKG,double alturaM){
        return  pesoKG/(alturaM*alturaM);
    }

    /**
     * Devuelve la clasificacion basada en el IMC
     * @param IMC -> previamente calculado
     * @return -> String clasificacion
     */
    public static String clasificarIMC(double IMC){
        if(IMC<BAJO) return "PESO BAJO";
        else if (IMC<MEDIO) return "MEDIO";
        else if (IMC<ALTO) return "SOBRE PESO";
        else return "OBESIDAD";

        }
        {

        }
    }
}
