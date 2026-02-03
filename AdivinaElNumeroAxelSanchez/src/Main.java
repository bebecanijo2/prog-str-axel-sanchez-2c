import java.util.Random;
import java.util.Scanner;

public class Main {
    static int datoNoNumerico = 0;
    static int fueraDeRango = 0;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minimo = 1;
        int maximo = 100;
        int intentos = 0;
        int limiteIntentos = 7;
        boolean gano = false;
        int secreto = random.nextInt(100)+1;
        System.out.println(secreto);
        System.out.println("Adivina el numero, escribe un numero del 1 al 100 " + "tienes " +limiteIntentos+ " intentos");

        while (intentos<limiteIntentos){
            int numero = obtenerNumeroValido("Intento:"+(intentos+1),sc,minimo,maximo);
            intentos++;
            if (numero==secreto){
                System.out.println("Felicidades, ganaste en el intento :"+intentos);
                gano = true;
                break;
            } else if (numero>secreto) {
                System.out.println("El numero secreto es menor a "+numero);
            }else {
                System.out.println("El numero secreto es mayor a "+numero);
            }
        }
        if (!gano){
            System.out.println("Perdiste, el numero secreto era "+secreto);

        }
        System.out.println("Veces en las que el usuario ingreso un dato no numerico "+datoNoNumerico);
        System.out.println("Veces en las que el usuario ingreso un dato fuera de rango "+fueraDeRango);

    }
    public static int obtenerNumeroValido(String mensaje, Scanner sc, int minimo, int maximo){
        int entrada;
                while(true){
                    System.out.println(mensaje);

                    if (sc.hasNextInt()){
                        entrada=sc.nextInt();

                        if (entrada>=minimo && entrada<=maximo){
                            return entrada;
                        }
                        System.out.println("El numero ingresado esta fuera de rango 1-100");
                        fueraDeRango ++;

                    }else {
                        System.out.println("El dato ingresado no es numerico");
                        datoNoNumerico++;
                        sc.next();
                    }
                }
    }
}
