import java.util.Scanner;

public class InputValidator {
    public InputValidator() {
    }
    Scanner sc = new Scanner(System.in);


    public String leerTextoNoVacio(String mensaje, Scanner sc){
        String value;
        while (true){
            System.out.println(mensaje);
            value = sc.nextLine();
            if (!value.equals("")){
                return value;
            }else {
                System.out.println("No puedes dejar vacío este apartado");
            }

        }
    }


    public int validarID(String mensaje, Scanner sc, int min){
        int value;
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                value = sc.nextInt();

                if (value>min){
                    return value;
                }
                System.out.println("El numero no es mayor a 0");
            }else {
                System.out.println("Eso no es un numero");
                sc.nextLine();
            }
        }
    }


}
